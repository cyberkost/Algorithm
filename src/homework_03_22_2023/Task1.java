package homework_03_22_2023;
//Даны два целых числа x и n, напишите функцию для вычисления x^n
//решение 1 - рекурсивно O(n)
//решение 2 - улучшить решение 1 до O(log n)
public class Task1 {

    public static int solution1(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * solution1(x, n - 1);
    }
    public static int solution2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = solution2(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution1(4,4));
        System.out.println(solution2(4,4));
    }
}
