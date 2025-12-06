import java.util.HashMap;
import java.util.Map;

public class Hashing01MaxMinFreq {
    public static void maxMinFreq(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        int maxFreq = 0, minFreq =1 ;
        int maxEle = Integer.MIN_VALUE, minEle = Integer.MAX_VALUE;
        for (int ele : arr) {
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
            if (hm.get(ele)>maxFreq){
                maxFreq = hm.get(ele);
                maxEle = ele;
            }
            if (hm.get(ele)<=minFreq){
                minFreq = hm.get(ele);
                minEle = ele;
            }
        }
        System.out.println("maximum element is : " + maxEle +  " and its freq is : " + maxFreq);
        System.out.println("minimum element is : " + minEle +  " and its freq is : " + minFreq);
    }

    public static void main(String[] args) {
        maxMinFreq(new int[]{3, 2, 3, 2, 4, 3});
    }
}
