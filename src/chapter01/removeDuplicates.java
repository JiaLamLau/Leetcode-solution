package chapter01;

public class removeDuplicates {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
            int slow = 0;
            int fast = 1;
            while (fast < nums.length) {
                if (nums[slow] != nums[fast]) {
                    slow++;
                    nums[slow] = nums[fast];
                }
                fast++;
            }
            return slow+1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,4,5};
        Solution solution =new removeDuplicates().new Solution();
        System.out.println(solution.removeDuplicates(nums));

    }
}
