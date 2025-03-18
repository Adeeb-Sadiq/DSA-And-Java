package trial1.questions.recursion.levelOne;

public class CoutnZeros {
    public static void main(String[] args) {
        int n = 340100;
        System.out.println(countZeros(n, 0));
    }

    public static int countZeros(int n, int c) {
        if(n == 0) {
            return c;
        }
        if(n % 10 == 0) {
            return countZeros(n / 10, c + 1);
        }
        return countZeros(n / 10, c);
    }
}
