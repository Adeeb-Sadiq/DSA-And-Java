package trial1.questions.concepts.array;

public class Array2d {
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40,66},
                {15,25,35,45},
                {28,29,37,49,77},
                {33,34,38,50}
        };
        
        // printing the array
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
