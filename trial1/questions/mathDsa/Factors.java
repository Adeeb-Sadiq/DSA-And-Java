package trial1.questions.mathDsa;

public class Factors {
    public static void main(String[] args) {
        factors(360);
    }

    private static void factors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " " + n / i + " ");
                count++;
            }
        }
        System.out.printf("%n%d", count * 2);
    }
}
