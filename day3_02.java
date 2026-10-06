//Student perform analyzer
import java.util.Scanner;

public class day3_02{
    //calculate total marks
    static int calculateTotal(int[] marks){
        int total = 0;
        for(int i = 0; i < marks.length; i++){
            total += marks[i];
        }
        return total;
    }
    //calculate average marks
    static double calculateAverage(int total){
        return total/5.0;
    }

    //determine grade
    static char calculateGrade(double average){
        if (average >= 90){
           return 'A';
        } else if(average >= 80){
            return 'B';
        } else if(average >= 70){
            return 'C';
        } else if(average >= 60){
            return 'D';
        } else{
            return 'F';
        }
    }
    //check whether student passed
    static boolean isPassed(int[] marks){
        for(int i = 0; i < marks.length; i++){
            if(marks[i] < 40){
                return false;
            }
        }
        return true;
    }
    static void displayResult(int total, double average, char grade, boolean passed){
        System.out.println("\n----Student Result------");
        System.out.println("Total Marks: " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade:" + grade);
        System.out.println("Result: " + (passed ? "PASS" : "FAIL"));

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects");
        for(int i = 0; i < 5; i++){
            System.out.print("Subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();

        }
        int total = calculateTotal(marks);
        double average = calculateAverage(total);
        char grade = calculateGrade(average);
        boolean passed = isPassed(marks);
        displayResult(total, average, grade, passed);
        sc.close();
    }
}