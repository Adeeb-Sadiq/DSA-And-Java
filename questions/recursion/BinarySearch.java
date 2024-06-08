package questions.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(Arrays.toString(arr));
            System.out.println(search(arr, sc.nextInt(), 0, arr.length - 1));
        }

    }

    public static int search(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if(arr[mid] == target) {
            return mid;
        }

        if(target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        }

        return search(arr, target, mid + 1, end);
    }
}
