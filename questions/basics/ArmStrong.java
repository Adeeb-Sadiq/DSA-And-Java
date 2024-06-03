package questions.basics;

public class ArmStrong {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            boolean ans = isarm(i);
            if(ans == true){
                System.out.println(i);
            }
        }
    }

    static boolean isarm(int num){
        int sum = 0;
        int original = num;
        while(num>0){
            int rem = num % 10;
            sum = sum + rem*rem*rem;
            num = num / 10;
        }
        if (sum == original){
            return true;
        }
        return false;
    }
}
