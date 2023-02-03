package QueueStack;

public class MyQueue {
    private int[] arr;      // массив для хранения элементов queue
    private int head;      // head указывает на передний элемент в queue
    private int tail;       // tail часть указывает на последний элемент в queue
    private int capacity;   // максимальная емкость queue
    private int count;      // текущий размер queue

    public MyQueue(int size) {
        arr = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        count = 0;
    }

    public boolean pushToEnd(int data) {
        boolean res = false;
        if (count < capacity) {
            arr[count] = data;
            count++;
            tail++;
            res = true;
        }
        return res;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("The queue is empty!!!");
        }
        int val = arr[head];
        for (int i = 1; i < count; i++) {
            arr[i - 1] = arr[i];
        }
        arr[tail] = 0;
        count--;
        tail--;
        return val;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("The queue is empty!!!");
        }
        return arr[head];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        System.out.println(q.pushToEnd(1));
        System.out.println(q.pushToEnd(2));
        System.out.println(q.pushToEnd(3));
        System.out.println(q.pushToEnd(4));
        System.out.println(q.pushToEnd(5));
        System.out.println("Peek: " + q.peek());

        System.out.println("Size: " + q.size());

        System.out.println("Remove: " + q.remove());
        System.out.println("Remove: " + q.remove());

        System.out.println("Size: " + q.size());
    }
}

