
package vehicle;
import java.util.Random;

public abstract class Vehicle {
    protected Random randNum = new Random();
    private String brand;
    private int fuelCap;
    private String type;    

    public Vehicle(String type) {
        this.type = type;
    }

    // getters
    public String GetBrand() {
        return this.brand;
    }
    public int GetFuelCap() {
        return this.fuelCap;
    }
    public String GetType() {
        return this.type;
    }


    // setters
    public void SetBrand(String brand) {
        this.brand = brand;
    }
    public void SetFeulCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

} // class