import java.util.HashMap;
import java.util.Map;

public class day6_04{
    public static boolean areEqual(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }

        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : arr1){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        for(int num : arr2){
            if(!freq.containsKey(num)){
                return false;
            }
            int count = freq.get(num);

            if(count == 0){
                return false;
            }
            freq.put(num, count - 1);
        }
        return true;
        
    }
    public static void main(String[] args){
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2,3,2,1};

        System.out.println(areEqual(arr1, arr2));
    }
}