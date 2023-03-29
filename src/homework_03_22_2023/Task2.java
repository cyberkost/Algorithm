package homework_03_22_2023;

// Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
// Массив 1 - 100 112 256 349 770
// Массив 2 - 72 86 113 119 265 445 892
// к = 7
// Вывод : 256
// Окончательный отсортированный массив -
// 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
// 7-й элемент этого массива равен 256.

public class Task2 {
    public static int findElement(int[] arr1, int[] arr2, int k) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, index = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[index++] = arr1[i++];
            } else {
                merged[index++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            merged[index++] = arr1[i++];
        }
        while (j < arr2.length) {
            merged[index++] = arr2[j++];
        }
        return merged[k - 1];
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        System.out.println(findElement(arr1, arr2, k));
    }
}
