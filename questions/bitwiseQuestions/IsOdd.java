package questions.bitwiseQuestions;

import java.util.Scanner;

public class IsOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println(isOdd(sc.nextInt()));
        }
    }

    public static boolean isOdd(int a) {
        return (a & 1) == 1;
    }
}
