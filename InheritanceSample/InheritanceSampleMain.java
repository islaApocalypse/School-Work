
import vehicle.*;
import java.util.Scanner;

public class InheritanceSampleMain {
    private static Scanner input = new Scanner(System.in);
    private static Vehicle vehicle;

    public static void main(String[] args) {
        System.out.println("1) Car \n2) Truck \n3) Bike");
        int choice = input.nextInt();

        switch(choice) {
            case 1: { // car
                System.out.println("what brand of car?");
                String brand = input.next();
                vehicle = new Car(brand);
                break;
            }
            case 2: { // truck
                System.out.println("what brand of truck?");
                String brand = input.next();
                vehicle = new Truck(brand);
                break;
            }
            case 3: { // bike
                System.out.println("what brand of bike?");
                String brand = input.next();
                vehicle = new Bike(brand);
                break;
            }
            default: {
                // do nothing
                break;
            }
        } // switch()
        System.out.println("\n=============================");
        System.out.println("\nCongrats you have a new " + 
            vehicle.GetType());
        System.out.println("Your " + vehicle.GetType() + " is a " + 
            vehicle.GetBrand());
        System.out.println("The fuel capacity is: " + 
            vehicle.GetFuelCap() +
            "(Litres)");
    } // main
}// class