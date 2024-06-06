package questions.patterns;

// patterns - 6, 8
public class Patterns2 {
    public static void main(String[] args) {
        pattern8(5);
    }

    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            int spaces = n - i + 1;
            for (int space = 0; space < spaces; space++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
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
