package chapter01;

public class productExceptSelf1 {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] output = new int[n];
            int[] leftproduct=new int[n];
            leftproduct[0]=1;
            for(int i=1;i<n;i++){
                leftproduct[i]=leftproduct[i-1]*nums[i-1];
            }
            int[] rightproduct=new int[n];
            rightproduct[n-1]=1;
            for(int i=n-2;i>=0;i--){
                rightproduct[i]=rightproduct[i+1]*nums[i+1];
            }
            for(int i=0;i<n;i++){
                output[i]=leftproduct[i]*rightproduct[i];
            }
            return output;
        }
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        Solution solution =new productExceptSelf1().new Solution();
        for(int a: solution.productExceptSelf(nums)){
            System.out.print(" "+a);
        }
    }
}
