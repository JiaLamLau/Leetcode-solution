package chapter01;

import java.util.ArrayList;
import java.util.List;

public class commonChars {
    class Solution {
        public List<String> commonChars(String[] words) {
           int[] minfre =new int[26];
            for (char c:words[0].toCharArray()) {
                minfre[c-'a']++;

            }
            for(int i=1;i< words.length;i++){
                int[] fre = new int[26];
                for(char c:words[i].toCharArray()){
                    fre[c-'a']++;
                }
                for (int j=0;j<26;j++){
                    minfre[j]=Math.min(minfre[j],fre[j]);
                }
            }
            List<String> ans =new ArrayList<>();
            for (int i=0;i<26;i++){
                for(int j=0;j< minfre[i];j++){
                    ans.add(String.valueOf((char)(i+'a')));
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        Solution solution =new commonChars().new Solution();
        System.out.println(solution.commonChars(words));

    }
}
