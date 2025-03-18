package trial1.questions.recursion.patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern2(4, 0);
    }

    public static void pattern3(int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            System.out.print("* ");
            pattern3(r, c + 1);
        } else {
            System.out.println();
            pattern3(r - 1, 0);
        }
    }

    public static void pattern2(int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            pattern2(r, c + 1);
            System.out.print("* ");
        } else {
            pattern2(r - 1, 0);
            System.out.println();
        }
    }

}
