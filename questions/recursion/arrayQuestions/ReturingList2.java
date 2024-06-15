package questions.recursion.arrayQuestions;

import java.util.ArrayList;

public class ReturingList2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        System.out.println(findAllIndex(arr, 4, 0));
    }

    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ans = findAllIndex(arr, target, index + 1);
        list.addAll(ans);

        return list;
    }
}
