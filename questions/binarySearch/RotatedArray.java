package questions.binarySearch;

// this was my own approach to solve.
public class RotatedArray {
    public static void main(String[] args) {
        //           0,1,2,3,4,5 ,6 ,7,8,9,10,11
        int[] arr = {5,6,7,8,9,10,11,0,1,2,3, 4};
        int[] arr1 = {1,3};
//        int[] arr2 = {2,2,2,2,2,2,9,2,2,2}; // will work for repeated values too
        int target = 2;
        int ans = searchInRotated(arr, target);
        System.out.println(ans);
    }

    public static int searchInRotated(int[] arr, int target) {
        int pivot = peakIndex(arr);

        int ans = bs(arr, 0, pivot, target);

        if(ans == -1) {
            return bs(arr, pivot + 1, arr.length - 1, target);
        }

        return ans;
    }

    private static int peakIndex(int[] arr) {
        int start = 0, end = arr.length - 1;
        int mid;

        while(start <= end) {
            mid = (start + end) / 2;

            if(arr[mid] == arr[arr.length - 1]){
                return mid;
            }

            if(arr[mid] < arr[0]) {
                end = mid - 1;
            }  else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }

    public static int bs(int[] arr,int start, int end, int target) {

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
