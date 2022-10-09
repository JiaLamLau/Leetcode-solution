package chapter01;

public class runningSum1 {
    class Solution {
        public int[] runningSum(int[] nums) {
            int n=nums.length;
            int[] prefixSum =new int[n];
            prefixSum[0]=nums[0];
            for(int i=1;i<n;i++){
                prefixSum[i]=prefixSum[i-1]+nums[i];
            }
            return prefixSum;
        }
    }

    public static void main(String[] args) {
        int[] ans ={1,2,3,4};
        Solution solution =new runningSum1().new Solution();
        //solution.runningSum(ans);
        for(int c: solution.runningSum(ans)){
            System.out.print(" "+c);
        }
    }
}
