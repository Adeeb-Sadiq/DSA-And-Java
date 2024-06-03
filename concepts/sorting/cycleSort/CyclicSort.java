package concepts.sorting.cycleSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,1,5,3};
        cyclicSortOwn(arr);
        System.out.println(Arrays.toString(arr));

    }
    // tried on my own to make the algorithm, and it works, O(n)
    public static void cyclicSortOwn(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(i == arr[i] - 1) {
                i++;
            } else {
                int index = arr[i] - 1;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }

    }
}
