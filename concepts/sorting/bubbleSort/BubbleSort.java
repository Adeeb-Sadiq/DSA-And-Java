package concepts.sorting.bubbleSort;

import java.util.Arrays;

// aka: sinking sort, exchange sort
// has stability
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,1,0,8,7,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}
