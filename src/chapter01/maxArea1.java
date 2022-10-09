package chapter01;

public class maxArea1 {
    class Solution {
        public int maxArea(int[] height) {
            int left=0;
            int right=height.length-1;
            int ans=0;
            while(left<right){
                int area=Math.min(height[left],height[right])*(right-left);
                ans=Math.max(ans,area);
                if(height[left]<=height[right]){
                    left++;
                }else{
                    right--;
                }

            }
            return ans;
        }
    }
    public static void main(String[] args) {
        int[] ans={1,8,6,2,5,4,8,3,7};
        Solution solution =new maxArea1().new Solution();
        System.out.println(solution.maxArea(ans));
    }
}
