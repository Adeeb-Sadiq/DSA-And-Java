package trial1.questions.recursion.arrayQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,13,2,44,32};
        int tar = 32;
        System.out.println(linearSearch(arr, tar, 0));
    }

    public static int linearSearch(int[] arr, int tar, int index) {
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == tar) {
            return index;
        }
        return linearSearch(arr, tar, index + 1);
    }
}
