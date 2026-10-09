//Find first element that repeat twice
public class day4_05 {
    public static void main(String[] args){
        int[] arr = {10,89,55,33,56,55,77,89};
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("First elemnt to be repeated is: " + arr[i]);
                    System.out.println("Index : " + i);
                    return;
                }
            }
        }
    }
}
