import java.util.LinkedHashMap;
import java.util.Map;

public class day6_01 {
    public static void main(String[] args){
        int[] arr = {4,2,4,3,2,4};

        Map<Integer, Integer> freq = new LinkedHashMap<>();

        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);

        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + " ->"  + entry.getValue());
        }
    }
    
}
