package homework_12_08_2022;

// 1) Реализовать алгоритм бинарного поиска, который находит данный key в данном отстортированном массиве
// public int binarySearch(int[] arr, int key)
// Описание алгоритма из лекции
// binary search
// problem: find key in sorted array
// returns index of key
// arr = [1,4,7,9,12,15], key = 9
// take element from the middle 7
// compare to key 7 == 9 false
// compare to key 7 < 9
// if middle element less than key repeat procedure for right half of array
// if middle element more  than key repeat procedure for left half of arr

public class Main {
    public static void main(String[] args) {
        System.out.println("Index of key = " + binarySearch());
    }

    public static int binarySearch() {
        int[] arr = {1, 4, 7, 9, 12, 15};
        int left = 0;
        int right = arr.length - 1;
        int key = 9;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (key < arr[middle]) {
                right = middle - 1;
            } else if (key > arr[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
