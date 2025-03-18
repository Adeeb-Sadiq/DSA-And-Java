package trial1.questions.recursion.levelOne;

public class OneToN {
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n) {
        if(n > 1) {
            fun(n - 1);
        }
        System.out.println(n);
    }
}
