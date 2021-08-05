
package account;

public class Checkings extends Account {
    private String type = "Checkings";
    private double moolahGrowthRate = 1.4;

    public Checkings(double storedFunds) {
        super(storedFunds);
        super.SetType(this.type);
        super.SetRate(this.moolahGrowthRate);
    }
}