import java.util.HashMap;
import java.util.Map;

//Count All ((i,j) pairs such that b[i] - b[j] == k
// (count of such pairs.) [i<j]
public class Hashing03CountPairs {
    public static int pairsWithDifferenceEqualToK(int[] arr, int k){
        int ans = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        for (int ele : arr){
            int x = ele-k;
            if(hm.containsKey(x)){
                ans+=hm.get(x);
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
