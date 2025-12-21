package trial1.questions.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FloorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,6,12,18,24,32};
        while(true) {
            System.out.println(Arrays.toString(arr));
            int tar = sc.nextInt();
            System.out.println(floorNum(arr, tar));
        }
    }

    private static int floorNum(int[] arr, int tar) {
        int start = 0;
        int end = arr.length - 1;

        if(tar < arr[start]) {
            return -1;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(tar < arr[mid]) {
                end = mid - 1;
            } else if (tar > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }

        return arr[end];
    }
}
