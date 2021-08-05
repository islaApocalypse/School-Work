
import java.util.Scanner;

public class BankSampleMain {

    private static Scanner input = new Scanner(System.in);
    private static boolean isFinished = false;
    private static BankAccount account;

    public static void main(String[] args) {
        while(!isFinished) {
            System.out.println("\nPlease make a selection:");
            System.out.println("1) Create Account");
            System.out.println("2) Deposit Funds");
            System.out.println("3) Withdrawl funds");
            System.out.println("4) Print Balance");
            System.out.println("9) Exit");

            int choice = input.nextInt();

            switch(choice) {
                case 1: { // create account
                    System.out.println("What is the initial balance?");
                    float amount = input.nextFloat();
                    account = new BankAccount(amount);
                    System.out.println("Thank you, fees due.");
                    break;
                }
                case 2: { // deposit funds
                    System.out.println("How much would you like to deposit?");
                    float amount = input.nextFloat();
                    account.Deposit(amount);
                    System.out.println("Deposit was successful.");
                    break;
                }
                case 3: { // withdrawl funds // no overdraft!
                    System.out.println("How much would you like to withdrawl?");
                    float amount = input.nextFloat();
                    if(account.GetBalance() < amount) {
                        System.out.println("Insufficient funds, please try again.");
                    }
                    else {
                        account.Withdrawl(amount);
                        System.out.println("Withdrawl completed, take your cash.");
                    }
                    break;
                }
                case 4: { // print balance
                    System.out.println("Balance is $" + account.GetBalance());
                    break;
                }
                case 9: { // exit
                    isFinished = true;
                    break;
                }
                default: {
                    System.out.println("Opps, Google stole your password!");
                }
            } // switch()
        } // while()
    } // main
} // class