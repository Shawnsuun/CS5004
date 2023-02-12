@SuppressWarnings(value = { "unused" })
public class MoneyMarket extends Savings implements Depositable
{	
	private int withdrawalLimit;
	private int numWidthdrawals;
	private double iRate;
	
	private Savings s1; 
	
	public MoneyMarket()
	{
	    super();
	    withdrawalLimit = 10;
	    numWidthdrawals = 0;
	    this.iRate = .05;
	}
	
	public MoneyMarket(String name, int accountNum, double balance, String address, double iRate, int withdrawalLimit){
	    super(name, accountNum, balance, address, iRate);
	    this.withdrawalLimit = withdrawalLimit;
	    this.iRate = iRate;
	}
	
	public void decBalance(double amount)
	{
		super.decBalance(amount);
		numWidthdrawals ++;
	}

	@Override
	public void accumInterest()
	{
		super.incBalance(super.getBalance() * iRate);
	}

}
