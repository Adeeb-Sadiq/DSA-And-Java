package trial1.questions.concepts.binarySearch2D;

import java.util.Arrays;
// SOME ISSUE WITH THIS form video
public class SortedMatrixIssue {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9,10,11,12},
                {13,14,15,16}
        };

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[] ans = search(arr, 5);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] binarySearch(int[][] matrix, int row, int start, int end, int target) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }

        return new int[]{-1, -1};
    }

    public static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1) {
            binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rstart = 0;
        int rend = rows - 1;
        int cmid = cols / 2;

        while(rstart < (rend - 1)) {
            int mid = rstart + (rend - rstart) / 2;

            if(matrix[mid][cmid] < target) {
                rstart = mid;
            } else if (matrix[mid][cmid] > target) {
                rend = mid;
            } else {
                return new int[] {mid, cmid};
            }

        }

        if(matrix[rstart][cmid] == target) {
            return new int[] {rstart, cmid};
        }
        if(matrix[rstart + 1][cmid] == target) {
            return new int[] {rstart + 1, cmid};
        }

        int[] pos = {-1, -1};
        int[] ans = binarySearch(matrix, rstart, 0, cols -1 , target);
        if (ans == pos) {
            ans = binarySearch(matrix, rstart + 1, 0, cols -1 , target);
        }
        return ans;
//        if (target <= matrix[rstart][cmid - 1]) {
//            return binarySearch(matrix, rstart, 0, cmid - 1, target);
//        } else if (target >= matrix[rstart][cmid + 1]) {
//            return binarySearch(matrix, rstart, cmid + 1, cols -1 , target);
//        } else if (target <= matrix[rstart + 1][cmid - 1]) {
//            return binarySearch(matrix, rstart+1, 0, cmid - 1, target);
//        } else {
//            return binarySearch(matrix, rstart + 1, cmid + 1, cols -1 , target);
//        }


    }

}
