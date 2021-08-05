
package account;

public class Savings extends Account {
    private String type = "Savings";
    private double moolahGrowthRate = 2.6;

    public Savings(double storedFunds) {
        super(storedFunds);
        super.SetType(this.type);
        super.SetRate(this.moolahGrowthRate);
    }
}