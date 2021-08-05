
public class BankAccount {
    private float balance;

    public BankAccount(float amount) {
        balance = amount;
    } // constructor

    public void Deposit(float amount) {
        balance += amount;
    } // Deposit()
    
    public void Withdrawl(float amount) {
        balance -= amount;
    } // Withdrawl()

    public float GetBalance() {
        return balance;
    } // GetBalance()
} // class