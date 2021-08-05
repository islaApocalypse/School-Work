package vehicle;

public class Car extends Vehicle {
    
    public Car(String brand) {
        super("Car");
        super.SetBrand(brand);
        super.SetFeulCap(randNum.nextInt(30) + 30); // 30 - 59
    }
}