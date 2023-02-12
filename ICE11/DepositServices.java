public class DepositServices
{

    //Note Using Depositable interface instead of different account type
    public void deposit(Depositable account, double amount)
    {
        account.incBalance(amount);
    }

    //original code
    //public void deposit(Savings account, double amount) {account.incBalance(amount);}
    //public void deposit(Checking account, double amount)    {account.incBalance(amount);}
    //public void deposit(InterestChecking account, double amount)    {account.incBalance(amount);}
}