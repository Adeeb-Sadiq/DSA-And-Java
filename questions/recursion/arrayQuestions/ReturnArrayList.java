package questions.recursion.arrayQuestions;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {5,2,9,2,5,1,3,6,9,5};
        ArrayList<Integer> list = new ArrayList<>();
        int target = 5;
        System.out.println(findallIndex(arr, target, 0, list));
    }

    public static ArrayList<Integer> findallIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return findallIndex(arr, target, index + 1, list);
    }
}
