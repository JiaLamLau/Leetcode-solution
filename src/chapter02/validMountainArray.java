package chapter02;

public class validMountainArray {
    class Solution {
        public boolean validMountainArray(int[] arr) {
             int n=arr.length;
             int i=0;
             while(i+1<n&&arr[i]<arr[i+1]) i++;
             if(i==0||i==n-1) return false;

            while(i+1<n&&arr[i]>arr[i+1]) i++;

            return i==n-1;
        }
    }

    public static void main(String[] args) {
        int[] arr ={0,3,2,1};
        Solution solution =new validMountainArray().new Solution();
        System.out.println(solution.validMountainArray(arr));
    }
}
