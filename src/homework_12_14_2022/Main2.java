package homework_12_14_2022;

import java.util.Arrays;

// Имея два отсортированных массива размера m и n соответственно,
//         вам нужно найти элемент,
//         который будет находиться на k-й позиции в конечном отсортированном массиве.
// Массив 1 - 100 112 256 349 770
// Массив 2 - 72 86 113 119 265 445 892
// к = 7
// Вывод : 256
// Окончательный отсортированный массив -
// 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
// 7-й элемент этого массива равен 256.
public class Main2 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{100, 112, 256, 349, 770};
        int[] arr2 = new int[]{72, 86, 113, 119, 265, 445, 892};
        int number = 256;
        int[] result = merge(arr1, arr2);

        System.out.println("Result = " + Arrays.toString(result));
        System.out.println(searchNumber(result, number));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];
        int i = 0, j = 0;
        for (; i < n && j < m; ) {
            if (arr1[i] <= arr2[j]) {
                result[i + j] = arr1[i];
                i++;
            } else {
                result[i + j] = arr2[j];
                j++;
            }
        }
        for (int k = i; k < n; k++) {
            result[k + j] = arr1[k];
        }
        for (int k = j; k < m; k++) {
            result[k + i] = arr2[k];
        }
        return result;
    }

    private static int searchNumber(int[] result, int number) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] == number) {
            }
        }
        return number;
    }
}
