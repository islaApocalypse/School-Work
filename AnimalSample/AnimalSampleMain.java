
import animal.*;
import java.util.Scanner;

public class AnimalSampleMain {
    private static Scanner input = new Scanner(System.in);
    private static Animal pet;
    
    public static void main(String[] args) {
        System.out.println("What type of pet would you like to adopt?");
        System.out.println("1) Cat 2) Dog 3) Snake");
        int choice = input.nextInt();
        input.nextLine();

        switch(choice) {
            case 1: { // cat
                System.out.println("Give your pet a name: ");
                String name = input.nextLine();
                pet = new Cat(name);
                break;
            }
            case 2: { // dog
                System.out.println("Give your pet a name: ");
                String name = input.nextLine();
                pet = new Dog(name);
                break;
            }
            case 3: { // snake
                System.out.println("Give your pet a name: ");
                String name = input.nextLine();
                pet = new Snake(name);
                break;
            }
        } // switch()
        System.out.println("Congrats your new pet is a " + pet.GetType() +
            " whose name is " + pet.GetName() + 
            " their age is " + pet.GetAge());

    } // main
} // class