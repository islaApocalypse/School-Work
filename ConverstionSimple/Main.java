
import java.util.Scanner;

public class Main {
    // class vars - class wide
    public static Scanner Input = new Scanner(System.in);
    public static int Distance = 0; // 33, -11, 25000
    public static final double KMS_TO_MILES_RATE = 0.62137119;
    public static final double MILES_TO_KMS_RATE = 1.609344;
    public static double ConvertedAmount = 0.0;

    public static void main(String[] args) {
        // print menu
        System.out.println("1) KM's to Miles 2) Miles to KM's");
        int Choice = Input.nextInt();

        if(Choice == 1) {
            System.out.println("Enter the amount in KM's");
            Distance = Input.nextInt();
            ConvertedAmount = Distance * KMS_TO_MILES_RATE;

            System.out.println("The amount in miles would be " + ConvertedAmount);
        }
        else {
            System.out.println("Enter the amount in Miles");
            Distance = Input.nextInt();
            ConvertedAmount = Distance * MILES_TO_KMS_RATE;

            System.out.println("The amount in KM's would be " + ConvertedAmount);
        }
    } // main
} // class