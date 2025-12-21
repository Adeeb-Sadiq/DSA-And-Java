package trial1.questions.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(6));
        System.out.println(fiboFormula(6));
    }

    public static int fibo(int n) {
        // base condition
        if(n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo (n - 2);
    }

    public static long fiboFormula(int n) {
        return (long)((Math.pow(((1 + Math.sqrt(5)) / 2) , n) - Math.pow(((1 - Math.sqrt(5)) / 2) , n)) / Math.sqrt(5));
    }

}
