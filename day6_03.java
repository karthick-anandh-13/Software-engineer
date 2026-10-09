import java.util.HashMap;
import java.util.Map;


public class day6_03{
    public static void main(String[] args){
        int[] arr = {4, 5, 1, 2, 4, 4, 5};
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for(int num : arr){
            if(freq.get(num) == 1){
                System.out.println(num);
                return;
            }
        } 
        System.out.println(-1);
    }
}