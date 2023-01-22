package homework_01_19_2023;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(f(5));
        System.out.println("------------");
        System.out.println(ff(5));
    }

    private static int f(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        if (n == 4) return 7;
        return f(n - 1) + f(n - 2) + f(n - 3);
    }

    static int[] ff = new int[3];

    private static int ff(int n) {
        ff[0] = 1;
        ff[1] = 2;
        ff[2] = 4;
        for (int i = 3; i < n; i++) {
            ff[i % 3] = ff[0] + ff[1] + ff[2];
        }
        return ff[(n - 1) % 3];
    }
}
