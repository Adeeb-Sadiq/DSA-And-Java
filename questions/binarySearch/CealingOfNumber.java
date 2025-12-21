package trial1.questions.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CealingOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,6,12,18,24,32};
        while(true) {
            System.out.println(Arrays.toString(arr));
            int tar = sc.nextInt();
            System.out.println(cealingNum(arr, tar));
        }
    }

    private static int cealingNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]) {
            return -1;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }

        return arr[start];
    }

}
