import java.util.HashMap;
import java.util.Map;

public class Hashing04CountPairsAbs {
    public static int pairsWithDifferenceEqualToK(int[] arr, int k){
        int ans = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        for (int ele : arr){
            int x = ele-k;
            int y = ele + k;
            if(hm.containsKey(x)){
                ans+=hm.get(x);
            }
            if(hm.containsKey(y) && k!=0){
                ans+=hm.get(y);
            }
            hm.put(ele, hm.getOrDefault(ele, 0)+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int b = pairsWithDifferenceEqualToK(new int[]{3, 2, 3, 2, 4, 3}, 1);
        System.out.println(b);
    }
}
