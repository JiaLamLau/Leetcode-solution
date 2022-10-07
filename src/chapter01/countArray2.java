package chapter01;

public class countArray2 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,3};
        for (int nums:countArray2(arr))
            System.out.print(" "+nums);

    }
    private static int[] countArray2(int[] arr){
        int[] countMap = new int[6];
        for(int num:arr){
            int index = num -1;
            countMap[index]++;
        }
        return countMap;
    }
}
