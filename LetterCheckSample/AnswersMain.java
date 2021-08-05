
import java.util.Scanner;

public class AnswersMain {
    private static Scanner input = new Scanner(System.in);
    private static LetterCheck lc = new LetterCheck();

    public static void main(String[] args) {
        System.out.println("Please enter a single character:");
        char ch = input.next().toLowerCase().charAt(0);

        if(lc.ConsonantCheck(ch)) {
            System.out.println("That character is a consanant!");
        }
        else if(lc.VowelCheck(ch)) {
            System.out.println("That character is a vowel");
        }
        else if(lc.NumberCheck(ch)) {
            System.out.println("That character is a number");
        }
        else {
            System.out.println("RTFM!");
        }
    } // main
} // class