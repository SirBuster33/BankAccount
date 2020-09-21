import javax.swing.*;

abstract public class Account {
    private double balance;
    private String owner;
    private Integer accountID;

    public Account(){
        this.balance = 0.0;
        this.owner = "No Name";
        this.accountID = 0;
    }

    public Account( String owner, int accountID, double balance){
        this.owner = owner;
        this.accountID = accountID;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setBalance(double amount){
            this.balance = amount;
        System.out.println("The balance was set to $ " + getBalance());
    };

    public void Deposit(double amount)throws IllegalArgumentException{
        if (amount < 0){
            throw new IllegalArgumentException("IllegalArgumentException: Negative amount given.");
        }
            this.balance += amount;
            System.out.println("$" + amount + " was deposited. Your new balance now is: $" + this.getBalance() + ".");
    }

    public boolean Withdrawal(double amount)throws InsufficientFundsException{
        boolean result = false;
        if (balance <= amount) {
            throw new InsufficientFundsException("InsufficientFundsException: The withdrawal amount of $" + amount + " exceeds your balance.");
        }
            balance -= amount;
            System.out.println("$" + amount + " was withdrawn. Your new balance now is: $" + this.getBalance() + ".");
            result = true;
        return result;
    }

    public void setName(String Name){
        this.owner = Name;
        System.out.println("Account name was changed to " + getOwner() + ".");
    }

    public void setAccountID(int newAccountID){
        this.accountID = newAccountID;
        System.out.println("Account ID was changed to " + getAccountID() + ".");
    }

}