package homework_12_01_2022;

// Задачки со звёздочкой - вычислить сложность в лучшем и худшем случае.

//   time complexity O(n + n * n / n)
//   space complexity O(1)

public class Main3 {
    void test5(int n) {
        int a = 0, i = n;
        while (i > 0) {
            a += i;
            i /= 2;
        }
    }

    //   time complexity O(n - n * n - n)
    //   space complexity O(1)

    void method(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
    }

    //   time complexity O(n^2+5m-5) ~ O(n^2)
    //   space complexity O(1)

    void method2(int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 1; j + n / 2 <= n; j++) {
                for (int k = 1; k <= n; k = k * 2) {
                    System.out.println("I am expert!");
                }
            }
        }
    }

    //   time complexity O(n^2 + n + n)
    //   space complexity O(1)

    void method3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j = j + i) {
                System.out.println("I am expert!");
            }
        }
    }
}
