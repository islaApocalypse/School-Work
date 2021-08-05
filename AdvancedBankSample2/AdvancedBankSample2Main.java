
import account.*;
import java.util.Scanner;

public class AdvancedBankSample2Main {
    private static Scanner input = new Scanner(System.in);
    private static Account account;
    private static boolean isDone = false;

    public static void main(String[] args) {

        // Welcome message
        System.out.println("Welcome to B's prestigeous Bank");

        while(!isDone) {
            if(account == null) { // no account yet, prompt for type and create
                System.out.println("Please create a new account :) ");
                System.out.println("Choose a preferred account: ");
                System.out.println("1) Checkings 2) Savings");
                int choice = input.nextInt();
                
                if(choice == 1) { // checking
                    System.out.println("Starting balance?");
                    double moolah = input.nextDouble();
                    account = new Checkings(moolah);
                }
                else { // savings
                    System.out.println("Starting balance?");
                    double moolah = input.nextDouble();
                    account = new Savings(moolah);
                }
            } // if
            else { // user has an account, print menu
                System.out.println("Welcome back, select from the following:");
                System.out.println("1) Print Account Details");
                System.out.println("2) Deposit funds");
                System.out.println("3) Withdrawl funds");
                System.out.println("4) Print balance");
                System.out.println("9) Exit...");
                int choice = input.nextInt();
                switch(choice) {
                    case 1: {
                        account.PrintAccountDetails();
                        break;
                    }
                    case 2: {
                        System.out.println("What amount?");
                        double moolah = input.nextDouble();
                        account.Desposit(moolah);
                        break;
                    }
                    case 3: {
                        System.out.println("How much?");
                        double moolah = input.nextDouble();
                        account.Withdrawl(moolah);
                        break;
                    }
                    case 4: {
                        account.PrintBalance();
                        break;
                    }
                    case 9: { // exit
                        isDone = true;
                        break;
                    }
                }
            } // else
        } // while 
        System.out.println("Thank you for choosing to bank with us." + 
            " Have a marvelous day!");
    } // main
} // class