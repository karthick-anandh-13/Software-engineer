// Prime number analyzer
import java.util.Scanner;

public class day3_01 {
    //Method 1 check whether a number is a prime
    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    //Method 2: count the number of factors

    static int countFactors(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count;
    }
    // Method 3: Calculate sum of factors
    static int sumOfFactors(int n){
        int sum = 0;
        for(int i = 1; i<=n;i++){
           if(n % i == 0){
               sum += i;
           }
        }

        return sum;
    }

    // Method 4: Display complete analysis

    static void printAnalysis(int n){
        boolean prime = isPrime(n);
        int factors = countFactors(n);
        int sum = sumOfFactors(n);

        System.out.println("Number: " + n);
        System.out.println("Prime: " + prime);
        System.out.println("Number of factors:" + factors);
        System.out.println("Sum of factors: " + sum);
    }
    //Main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();
        printAnalysis(n);

        sc.close();

    }


 }
