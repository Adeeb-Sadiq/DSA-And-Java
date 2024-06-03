package questions.cyclicSort;

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] nums) {
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


        int[] ans = {-1, -1};

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1) {
                ans[0] = nums[j];
                ans[1] = j+1;
            }

        }

        return ans;
    }

}
