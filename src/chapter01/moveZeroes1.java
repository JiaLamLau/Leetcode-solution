package chapter01;

public class moveZeroes1 {
    class Solution {

        public void moveZeroes(int[] nums) {
            if(nums.length==0) return;
             int slow=0;
            for (int fast = 0; fast <nums.length ; fast++) {
                if(nums[fast]!=0){
                    if(slow!=fast){
                        nums[slow]=nums[fast];
                    }
                    slow++;
                }
                fast++;
            }
            for(int i=slow;i<nums.length;i++){
                nums[i]=0;
            }

        }
    }

    public static void main(String[] args) {
        int[] nums={1,0,20,3,20,0,5};
        Solution solution =new moveZeroes1().new Solution();
        solution.moveZeroes(nums);
        for(int c:nums){
            System.out.print(" "+c);
        }
    }
}
