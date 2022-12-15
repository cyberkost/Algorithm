package homework_12_14_2022;

// Даны два целых числа x и n, напишите функцию для вычисления x^n
// решение 1 - рекурсивно O(n)
// решение 2 - улучшить решение 1 до O(lon n)?

public class Main1 {
    private int calculate(int x, int n) {
        return power(x, n) / n;
    }
    private int power(int x, int n) {
        if (n == 1) return x;
        return x * calculate(x, n - 1);
    }
}
