package trial1.questions.patterns;

//patterns - 28
public class Patterns6 {
    public static void main(String[] args) {
        pattern28(5);
    }

    public static void pattern28(int n) {
        int rows = 2 * n - 1;
        for (int i = 1; i <= rows; i++) {
            int spaces;
            if(i <= n) {
                spaces = n - i;
            } else {
                spaces = i - n;
            }
            for (int space = 0; space < spaces; space++) {
                System.out.print("  ");
            }

            int cols = 2 * n - 1;
            for (int j = 1; j <= cols - 2 * spaces; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
