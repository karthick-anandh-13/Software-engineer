//check whether an array is mountain
public class day4_07 {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,4,2};
        int i = 0;

        //Step 1: move upward
        while(i + 1 < arr.length && arr[i] < arr[i + 1]){
            i++;
        }

        if(i == 0 || i == arr.length - 1){
            System.out.println("Not a mountain");
            return;
        }

        //Step 2: move downward
        while(i + 1 < arr.length && arr[i] > arr[i + 1]){
            i++;
        }
        if(i == arr.length - 1){
            System.out.println("Mountain");
        } else{
            System.out.println("Not a mountain");
        }
    }    
}
