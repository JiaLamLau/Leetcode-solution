package chapter01;

public class Test {
    public static void main(String[] args) {
        int[] countStr = new int[26];
        String s = "hvjdbvkdsbvk";
        for(char c:s.toCharArray()){
            countStr[c-'a']++;
            System.out.print(" "+countStr[c-'a']);
        }
    }


}
