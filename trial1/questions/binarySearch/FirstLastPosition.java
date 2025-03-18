package trial1.questions.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class FirstLastPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,2,3,3,3,3,3,4,4,5,5,5,6};
        while(true) {
            System.out.println(Arrays.toString(arr));
            int tar = sc.nextInt();
            System.out.println(Arrays.toString(firstLastPosition(arr, tar)));
        }
    }

    private static int[] firstLastPosition(int[] arr, int target) {
        int[] result = {-1, -1};

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                result[0] = mid;
                end = mid - 1;
            }
        }

        if(result[0] != -1) {
            start = 0;
            end = arr.length - 1;

            while(start <= end) {
                int mid = start + (end - start) / 2;
                if(target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    result[1] = mid;
                    start = mid + 1;
                }
            }
        }

        return result;
    }
}
