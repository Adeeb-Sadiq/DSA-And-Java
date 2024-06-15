package questions.recursion.arrayQuestions;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(isSorted(arr, 0));
    }

    public static boolean isSorted(int arr[], int pointer) {
        if(pointer == arr.length - 1) {
            return true;
        }
        return arr[pointer] <= arr[pointer + 1] && isSorted(arr, pointer + 1);
    }
}
