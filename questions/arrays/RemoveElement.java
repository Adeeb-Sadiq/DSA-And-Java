package questions.arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,5,2,7,1,3,4,2,9,0,3}; //1,4,5,5,7,1,3,4,9,0,3
        int target = 2;
        int ans = removeTarget(arr, target);

        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeTarget(int[] arr, int target) {
        int j = 0;
        int count = 0;

        for (int i: arr) {
            if(i != target) {
                arr[j] = i;
                j++;
            } else {
                count++;
            }
        }

        return arr.length - count;
    }
}
