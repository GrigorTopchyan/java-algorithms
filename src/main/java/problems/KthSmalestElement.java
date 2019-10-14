package problems;

import java.util.Arrays;

/**
 * Created by grigort on 11/1/2018.
 */
public class KthSmalestElement {

    public static int kthSmalestElement(int [] arr,int k){
        return kthSmalestElement(arr,0,arr.length - 1,k);
    }

    private static int kthSmalestElement(int [] arr, int l, int r, int k){
        if(k >= 0 && k <= r-l+1) {
            int pos = partition(arr, l, r);
            if (k == pos) {
                return arr[pos-1];
            } else if (k < pos) {
                return kthSmalestElement(arr, l, pos-1, k);
            } else {
                return kthSmalestElement(arr, pos+1, r, k-pos+l-1);
            }
        }
        return Integer.MAX_VALUE;
    }

    private static int partition(int [] arr, int l, int r){
        int pivot = arr[r];
        int k = l;
        for (int i = l; i <= r; i++){
            if (arr[i] <= pivot){
                swap(arr,k,i);
                k++;
            }
        }
        return k-1;
    }

    private static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
