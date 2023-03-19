package hanoi_tower;

public class HanoiTowerRecursive {
    public static void main(String[] args) {
        int n = 3;
        moveDisks(n, 'A', 'C', 'B');
    }

    public static void moveDisks(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        moveDisks(n-1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        moveDisks(n-1, aux, to, from);
    }
}
