//count elements greater than their index

public class day4_04 {
    public static void main(String[] args){
        int[] arr = {3, 1, 4, 6,5,7};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > i){
                count++;
            }
        }
        System.out.println("Count of elements greater than their index: " + count);
    }    
}
