public class day4_02 {
    public static void main(String[] args){
        int[] arr = {11,22,33,44,55,66,77,88,99};
        System.out.print("Even Indices: ");

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Odd indices: ");
        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
