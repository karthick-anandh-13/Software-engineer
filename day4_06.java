//Maximum distance between two maximum elements 
public class day4_06{
    public static void main(String[] args){
        int[] arr = {4,7,2,7,9,4,7};

        int maxDistance = 0;

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    int distance = j - i;
                    if(distance > maxDistance){
                        maxDistance = distance;
                    }
                }
            }
        }
        System.out.println("Maximum distance between two maximum elements is: " + maxDistance);
    }

}
