import java.util.HashMap;
import java.util.Map;

public class day6_02 {
    public static void main(String[] args){
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);

        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() > arr.length / 2){
                System.out.println(entry.getKey());
                return;
            }
        }

        System.out.println(-1);
    }    
}
