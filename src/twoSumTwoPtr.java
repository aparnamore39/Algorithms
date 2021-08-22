import java.util.Arrays;

public class twoSumTwoPtr {

    public static boolean twoSum(int[] nums, int target) {

        int i =0;
        int j = nums.length-1;
        int sum;

        while (i<j)
        {
            sum = nums[i]+nums[j];

            if(target == sum)
            {
                return true;
                //return new int[] {nums[i],nums[j]};
            }
            else
            {
                if (sum > target) j--;
                else i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {5,3,1,9};
        Arrays.sort(nums);
        System.out.println(twoSum(nums, 4));

    }

}
