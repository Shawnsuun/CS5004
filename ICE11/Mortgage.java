//Mortgage is a loan with an address
public class Mortgage implements Payable
{
    private String name;
    private int accountNum;
    private double balance;
    private String address;
    private double iRate;
    private int len;

    public Mortgage(){name=null;balance=0;accountNum=0; address=null;iRate = .001;len = 12;}
    public Mortgage(String name, int accountNum, double balance, String address)
    {this.name=name; this.accountNum=accountNum; this.balance=balance; this.address=address;this.iRate =  .001;this.len = 12;}


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

    public String getAddress() {return address;}

    public String getAccountType()
    {
        if (this instanceof Mortgage) return "Mortgage";
        return null;
    }
}
