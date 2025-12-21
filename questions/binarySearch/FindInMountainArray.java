package trial1.questions.binarySearch;

import java.util.Scanner;

public class FindInMountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] barr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2};
        int ans = findInPeak(barr, 102);
        System.out.println("Returning the peak index " + ans);








//        int[] arr = {9,10,11,12,14,16,20,8,7,6,5,4,3,2,1,0};
////        System.out.println(osbs(arr, 0, 6, arr.length -1));
//        while (true) {
//            int ans = findInPeak(arr, sc.nextInt());
//            System.out.println("Returning the peak index " + ans);
//        }

    }

    private static int findInPeak(int[] arr, int target) {
        int peakValue = peak(arr);

        int answer = osbs(arr, target, 0, peakValue);
        if (answer == -1) {
            answer = osbs(arr, target, peakValue, arr.length - 1);
        }

        return answer;
    }

    private static int peak(int[] arr) {
        int start = 0, end = arr.length - 1;
        int mid;

        while(start <= end) {
            mid = (start + end) / 2;
            if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }  else if (arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            }
        }

        return start;
    }

    public static int osbs(int[] arr, int tar, int start, int end) {
        int mid;

        if(arr[start] < arr[end]){
            while(start <= end) {
                mid = start + (end - start) / 2;
                if(tar < arr[mid]) {
                    end = mid - 1;
                } else if (tar > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }

        if(arr[start] >= arr[end]) {
            while (start <= end) {
                mid = start + (end - start) / 2;
                if(tar < arr[mid]) {
                    start = mid + 1;
                } else if (tar > arr[mid]) {
                    end = end - 1;
                } else {
                    return mid;
                }

            }
            return -1;

        }
        return -1;

    }

}
