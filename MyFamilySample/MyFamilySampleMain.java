
import java.util.Scanner;

import member.*;

public class MyFamilySampleMain {
    private static Scanner input = new Scanner(System.in);
    private static Member person;

    public static void main(String[] args) {
        System.out.println("Whom is within your family?");
        System.out.println("1) Myself 2) Siblings 3) Parents");
        int choice = input.nextInt();
        input.nextLine();

        switch(choice) {
            case 1: { // Myself
                System.out.println("What's your gender: ");
                String gender = input.nextLine();
                System.out.println("What's your name: ");
                String name = input.nextLine();
                System.out.println("What's your age: ");
                int age = input.nextInt();
                person = new Myself(gender, name, age);
                break;
            }
            case 2: { // sibling
                System.out.println("What's their gender: ");
                String gender = input.nextLine();
                System.out.println("What's their name: ");
                String name = input.nextLine();
                System.out.println("What's their age: ");
                int age = input.nextInt();
                person = new Sibling(gender, name, age);
                break;
            }
            case 3: { // parent
                System.out.println("What's their gender: ");
                String gender = input.nextLine();
                System.out.println("What's their name: ");
                String name = input.nextLine();
                System.out.println("What's their age: ");
                int age = input.nextInt();
                person = new Parent(gender, name, age);
                break;
            }
        } // switch()
        System.out.println("Congrats your family consists of a " + person.GetName() +
            " & they're aged " + person.GetAge());
    } // main
} // class