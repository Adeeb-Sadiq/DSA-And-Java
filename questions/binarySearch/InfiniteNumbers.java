package trial1.questions.binarySearch;

import java.util.Scanner;

public class InfiniteNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayOfAllTime = {1,3,5,7,9,11,13,15,17,18,19,21,23,25,27,29,30,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63,65,67,69,70,72,74,76,78,80,90,98,123,125,125,126,128,256,600,650,651,652,656,699,852,895,842,4521,4744,5400,5522,5531,6660,6661,6662,6663,6664,6665,6666,6666,9991,9992,9992,9992,9992,9995};
        int target;

        while(true) {
            target = sc.nextInt();
            System.out.println(findIndex(arrayOfAllTime, target));
        }
    }

    public static int findIndex(int[] arr, int target) {
        int start = 0;
        int end = 1;
        int temp;

        while(target > arr[end]){
            temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return Ibs(arr,target, start, end);
    }

    public static int Ibs(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
