package trial1.questions.recursion.levelOne;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 56032;
        int base = nthbase(n);
        System.out.println(reverseInt(n, base));
    }

    public static int reverseInt(int n, int base) {
        if (n < 10) {
            return n;
        }
        return reverseInt(n / 10, base - 1) + (n % 10) * (int)(Math.pow(10, base));
    }

    public static int nthbase(int n) {
        int power = 0;
        while(n > 0) {
            n = n/10;
            power++;
        }
        return power - 1;
    }
}
