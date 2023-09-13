package ru.faton.algorithm.binarySearchWithShift;

/**
 * Есть целочисленный массив с уникальными элементами,
 * который отсортировали по возрастанию и затем сдвинули циклически на неизвестное число.
 * Нужно найти в этом массиве элемент х и вернуть его индекс, либо -1, если такого числа нет.
 */
public class Solution {

    //TODO очень сложно, можно упростить
    public static int execute(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;

        while (true) {
            int m = (s + e) / 2;

            if (arr[m] == k) return m;
            if (s >= e) return -1;

            boolean arr_1_sorted = arr[s] < arr[m];

            if (arr_1_sorted) {
                if (k >= arr[s] && k <= arr[m]) {
                    e = m - 1;

                } else {
                    s = m + 1;
                }

            } else {
                if (k >= arr[m + 1] && k <= arr[e]) {
                    s = m + 1;

                } else {
                    e = m - 1;
                }
            }
        }
    }
}
