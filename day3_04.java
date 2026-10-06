//Number transformation pipeline
import java.util.Scanner;

public class day3_04{
    //count number of digits
    static int countDigits(int n){
        n = Math.abs(n);
        if(n == 0){
            return 1;
        }

        int count = 0;

        while(n > 0){
            n /= 10;
            count++;
        }
        return count;
    }
    //Reverse the number
    static int reverseNumber(int n){
        int reverse = 0;
        n = Math.abs(n);
        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }
    //calculate sum of digits
    static int sumOfDigits(int n){
        n = Math.abs(n);

        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
    //check whether number is palindrome
    static boolean isPalindrome(int n){
        n = Math.abs(n);
        int original = n;
        int reverse = reverseNumber(n);

        return original == reverse;

    }
    // calculate digital root
    static int digitalRoot(int n){
        n = Math.abs(n);
        while(n >= 10){
            n = sumOfDigits(n);
        }
        return n;

    }
    // Display complete analysis
    static void analyzeNumber(int n){
        int digits = countDigits(n);
        int reverse = reverseNumber(n);
        int sum = sumOfDigits(n);
        boolean palindrome = isPalindrome(n);
        int root = digitalRoot(n);

        System.out.println("-----Number Analysis---");
        System.out.println("Original Number: " + n);
        System.out.println("Number of Digits: " + digits);
        System.out.println("Reversed : " + reverse);
        System.out.println("Palindrome : " + palindrome);
        System.out.println("Digital Root: " + root);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        analyzeNumber(n);
        sc.close();
    }
}