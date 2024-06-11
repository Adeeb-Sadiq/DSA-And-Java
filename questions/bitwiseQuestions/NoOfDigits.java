package questions.bitwiseQuestions;

public class NoOfDigits {
    public static void main(String[] args) {
        int a = 8;
        int base = 2; // binary
        System.out.println(nod(a, base));
    }

    private static int nod(int n, int base) {
        return (int)((Math.log(n) / Math.log(base)) + 1);
    }
}
