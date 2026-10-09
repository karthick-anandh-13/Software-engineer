public class day5_04 {
    static int removeAll(int[] arr, int value){
        int j = 0;

        //i scans the entire array
        for(int i = 0; i < arr.length; i++){
            //Keep only elements that are not equal to value
            if(arr[i] != value){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 10, 30, 40};
        int value = 10;
        int newLength = removeAll(arr,value);
        //Print only the valid portion of the array
        for(int i = 0; i < newLength; i++){
            System.out.print(arr[i] + " ");
        }   
    }

}
