package chapter01;

public class sortString {
    class Solution {
        public String sortString(String s) {
           int[] countStr = new int[26];
           for(char c:s.toCharArray()){
               countStr[c-'a']++;
           }
           //上升
            StringBuilder sb=new StringBuilder();
           while(sb.length()<s.length()){
               for (int i = 0; i <26; i++) {
                   if(countStr[i]>0) {
                       sb.append((char)(i+'a'));
                       countStr[i]--;
                   }
               }
               for (int i = 25; i >=0 ; i--) {
                   if(countStr[i]>0) {
                       sb.append((char)(i+'a'));
                       countStr[i]--;
                   }
               }
           }
           return sb.toString();

        }
    }

    public static void main(String[] args) {
        String ans="aaaabbbbcccc";
        Solution solution =new sortString().new Solution();

        System.out.println(solution.sortString(ans));

    }
}
