//Find the best index
public class day4_08{
    public static void main(String[] args){
        int[] arr = {3, 8, 2, 10, 5, 7};

        int bestIndex = 0;
        int minDifference = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            int leftSum = 0;
            int rightSum = 0;

            //Calculate left sum
            for(int j = 0; j < i; j++){
                leftSum += arr[j];
            }

            for(int j = i + 1; j < arr.length; j++){
                rightSum += arr[j];
            }

            int difference = Math.abs(leftSum - rightSum);

            if (difference < minDifference){
                minDifference = difference;
                bestIndex = i;
            }
        }
        System.out.println("Best Index = " + bestIndex);
        System.out.println("Minimum Difference = " + minDifference);
    }
}