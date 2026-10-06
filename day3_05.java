import java.util.Scanner;

public class day3_05 {
    //Check whether the amount is valid

    static boolean isValidAmount(double amount){
        return amount > 0;
    }
    //Deposit money
    static double deposit(double balance, double amount){
        if(!isValidAmount(amount)){
            System.out.println("Invalid deposit amount");
            return balance;
        }
        balance += amount;
        System.out.println("Deposit Successful");
        return balance;
    }
    //Check whether the withdrawal is possible
    static boolean canWithdraw(double balance, double amount){
        if(!isValidAmount(amount)){
            return false;
        }

        if(amount > balance){
            return false;
        }
        if(amount > 20000){
            return false;
        }
        return true;
    }//withdraw money
    static double withdraw(double balance, double amount){
        if(!canWithdraw(balance, amount)){
            if(!isValidAmount(amount)){
                System.out.println("Invalid withdrawal amount");
            } else if(amount > balance){
                System.out.println("Insufficient balance");
            } else if(amount > 20000){
                System.out.println("Withdrawal limit exceeded");
            }
            return balance;
        }
        balance -= amount;
        System.out.println("Withdrawal Successful");
        return balance;
    }
    //Calculate simple interest
    static double calculateSimpleInterest(double balance, double rate, int years){
        return (balance * rate * years) / 100;
    }
    //Display balance
    static void displayBalance(double balance){
        System.out.println("Current balance: " + balance);
    }
    //Display ATM menu
    static void displayMenu(){
        System.out.println("\n----BANKING SYSTEM-----");    
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Check Interest");
        System.out.println("5. Exit");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double balance = 50000;
        int choice;
        do{
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    balance = deposit(balance, depositAmount);
                    displayBalance(balance);
                    break;
                
                case 2:
                    System.out.print("Enter withdrawl amount:");
                    double withdrawAmount = sc.nextDouble();
                    balance = withdraw(balance, withdrawAmount);
                    displayBalance(balance);
                    break;
                case 3:
                    displayBalance(balance);
                    break;
                case 4:
                    System.out.print("Enter interest rate: ");
                    double rate = sc.nextDouble();

                    System.out.print("Enter number of years: ");
                    int years = sc.nextInt();

                    double interest = calculateSimpleInterest(balance, rate, years);
                    System.out.println("Thank you for using the banking system");
                    break;

                default:
                    System.out.println("Invalid choice, please try again");
            }
        }while(choice != 5);

        sc.close();
    }
    

}
