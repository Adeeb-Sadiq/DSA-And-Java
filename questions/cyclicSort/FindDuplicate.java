package questions.cyclicSort;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {6,4,2,3,5,1,2};
        int ans = findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1) {
                return nums[j];
            }
        }

        return nums.length;
    }
}
