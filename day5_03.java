public class day5_03 {
    static int[] sortedInsert(int[] arr, int value){
        //step1 : Find the insertion index
        int index = 0;
        while(index < arr.length && arr[index] < value){
            index++;
        } 
        //Step 2: create a new array with one extra space
        int[] result = new int[arr.length + 1];
        //Step 3: copy elements before the insertion index
        for(int i = 0; i < index; i++){
            result[i] = arr[i];
        }
        //step 4: insert the new value;
        result[index] = value; 

        // step 5: shift remaining elements to the right
        for(int i = index; i < arr.length; i++){
            result[i + 1] = arr[i];
        }
        return result;

    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int value = 35;
        int[] result = sortedInsert(arr, value);
        for(int num : result){
            System.out.print(num + " ");
        }
                
    }
    
}
