import java.util.HashMap;
import java.util.Map;

//Check if there are any two Equal numbers in an array
// at a distance less than or equal to k
public class Hashing02Distance {
    public static boolean equalElementsWithDistanceLessThanEqualToK(int[] arr, int k){
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if (hm.containsKey(arr[i])){
                if (i-hm.get(arr[i])<=1){
                    return true;
                }

            }
            hm.put(arr[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = equalElementsWithDistanceLessThanEqualToK(new int[]{3, 2, 3, 2, 4, 3}, 20);
        System.out.println(b);
    }

}
