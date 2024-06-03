package questions.cyclicSort;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {0,1,3,2,4};
        int ans = firstMissingPositive(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1) {
                return j+1;
            }

        }

        if(nums.length == 1) {
            if(nums[0] == 1) {
                return 2;
            }
        }

        return nums.length + 1;
    }
}
