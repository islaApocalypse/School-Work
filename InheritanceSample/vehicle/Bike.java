package vehicle;

public class Bike extends Vehicle {
    
    public Bike(String brand) {
        super("Bike");
        super.SetBrand(brand);
        super.SetFeulCap(randNum.nextInt(20) + 20); // 20-39
    }
}
