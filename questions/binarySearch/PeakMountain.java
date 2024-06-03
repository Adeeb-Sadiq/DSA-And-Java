package questions.binarySearch;

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {12,20,8,7,6,5,4,3,2,1,0};
        int[] arr2 = {9,10,11,12,14,16,20,8,7,6,5,4,3,2,1,0};
        int[] arr3 = {1,2,3,4,5,0};
        int ans = peak(arr2);
        System.out.println("Returning the peak index " + ans);
        System.out.println(arr2[ans]);
    }

    private static int peak(int[] arr) {
        int start = 0, end = arr.length - 1;
        int mid;

        while(start <= end) {
            mid = (start + end) / 2;
            if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }  else if (arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            }
        }

        return start;
    }
}
