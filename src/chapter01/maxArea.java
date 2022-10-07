package chapter01;

import java.util.*;


import static java.lang.Math.max;

public class maxArea {
    class Solution{
    public int maxArea(int[] height) {
        HashSet<Integer> ans =new HashSet<>();
        int n = height.length;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                int m = Math.min(height[i], height[j]);
                int tmp = m * (j - i);
                ans.add(tmp);

            }
        }
        return Collections.max(ans);

    }
    };



    public static void main(String[] args) {
            int[] ans={1,8,6,2,5,4,8,3,7};
            Solution solution =new maxArea().new Solution();
        System.out.println(solution.maxArea(ans));
    }
}
