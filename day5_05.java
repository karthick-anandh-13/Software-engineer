public class day5_05 {
    static int removeDuplicates(int[] arr){
        //Empty array
        if(arr.length == 0){
            return 0;
        }
        //j points to the last unique element
        int j = 0;
        // i scans the array
        for(int i = 1; i< arr.length; i++){
            //Found a new Unique element
            if(arr[i] != arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        //Number of unique elements
        return j + 1;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,4,4};

        int newLength = removeDuplicates(arr);

        for(int i = 0; i < newLength; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
