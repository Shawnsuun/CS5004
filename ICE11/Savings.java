@SuppressWarnings(value = { "unused" })
public class Savings extends Account implements Depositable
{	
	private double iRate;
	
	public Savings(){
		super();
		iRate = .01;
	}
	
	public Savings(String name, int accountNum, double balance, String address, double iRate)
	{
	    super(name, accountNum, balance, address);
	    this.iRate = iRate;
	}
	
	public Savings(double iRate)
	{
	    super();
	    this.iRate = iRate;
	}
	
	public void accumInterest()
	{
		super.incBalance(super.getBalance() * iRate);
	}
	
}