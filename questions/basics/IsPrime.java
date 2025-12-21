package trial1.questions.basics;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            System.out.println(isprime(num));
        }
    }

    public static boolean isprime(int num) {
        if(num<=1){
            return false;
        }
        int count = 2;

        while(count*count <= num) {
            if(num%count == 0){
                return false;
            }
            count++;
        }
        return true;
    }
}
