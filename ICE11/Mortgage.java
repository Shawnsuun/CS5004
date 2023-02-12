//Mortgage is a loan with an address
public class Mortgage extends Account implements Payable
{
    private Loan loan;

    public Mortgage(){
        this.loan = new Loan();
    }
    public Mortgage(String name, int accountNum, double balance, String address) {
        double iRate = .001;
        int len = 12;
        this.loan = new Loan(name, accountNum, balance, address, iRate, len);
    }

}
