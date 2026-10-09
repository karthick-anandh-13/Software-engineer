public class day5_06 {
    static int[] insertMultiple(int[] arr, int[] values){
        int[] result = new int[arr.length + values.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr.length && j < values.length){
            if(arr[i] <= values[j]){
                result[k] = arr[i];
                i++;
            }else{
                result[k] = values[j];
                j++;
            }
            k++;
        }
        while(i < arr.length){
            result[k] = arr[i];
            i++;
            k++;

        }
        //copy remaining elements from values;
        while(j < values.length){
            result[k] = values[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int[] values = {15, 25, 35};
        int[] result = insertMultiple(arr, values);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
