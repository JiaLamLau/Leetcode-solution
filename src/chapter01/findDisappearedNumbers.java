package chapter01;

import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                int index = (nums[i] - 1) % n;
                nums[index] += n;
            }
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (nums[i] <=n) ans.add(i + 1);
            }
            return ans;
        }

    }



    public static void main(String[] args) {
        int[] ans ={4,3,2,7,8,2,3,1};
        Solution solution =new findDisappearedNumbers().new Solution();
        System.out.println(solution.findDisappearedNumbers(ans));
    }
}
