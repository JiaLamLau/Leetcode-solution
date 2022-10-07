package chapter01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findDuplicates {
      class Solution {
          public List<Integer> findDuplicates(int[] nums) {
              List<Integer> res = new ArrayList<>();
              for (int i = 0; i < nums.length; i++) {
                  int index = Math.abs(nums[i]) - 1;
                  if (nums[index] < 0)
                      res.add(Math.abs(nums[i]));
                  else nums[index] = -nums[index];
              }
              return res;

          }

      }
    public static void main(String[] args) {
          int[] ans ={4,3,2,7,8,2,3,1};
        Solution solution =new findDuplicates().new Solution();
        System.out.println(solution.findDuplicates(ans));
    }
}
