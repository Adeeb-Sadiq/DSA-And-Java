package miscellaneous;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        triangle(sc.nextInt());
//        matrix();
//        pattern();
//        sidetri();
//        classic();

    }

    private static void classic() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void sidetri() {
        int a = 4;
        int b = a * 2 - 1;
        int m = 1;
        for (int i = 0; i < b-a; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            m++;
            System.out.println();
        }
        m = a;
        for (int i = 0; i <= b-a; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            m--;
            System.out.println();
        }
    }

    public static void pattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i >= 1 && i <= 3 && j >= 1 && j <= 3){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void triangle(int a) {
        int b = a * 2 - 1;
        int m = b/2;
        int n = m;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(j >= m && j <= n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            m--;n++;
            System.out.println();
        }
    }

    public static void matrix() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  " + i + " " + j + "  ");
            }
            System.out.println();
        }
    }
}