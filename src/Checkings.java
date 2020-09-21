public class Checkings extends Account{
    private Savings overdraft;

    public Checkings(String owner, int accountID, double balance, Savings overdraft){
        super(owner, accountID, balance);
        this.overdraft = overdraft;
    }

    @Override
    public boolean Withdrawal(double amount){
        boolean result = false;
        if(super.Withdrawal(amount)) {
            result = true;
        }
        else if(overdraft.Withdrawal(amount - this.getBalance())) {
            setBalance(0.0);
            result = true;
        }
        return result;
    }

}
