package hanoi_tower;

import java.util.Stack;

public class HanoiTowerIterative {
    public static void hanoiTower(int numDisks, char from, char to, char temp) {
        // Создаем стеки для стержней
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        // Заполняем первый стек дисками
        for (int i = numDisks; i > 0; i--) {
            stack1.push(i);
        }

        // Если количество дисков четное
        if (numDisks % 2 == 0) {
            while (stack3.size() != numDisks) {
                moveDisk(stack1, stack2, from, temp);
                moveDisk(stack1, stack3, from, to);
                moveDisk(stack2, stack3, temp, to);
            }
        }
        // Если количество дисков нечетное
        else {
            while (stack3.size() != numDisks) {
                moveDisk(stack1, stack3, from, to);
                moveDisk(stack1, stack2, from, temp);
                moveDisk(stack2, stack3, temp, to);
            }
        }
    }

    private static void moveDisk(Stack<Integer> from, Stack<Integer> to, char fromName, char toName) {
        if (!from.isEmpty() && (to.isEmpty() || from.peek() < to.peek())) {
            to.push(from.pop());
            System.out.println("Перемещаем диск со стержня " + fromName + " на стержень " + toName);
        }
    }

    public static void main(String[] args) {
        int numDisks = 4;
        char from = 'A';
        char to = 'C';
        char temp = 'B';
        hanoiTower(numDisks, from, to, temp);
    }
}
