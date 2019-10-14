package sorting;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

/**
 * Created by grigort on 10/31/2018.
 */
public class Sorting {
    public static void kSortedArraySort(int [] arr,int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>(k);
        IntStream.rangeClosed(0,k).forEach(i -> heap.add(arr[i]));
        int i = 0;
        int j = k+1;
        while (!heap.isEmpty()){
            arr[i++] = heap.remove();
            if(j < arr.length){
                heap.add(arr[j++]);
            }
        }
    }
}
