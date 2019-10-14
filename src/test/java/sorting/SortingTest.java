package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by grigort on 10/31/2018.
 */
public class SortingTest {
    @Test
    public void radixSortTest(){
        int [] arr = {1,5,4,3,2};
        int [] expected = {1,2,3,4,5};
        RadixSort.sort(arr);
        Assertions.assertArrayEquals(expected,arr);
    }

    @Test
    public void kSortedArraySortTest(){
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        int ecpectedArr[] = {2, 3, 5, 6, 8, 9, 10};
        Sorting.kSortedArraySort(arr,k);
        Assertions.assertArrayEquals(ecpectedArr,arr);

    }
}
