package questions.cyclicSort;

import java.util.Arrays;

//amazon question leetcode
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,4,5,0,2};
        int ans = missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(j !=  nums[j]) {
                return j;
            }
        }

        return nums.length;
    }
}
