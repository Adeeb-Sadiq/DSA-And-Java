package trial1.questions.recursion.levelOne;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sod(1342));
    }

    public static int sod(int n) {
        if(n < 10) {
            return n;
        }
        return n % 10 + sod(n / 10);
    }
}
