package chapter01;

public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }
    }

    public static void main(String[] args) {
        int[] a={2,3,4,5,6,7};

        //Solution solution =new Solution();
        Solution s = new TwoSum().new Solution();
        int[] b = s.twoSum(a,14);
        for (int ans:b) {
            System.out.println(ans);
        }

    }
}
