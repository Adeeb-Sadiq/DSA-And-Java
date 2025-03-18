package trial1.questions.basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = fibo(sc.nextInt());
        System.out.println(ans);
    }

    static int fibo(int n) {
        int a = 0, b = 1, count = 2;
        int temp;

        while(count <= n) {
            temp = b;
            b = b + a;
            a = temp;
            count++;
        }


        return b;
    }
}
