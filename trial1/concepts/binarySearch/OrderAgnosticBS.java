package trial1.questions.concepts.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] a = {1,5,11,14,22,32};
        int[] d = {32,22,14,11,5,1};
        int[] s = {22,22,22,22,22,22,22,22,22,22,22};
        int t = 1;
        System.out.println(osbs(a,t));
        System.out.println(osbs(d,t));
        System.out.println(osbs(s,t));
    }

    public static int osbs(int[] arr, int tar) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        if(arr[start] < arr[end]){
            while(start <= end) {
                mid = start + (end - start) / 2;
                if(tar < arr[mid]) {
                    end = mid - 1;
                } else if (tar > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }

        if(arr[start] >= arr[end]) {
            while (start <= end) {
                mid = start + (end - start) / 2;
                if(tar < arr[mid]) {
                    start = mid + 1;
                } else if (tar > arr[mid]) {
                    end = end - 1;
                } else {
                    return mid;
                }

            }
        }

        return -1;
    }
}
