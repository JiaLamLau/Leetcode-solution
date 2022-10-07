package chapter01;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class threeSumClosest {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int n = nums.length;


            int ans =nums[0]+nums[1]+nums[2];
            for (int i = 0; i < n; i++) {
                int start = i+1;
                int end = n-1;
                while(start<end){
                    int sum =nums[i]+nums[start]+nums[end];
                    if(Math.abs(target-sum)<Math.abs(target-ans))
                        ans=sum;
                    if(sum>target)
                        end--;
                    else if(sum<target)
                        start++;
                    else
                        return ans;
                }
            }
            return ans;
        }


    };

    public static void main(String[] args) {
        int[] ans ={1,2,3,4,5,6};
        Solution solution = new threeSumClosest().new Solution();
        System.out.println(solution.threeSumClosest(ans,7));
    }
}
