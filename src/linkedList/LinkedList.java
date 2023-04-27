package linkedList;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private Node<T> current;

    public LinkedList(Node<T> head) {
        this.head = head;
    }

    public void push(T data) {
        Node<T> node = new Node<>(data, null, null);
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void print() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public void pushToTail(T data) {
        Node<T> node = new Node<>(data, null, null);
        if (head == null) {
            head = node;
            return;
        }
        Node<T> last = getLast();
        last.setNext(node);
    }

    public void remove() {
        if (head != null && head.getNext() != null) {
            Node<T> last = getLast();
            Node<T> preLast = head;
            while (preLast != null && preLast.getNext() != last) {
                preLast = preLast.getNext();
            }
            preLast.setNext(null);
        } else {
            head = null;
        }
    }

    public Node<T> getLast() {
        Node<T> last = head;
        while (last != null && last.getNext() != null) {
            last = last.getNext();
        }
        return last;
    }

    public T get(int i) {
        int tmp = 0;
        if (head.getData() == null) ;
        Node<T> node = head;
        while (node != null && node.getNext() != null && tmp != i) {
            tmp++;
            node = node.getNext();
        }
        if (tmp == i) return node.getData();
        else return null;
    }

    public int size() {
        int tmp = 1;
        Node<T> node = head;
        if (node == null)
            return 0;
        while (node != null && node.getNext() != null) {
            node = node.getNext();
            tmp++;
        }
        return tmp;
    }

    public boolean pushToIndex(int index, T data) {
        if (head == null && index > 0) throw new RuntimeException("List is empty");
        Node<T> nodeNew = new Node<>(data, null, null);
        if (index == 0 && head == null) {
            head = nodeNew;
            tail = nodeNew;
            return true;
        }
        int tmp = 0;
        Node<T> node = head;
        if (index == 0) {
            nodeNew.setNext(node);
            node.setPrev(nodeNew);
            head = nodeNew;
            return true;
        }
        while (node != null && node.getNext() != null && tmp != index - 1) {
            tmp++;
            node = node.getNext();
        }
        if (tmp == index - 1) {
            current = node.getNext();
            node.setNext(nodeNew);
            nodeNew.setPrev(node);
            node = current;
            nodeNew.setNext(node);
            node.setPrev(nodeNew);
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
