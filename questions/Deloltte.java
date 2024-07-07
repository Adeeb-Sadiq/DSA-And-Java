package questions;

// given an integer n, return the smallest int greater than n,
// the sum of whose digits should be twice as big as sum of digits of n

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Deloltte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        fun(sc.nextInt());
    }

    public static void fun(int n) {
        int sum = sumOfnum(n);
        System.out.println(sum);
        while(true) {
            int ans = sumOfnum(n + 1);
            if(ans == sum * 2) {
                System.out.println(ans);
                System.out.println(n + 1);
                break;
            } else {
                n += 1;
            }
        }
    }

    public static int sumOfnum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += (n%10);
            n = n / 10;
        }
        return sum;
    }
}
