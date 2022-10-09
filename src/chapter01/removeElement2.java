package chapter01;

public class removeElement2 {
    class Solution {
        public int removeElement(int[] nums, int val) {
            if (nums.length == 0) return 0;
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                if (nums[left] == val) {
                    nums[left] = nums[right];
                    right--;
                } else {
                    left++;
                }
            }
            return right + 1;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,4,5};
        Solution solution =new removeElement2().new Solution();
        System.out.println(solution.removeElement(nums,3));

    }
}
