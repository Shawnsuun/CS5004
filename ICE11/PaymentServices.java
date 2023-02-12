public class PaymentServices {

    //Note:
    // Using Payable interface instead of different account type
    public void processPayment(Payable account, double amount) {account.decBalance(amount);}


    //public void processPayment(Loan account, double amount) {account.decBalance(amount);}
    //public void processPayment(Mortgage account, double amount) {account.decBalance(amount);}
    
}
