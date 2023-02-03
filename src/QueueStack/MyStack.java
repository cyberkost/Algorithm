package QueueStack;

public class MyStack {

    private int[] array;
    private int count;

    public MyStack(int size) {
        array = new int[size];
        count = 0;
    }

    public void push(int element) {
        if (count == array.length) throw new RuntimeException("Stack is full");
        array[count++] = element;
    }

    public int pop() {
        if (count == 0) throw new RuntimeException("Stack is empty");
        return array[--count];
    }

    public int peek() {
        if (count == 0) throw new RuntimeException("Stack is empty");
        return array[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int search(int element) {
        int countOfNum = count + 1;
        int index = -1;
        if (!isEmpty()) {
            for (int i = 0; i < count; i++) {
                countOfNum--;
                if (element == array[i]) {
                    index = countOfNum;
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {

        MyStack myStack = new MyStack(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.isEmpty());
        System.out.println("peek: " + myStack.peek());

        int num1 = 4;
        int num2 = 2;
        int num3 = 1;
        int num4 = 0;
        System.out.println("Position from peek in stack of number \"" + num1 + "\": " + myStack.search(num1));
        System.out.println("Position from peek in stack of number \"" + num2 + "\": " + myStack.search(num2));
        System.out.println("Position from peek in stack of number \"" + num3 + "\": " + myStack.search(num3));
        System.out.println("Position from peek in stack of number \"" + num4 + "\": " + myStack.search(num4));

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
        System.out.println("Position from peek in stack of number \"" + num1 + "\": " + myStack.search(num1));
        System.out.println("Position from peek in stack of number \"" + num2 + "\": " + myStack.search(num2));
    }
}


