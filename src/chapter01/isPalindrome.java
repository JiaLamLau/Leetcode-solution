package chapter01;

public class isPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
           int left=0,right=s.length()-1;
           while(left<right){
               while(left<right&&
                       !Character.isLetterOrDigit(s.charAt(left))){
                   left++;
               }
               while(left<right&&!Character.isLetterOrDigit(s.charAt(right))){
                   right--;
               }
               if(left<right){
                   if(Character.toLowerCase(s.charAt(left))
                           !=Character.toLowerCase(s.charAt(right))){
                       return false;
                   }
                   left++;
                   right--;
               }

           }
           return true;
        }
    }

    public static void main(String[] args) {
        String s ="race a car";
        Solution solution =new isPalindrome().new Solution();
        System.out.println(solution.isPalindrome(s));
    }
}
