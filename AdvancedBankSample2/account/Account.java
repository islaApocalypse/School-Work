
package account;

public abstract class Account {
    private double moolahGrowthRate;
    private double storedFunds;
    private String type;

    public Account(double storedFunds) {
        this.storedFunds = storedFunds;
    }

    // Getters
    public double GetinterestRate() {
        return moolahGrowthRate;
    }
    public String GetType() {
        return type;
    }

    // Setters
    public void SetRate(double moolahGrowthRate) {
        this.moolahGrowthRate = moolahGrowthRate;
    }
    public void SetType(String type) {
        this.type = type;
    }
    public void Desposit(double moolah) {
        this.storedFunds += moolah;
    }
    public void Withdrawl(double moolah) {
        if(this.storedFunds >= moolah) {
            this.storedFunds -= moolah;
        }
        else {
            System.out.println("Insufficient moolah, please try again!");
        }
    }
    public void PrintAccountDetails() {
        System.out.println("Your account type is: " + type);
        System.out.println("Your account interest rate is: " + 
        moolahGrowthRate + "%");
        System.out.println("Your balance is: " + storedFunds);
    }
    public void PrintBalance() {
        System.out.println("Your balance is: " + this.storedFunds);
    }
}