package concepts.sorting.selectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,1,0,8,7,2};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr, last);
            swapping(arr, maxIndex, last);
        }
    }

    private static void swapping(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    private static int getMaxIndex(int[] arr, int last) {
        int max = 0;

        for (int i = 1; i <= last; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }


}
