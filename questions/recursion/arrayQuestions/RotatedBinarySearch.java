package trial1.questions.recursion.arrayQuestions;

import java.util.Scanner;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        Scanner sc = new Scanner(System.in);
        while (true) {
            int target = sc.nextInt();
            System.out.println(rbs(arr, target, 0, arr.length - 1));
        }
    }

    public static int rbs(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        if(arr[start] <= arr[mid]) {
            if(target < arr[mid] && target >= arr[start]) {
                return rbs(arr, target, start, mid - 1);
            } else {
                return rbs(arr, target, mid + 1, end);
            }
        }
        if(target > arr[mid] && target <= arr[end]) {
            return rbs(arr, target, mid + 1, end);
        }

        return rbs(arr, target, start, mid - 1);
    }
}
