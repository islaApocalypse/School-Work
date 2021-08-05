package vehicle;

public class Truck extends Vehicle {

    public Truck(String brand) {
        super("Truck");
        super.SetBrand(brand);
        super.SetFeulCap(randNum.nextInt(30) + 90); 
    }
}
