package trial1.questions.recursion.levelOne;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(prod(5283));
    }

    public static int prod(int n) {
        if (n < 10) {
            return n;
        }
        return n%10 * prod(n/10);
    }
}
