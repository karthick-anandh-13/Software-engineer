public class java5_02 {
    static int[] delete(int[] arr, int index){
        //create a new array with one less space
        int[] result = new int[arr.length - 1];

        //copy elements before the deleted index
        for(int i = 0; i < index; i++){
            result[i] = arr[i];
        }
        //shift element after index one position to the left
        for(int i = index; i < arr.length - 1; i++){
            result[i] = arr[i + 1];
        }

        //shift elements after index one position to the left
        for(int i = index; i < arr.length - 1; i++){
            result[i] = arr[i + 1];
        }
        return result;
    }
        public static void main(String[] args){
            int[] arr = {10, 20, 30, 40, 50};
            int index = 2;
            int[] result = delete(arr, index);
            for(int num : result){
                System.out.print(num + " ");
            }
        }

}
