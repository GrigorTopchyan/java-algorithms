package searching;

import java.util.Arrays;

import static java.lang.Integer.min;

/**
 * Created by grigort on 10/30/2018.
 */

public class Searching {

    public static int jumpSearch(int element, int [] arr){
        int length = arr.length;
        int step = (int)Math.sqrt(length);
        int prev = 0;

        while (element > arr[min(step,length) - 1]){
            prev = step;
            step = step + (int)Math.sqrt(length);
            if (prev >= length)
                return -1;
        }

        while (arr[prev] < element){
            prev++;
            if (prev == min(step,length))
                return -1;
        }
        if (arr[prev] == element){
            return prev;
        }
        return -1;
    }

    public static int interpolationSearch(int element,int arr[]){
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int pos = (r - l) * (element - arr[l]) / (arr[r] - arr[l]);
            if (arr[pos] == element){
                return pos;
            }else if(arr[pos] < element){
                l = pos;
            }else {
                r = pos;
            }
        }
        return -1;
    }

    public static int exponentialSearch(int element,int [] arr){
        if(arr[0] == element){
            return 0;
        }
        int i = 1;
        while (i < arr.length && arr[i] <= element){
            i = i * 2;
        }
        return Arrays.binarySearch(arr,i/2, min(arr.length,i),element);
    }
}
