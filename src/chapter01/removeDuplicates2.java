package chapter01;

public class removeDuplicates2 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <=2) return nums.length;
            int slow = 1;
            int fast = 2;
            while (fast < nums.length) {
                if (nums[slow-1] != nums[fast]) {
                    slow++;
                    nums[slow] = nums[fast];
                }
                fast++;
            }
            return slow+1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1};
        Solution solution =new removeDuplicates2().new Solution();
        System.out.println(solution.removeDuplicates(nums));

    }
}
