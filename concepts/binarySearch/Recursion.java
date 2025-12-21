package trial1.questions.concepts.binarySearch;

public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21};
        int target = 15;
        int ans = recursionBinarySearch(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    public static int recursionBinarySearch(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(target < arr[mid]) {
            return recursionBinarySearch(arr, target, start, mid - 1);
        }

        return recursionBinarySearch(arr, target, mid + 1, end);
    }
}
