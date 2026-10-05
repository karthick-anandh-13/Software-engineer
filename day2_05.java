// all loops
public class day2_05 {
    public static void main(String[] args){
        System.out.println("For loop");

        for(int i = 1; i<= 5; i++){
            System.out.println(i);
        }
        System.out.println("While loop");
        int j = 1;
        while(j <= 5){
            System.out.println(j);
            j++;

        }

        // do-while loop
        System.out.println("Do-while loop");

        int k = 1;
        do{
            System.out.println(k);
            k++;
        } while(k<=5);

        System.out.println("Nested for loop");

        for(int row = 1; row <= 5; row++){
            for(int coloumn = 1; coloumn <= row; coloumn++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
