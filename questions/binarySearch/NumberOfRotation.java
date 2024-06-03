package questions.binarySearch;

// not even a question lol
public class NumberOfRotation {

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        int[] arr2 = {4,5,6,7,0,1,2};
        int[] arr3 = {3,4,5,6,2}; // perfect example
        noOfRotation(arr3);

    }

    public static void noOfRotation(int[] arr) {
        int pivot = peakIndex(arr);
        System.out.println("Pivot times!!!");
        System.out.println("Pivot value: " + pivot);

        int right = pivot + 1;
        System.out.println("NO of rotation from clockwise: " + right);

        int left = arr.length - pivot - 1;
        System.out.println("No of roatation from anticlockwise: " + left);


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

}
