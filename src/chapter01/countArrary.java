package chapter01;

import java.util.HashMap;
import java.util.Map;

public class countArrary {
    public static void main(String[] args) {
        int[] ans = {12, 3, 4, 4, 22, 3, 4, 3, 22, 111, 34};
        System.out.println(countArray1(ans));

    }
    private static Map<Integer,Integer> countArray1(int[] arr){
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int num:arr){
            if(countMap.containsKey(num)){
                int count = countMap.get(num);
                countMap.put(num,count+1);
            }else{
                countMap.put(num,1);
            }
        }
        return countMap;
    }
}
