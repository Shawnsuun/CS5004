public abstract class Account 
{
	private String name;
	private int accountNum;
	private double balance;
	
	private String address;
	
	public Account(){name=null;balance=0;accountNum=0; address=null;} 
	public Account(String name, int accountNum, double balance, String address)
	{this.name=name; this.accountNum=accountNum; this.balance=balance; this.address=address;}
	
	
	public double getBalance(){return balance;}
	public String getName(){return name;}
	public void setName(String name){this.name=name;}
	public void incBalance(double amount){this.balance+=amount;}
	public void decBalance(double amount){this.balance-=amount;}
	
	public void printAccount()
	{
	System.out.println("Name = " + name);
	System.out.println("Account Number = " + accountNum);
	System.out.println("Balance = " + balance);
	}
	
	public String toString()
	{
		return "Name : " + name + "\nAccount# : " + accountNum + "\nBalance : " + balance;
	}
	
	public String getAccountType()
	{
		if (this instanceof Savings) return "Savings";
		if (this instanceof Checking) return "Checking";
		if (this instanceof Loan) return "Loan";
		
		return null;
	}
	
	public String getAddress() {return address;}


	public void accumInterest() {
	}
}