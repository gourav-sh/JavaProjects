import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int balance, amount, choice;

        System.out.println("Enter your current balance:");
        balance = s.nextInt();

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    amount = s.nextInt();

                    if (amount > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance = balance - amount;
                        System.out.println("Remaining Balance: " + balance);
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = s.nextInt();

                    balance = balance + amount;
                    System.out.println("Amount Deposited Successfully!");
                    break;

                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

      
    }
}