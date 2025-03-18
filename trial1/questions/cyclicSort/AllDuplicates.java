package trial1.questions.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findAllDuplicates(nums);
        System.out.println(ans);
    }

    public static List<Integer> findAllDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }



        List<Integer> ans = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1) {
                ans.add(nums[j]);
            }
        }

        return ans;
    }

}
