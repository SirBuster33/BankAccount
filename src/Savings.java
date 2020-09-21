public class Savings extends Account {
    private double InterestRate;

    public Savings(){
        super();
        this.InterestRate = 0.0;
    }
    public Savings(double InterestRate){
        super();
        this.InterestRate = InterestRate;
    }
    public Savings(String owner, int accountID, double balance, double InterestRate){
        super(owner, accountID, balance);
        this.InterestRate = InterestRate;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void addInterest(){
        this.Deposit(this.getBalance() * InterestRate);
    }

    public void setInterestRate(double InterestRate){
        this.InterestRate = InterestRate;
        System.out.println("Interest rate was set to " + this.getInterestRate());
    }

}
