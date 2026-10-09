public class day4_03 {
    public static void main(String[] args){
        int[] arr = {2, 16,33,45,59,22,36,87,99,1};
        int largest = arr[0];
        int largestIndex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
                largestIndex = i;
            }

        }
        System.out.println("Largest element is " + largest + " at index " + largestIndex);
    }
}
