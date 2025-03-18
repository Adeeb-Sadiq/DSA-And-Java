package trial1.questions.arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {1,11,432,2542,2905,34348,45};
        evenDigits(arr);
    }

    public static void evenDigits(int[] arr) {
        int temp;
        int digits;
        for(int i: arr) {
            digits = 0;
            temp = i;
            while(i > 0) {
                i = i/10;
                digits++;
            }
            if(digits % 2 == 0){
                System.out.println(temp);
            }
        }

    }
}
