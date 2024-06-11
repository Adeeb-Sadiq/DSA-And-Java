package questions.bitwiseQuestions;

public class UniqueNo {
    public static void main(String[] args) {
        int[] arr = {5,3,3,4,2,5,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n: arr) {
            unique ^= n;
        }

        return unique;
    }
}
