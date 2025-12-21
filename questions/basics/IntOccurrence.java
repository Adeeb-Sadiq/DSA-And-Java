package trial1.questions.basics;

public class IntOccurrence {
    public static void main(String[] args) {
        long x = 224444666666L;
        int count = 0;
        int target = 4;

        while (x > 0) {
            long temp = x % 10;
            x = x / 10;
            if(target == temp) {
                count++;
            }
        }

        System.out.println(count);
    }
}
