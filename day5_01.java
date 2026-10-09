public class day5_01 {
    static int[] insert(int[] arr, int index, int value){
        //create a new array with one extra space
        int[] result = new int[arr.length + 1];
        // copy elements before the insertion index
        for(int i = 0; i < index; i++){
            result[i] = arr[i];
        }
        //Insert the new value
        result[index] = value;

        for(int i = index; i < arr.length; i++){
            result[i+1] = arr[i];
        } 
        return result;
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};

        int index = 2;
        int value = 99;

        int[] result = insert(arr, index, value);

        for(int num : result){
            System.out.print(num + " ");
        }
    }
    
}
