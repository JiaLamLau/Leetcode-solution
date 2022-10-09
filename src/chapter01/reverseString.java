package chapter01;

public class reverseString {
    class Solution {
        public void reverseString(char[] s) {
            int left=0,right=s.length-1;
            while(left<right){
                char c=s[left];
                s[left]=s[right];
                s[right] = c;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        char[] c={'h','e','l','l','o'};
        Solution solution = new reverseString().new Solution();
        solution.reverseString(c);
        for(char ans:c){
            System.out.print(" "+ans);
        }
    }
}
