package homework_12_01_2022;
import java.util.Arrays;

// 2) Find the element that appears once in a sorted array
// Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.
// Простое решение состоит в обходе массива слева направо. Поскольку массив отсортирован, мы легко можем найти нужный элемент

public class Main2 {
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 3, 4, 4, 5, 5, 9, 8, 8};
        int number = 9;
        int result = searchNumber(array, number);
        System.out.println(Arrays.toString(array));
        printResult(result);
    }
    private static void printResult(int result) {
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Index element = " + result);
        }
    }
    private static int searchNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
