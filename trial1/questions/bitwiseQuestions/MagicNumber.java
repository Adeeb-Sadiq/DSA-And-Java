package trial1.questions.bitwiseQuestions;

// asked in amazon
public class MagicNumber {
    public static void main(String[] args) {
        magicNumber(3);
    }

    private static void magicNumber(int n) {
        int ans = 0, base = 5;

        while(n > 0) {
            int last = n & 1;
            ans += last * base;

            n = n >> 1;
            base = base * 5;
        }

        System.out.println(ans);
    }
}
