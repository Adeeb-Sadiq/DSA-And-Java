package questions.bitwiseQuestions;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image){
        for(int[] row: image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image.length - i - 1] ^ 1;
                row[image.length - i - 1] = temp;
            }
        }
        return image;
    }
}
