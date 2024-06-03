package questions.cyclicSort;

import java.util.Arrays;

// asked by amazon, leetcode 268
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,0,2};
        int ans = missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans + " is the missing number");
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(i == nums[i] || nums[i] == nums.length) {
                i++;
            } else {
                int index = nums[i];
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j) {
                return j;
            }

        }

        return nums.length;
    }

}
