package sorting;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by grigort on 10/31/2018.
 */
public class RadixSort {
    public static void sort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    private static void countSort(int[] arr, int exp) {
        final int n = arr.length;
        int counts[] = new int[10];
        int resultArr[] = new int[n];
        Arrays.stream(arr).forEach(item -> counts[(item / exp) % 10]++);
        for (int i = 1; i < 10; i++) {
            counts[i] += counts[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            resultArr[i] = arr[counts[(arr[i] / exp) % 10] - 1];
        }
        System.arraycopy(resultArr, 0, arr, 0, n);
    }

}
