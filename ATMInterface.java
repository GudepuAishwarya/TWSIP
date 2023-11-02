import java.util.Scanner;

public class ATMInterface {
    private double balance;

    public ATMInterface() {
        balance = 1000.0;   //Initial balance,replace with actual account balance.
    }

    public void checkBalance() {
        System.out.println("Your balance is: $");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + "successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficent funds.");
        }
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + "successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public static void main(String args[]) {
        ATMInterface atm = new ATMInterface();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the ATM!");
        do{
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                atm.checkBalance();
                break;
                case 2:
                System.out.println("Enter the withdrawal: $");
                double withdrawalAmount = scanner.nextDouble();
                atm.withdraw(withdrawalAmount);
                break;
                case 3:
                System.out.println("Enter the deposit amount: $ ");
                double depositAmount = scanner.nextDouble();
                atm.deposit(depositAmount);
                break;
                case 4:
                System.out.println("Thank you for using the ATM.Goodbye!");
                break;
                default:
                System.out.println("Invalid choice. Please try again.");

                                            
                     
                    
            }
        } while (choice !=4);

        scanner.close();   
    }

}



