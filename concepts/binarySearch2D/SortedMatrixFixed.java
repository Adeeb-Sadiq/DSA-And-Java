package trial1.questions.concepts.binarySearch2D;

import java.util.Arrays;
import java.util.Scanner;

// under development
// trying own
public class SortedMatrixFixed {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9,10,11,12},
                {13,14,15,16}
        };
        int target = 11;
//        System.out.println(Arrays.toString(binarSearch(mat, 3, 0, mat[0].length - 1, target)));
        System.out.println(Arrays.toString(search(mat,target)));

        Scanner sc = new Scanner(System.in);
        while (true) {
            target = sc.nextInt();
            System.out.println(Arrays.toString(search(mat,target)));

        }

    }

    public static int[] search(int[][] arr, int target) {
        int rstart = 0;
        int rend = arr.length - 1;
        int cmid = arr[0].length / 2;

        while(rstart < (rend - 1)){
            int mid = rstart + (rend - rstart) / 2;
            if(arr[mid][cmid] < target) {
                rstart = mid;
            } else if (arr[mid][cmid] > target) {
                rend = mid;
            } else {
                return new int[] {mid, cmid};
            }
        }
        if(target <= arr[rstart][arr[0].length-1]){
            return binarSearch(arr, rstart, 0, arr[0].length-1, target);
        } else {
            return binarSearch(arr, rstart + 1, 0, arr[0].length-1, target);
        }

    }

    public static int[] binarSearch(int[][] arr, int row, int start, int end, int target) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[row][mid] < target) {
                start = mid + 1;
            } else if(arr[row][mid] > target) {
                end = mid - 1;
            } else {
                return new int[]{row, mid};
            }
        }

        return new int[]{-1, -1};
    }

}
