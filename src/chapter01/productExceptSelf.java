package chapter01;

public class productExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
             int n=nums.length;
             int[] output =new int[n];
             for(int i=0;i<n;i++){
                 int leftproduct=1;
                 for(int j=0;j<i;j++){
                     leftproduct*=nums[j];
                 }
                 int rightproduct=1;
                 for (int j=i+1;j<n;j++){
                     rightproduct*=nums[j];

                 }
                 output[i]=leftproduct*rightproduct;
             }
            return output;
        }

    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        Solution solution =new productExceptSelf().new Solution();
        for(int a: solution.productExceptSelf(nums)){
            System.out.print(" "+a);
        }
    }
}
