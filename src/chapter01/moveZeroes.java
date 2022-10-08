package chapter01;

public class moveZeroes {
    class Solution {

        public void moveZeroes(int[] nums) {
            if(nums.length==0) return;
             int slow=0;
            for (int fast = 0; fast <nums.length ; fast++) {
                if(nums[fast]!=0){
                    if(slow!=fast){
                        int tmp=nums[slow];
                        nums[slow]=nums[fast];
                        nums[fast]=tmp;
                    }
                    slow++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={1,0,20,3,20,0,5};
        Solution solution =new moveZeroes().new Solution();
        solution.moveZeroes(nums);
        for(int c:nums){
            System.out.print(" "+c);
        }
    }
}
