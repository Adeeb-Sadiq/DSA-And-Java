package trial1.questions.recursion.levelOne;

public class NtoN {
    public static void main(String[] args) {
        fun(5);
    }

    private static void fun(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        fun(n - 1);
        System.out.print(n + " ");

    }
}
