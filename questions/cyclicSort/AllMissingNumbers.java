package questions.cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// leetcode 448
// asked in google
public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = allMissingNumbers(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    public static List<Integer> allMissingNumbers(int[] nums) {
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
                ans.add(j+1);
            }
        }
        return ans;
    }
}
