@SuppressWarnings(value = { "unused" })
public class Loan extends Account implements Payable
{
    private double iRate;
    private int len;

    public Loan()
    {
    	super();
    	iRate = 001;
    	len = 12;
    }
    
    public Loan(String name, int accountNum, double balance, String address, double iRate, int len)
    {
        super(name, accountNum, balance, address);
        this.iRate = iRate;
        this.len = len;
    }



}
