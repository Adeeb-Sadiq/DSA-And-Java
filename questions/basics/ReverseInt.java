package trial1.questions.basics;

public class ReverseInt {
    public static void main(String[] args) {
        int x = 4587;
        int result = 0;

        if(x < 0){
            x = x * -1;
        }

        while(x>0){
            int temp = x % 10;
            result = result * 10 + temp;
            x = x / 10;
        }

        System.out.println(result);
    }
}
