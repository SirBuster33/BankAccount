public class Main {

    public static void main(String[] args) {
	Savings savings = new Savings("Trump", 1005, 1000000, 0.2);
    savings.addInterest();
        try{
            savings.Deposit(-500);
        } catch (IllegalArgumentException i){
            System.out.println(i.getMessage());
            // System.exit(-1);
        }
    Checkings checking = new Checkings("Trump", 1005, 500, savings);
    try{
        checking.Withdrawal(1000);
    } catch (InsufficientFundsException i){
        System.out.println(i.getMessage());
    }
        System.out.println("Savings is: $" + savings.getBalance());
        System.out.println("Checkings is: $" + checking.getBalance());
    }
}
