@SuppressWarnings(value = { "unused" })
public class InterestChecking extends Savings
{
    private Check [] checks = new Check[10];
    
    public InterestChecking() {
    	super();
   
    }
    
    public InterestChecking(String name, int accountNum, double balance, String address, double iRate)
    {
        super(name, accountNum, balance, address, iRate);
    }


    public double getBalance() {
        return super.getBalance();
    }

}
