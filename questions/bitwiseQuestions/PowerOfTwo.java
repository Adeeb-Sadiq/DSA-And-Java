package questions.bitwiseQuestions;

public class PowerOfTwo {
    public static void main(String[] args) {
        int a = 32;
        System.out.println(ispot(a));
    }

    private static boolean ispot(int n) {
        if(n == 0) return false;
        return (n & (n-1)) == 0;
    }
}
