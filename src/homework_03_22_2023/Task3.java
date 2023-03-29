package homework_03_22_2023;

// Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[].
// Ожидаемая временная сложность O(Log n)
// arr[] = {1, 1, 2, 2, 2, 2, 3,}
// x = 2
// Вывод: 4 раза

public class Task3 {
    public static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for (int j : arr) {
            if (j == x) {
                count++;
            } else if (j > x) {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;
        int count = countOccurrences(arr, x);
        System.out.println("Number of occurrences " + count + " times");
    }
}
