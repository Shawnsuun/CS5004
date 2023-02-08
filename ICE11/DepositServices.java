public class DepositServices
{
	
    public void deposit(Depositable account, double amount)
    {
        account.incBalance(amount);
    }
    
    //public void deposit(Checking account, double amount)    {account.incBalance(amount);}
    //public void deposit(InterestChecking account, double amount)    {account.incBalance(amount);}
}