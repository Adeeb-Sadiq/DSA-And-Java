package questions.recursion.levelOne;

// leetcode 1342

//question: if number even, divide by 2 or else subtract by 1
public class StepsToReduceLeetcode {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper(int n, int s) {
        if(n == 0) {
            return s;
        }
        if(n % 2 == 0) {
            return helper(n / 2, s + 1);
        }
        return helper(n - 1, s + 1);
    }
}
