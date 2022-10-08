package chapter01;

public class removeElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
             if(nums.length==0) return 0;
             int slow=0;
             int fast=0;
             while(fast<nums.length){
                 if(val!=nums[fast]){
                     nums[slow]=nums[fast];
                     slow++;
                 }
                 fast++;
             }
             return slow;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,4,5};
        Solution solution =new removeElement().new Solution();
        System.out.println(solution.removeElement(nums,3));

    }
}
