// ATM Transaction Simulator
import java.util.Scanner;

public class day3_03 {

    // Check whether the amount is valid
    static boolean isValidAmount(double amount) {
        return amount > 0;
    }

    // Deposit money and return updated balance
    static double deposit(double balance, double amount) {

        if (!isValidAmount(amount)) {
            System.out.println("Invalid deposit amount.");
            return balance;
        }

        balance += amount;

        System.out.println("Deposit successful.");

        return balance;
    }

    // Withdraw money and return updated balance
    static double withdraw(double balance, double amount) {

        if (!isValidAmount(amount)) {
            System.out.println("Invalid withdrawal amount.");
            return balance;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return balance;
        }

        if (amount % 100 != 0) {
            System.out.println("Withdrawal amount must be a multiple of 100.");
            return balance;
        }

        balance -= amount;

        System.out.println("Withdrawal successful.");

        return balance;
    }

    // Display current balance
    static void displayBalance(double balance) {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        int choice;

        do {

            System.out.println("\n---- ATM MENU ----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();

                    balance = deposit(balance, depositAmount);
                    displayBalance(balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    balance = withdraw(balance, withdrawAmount);
                    displayBalance(balance);
                    break;

                case 3:
                    displayBalance(balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}