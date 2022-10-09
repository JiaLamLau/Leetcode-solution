package chapter01;

public class runningSum {
    class Solution {
        public int[] runningSum(int[] nums) {
            int n=nums.length;
            int[] prefixSum =new int[n];
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=0;j<=i;j++){
                    sum+=nums[j];
                }
                prefixSum[i]=sum;
            }
            return prefixSum;
        }
    }

    public static void main(String[] args) {
        int[] ans ={1,2,3,4};
        Solution solution =new runningSum().new Solution();
        //solution.runningSum(ans);
        for(int c: solution.runningSum(ans)){
            System.out.print(" "+c);
        }
    }
}
