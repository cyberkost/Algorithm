package list;

public class MyLinkedList {
    public Node last;
    public Node first;
    public int size;

    public MyLinkedList() {
        this.last = null;
        this.first = null;
        this.size = 0;
    }

    private static class Node {
        private Node next;
        private Node previous;
        private int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public void print() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
        size++;
    }

    public void addAt(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = first;
            if (first != null) {
                first.previous = newNode;
            } else {
                last = newNode;
            }
            first = newNode;
            size++;
        } else if (index == size) {
            add(data);
        } else {
            Node newNode = new Node(data);
            Node current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.previous = current.previous;
            newNode.next = current;
            current.previous.next = newNode;
            current.previous = newNode;
            size++;
        }
    }

    public void remove(int data) {
        Node current = first;
        while (current != null) {
            if (current.data == data) {
                if (current == first) {
                    first = current.next;
                    if (first != null) {
                        first.previous = null;
                    } else {
                        last = null;
                    }
                } else if (current == last) {
                    last = current.previous;
                    last.next = null;
                } else {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                size--;
                return;
            }
            current = current.next;
        }
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = first.next;
            if (first != null) {
                first.previous = null;
            } else {
                last = null;
            }
        } else if (index == size - 1) {
            last = last.previous;
            last.next = null;
        } else {
            Node current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
    }

    private Node getNode(int index) {
        if (index < size / 2) {
            Node current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        } else {
            Node current = last;
            for (int i = size - 1; i > index; i--) {
                current = current.previous;
            }
            return current;
        }
    }

    public void set(int index, int data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = getNode(index);
        node.data = data;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = getNode(index);
        return node.data;
    }

    public void clear() {
        Node current = first;
        while (current != null) {
            Node next = current.next;
            current.next = null;
            current.previous = null;
            current = next;
        }
        first = null;
        last = null;
        size = 0;
    }

    public boolean contains(int data) {
        Node current = first;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}