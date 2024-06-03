package concepts.binarySearch2D;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        // rowcol matrix - sorted both row and column wise
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        //check last column, if first element is greater than target, eliminate the column
        // check next last column, if first element is lesser than target, eliminate the row

        int[][] mat2 = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9,10,11,12},
                {13,14,15,16}
        };


        int target = 20;
        int[] ans = search(mat, target);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] mat, int target) {
        int r = 0;
        int c = mat[0].length - 1;

        while(r < mat.length && c >= 0) {
            if(mat[r][c] < target) {
                r++;
            } else if (mat[r][c] > target) {
                c--;
            } else {
                return new int[] {r,c};
            }
        }

        return new int[] {-1, -1};
    }
}
