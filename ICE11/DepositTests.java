import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DepositTests {

	Account s1;
	Account l1;
	Account mm1;
	Account ic1;
	
	Mortgage m1;
	DepositServices ds;
	PaymentServices ps;
	
	@Before
	public void setUp() {
		s1 = new Savings();
		l1 = new Loan();
		m1 = new Mortgage();
		mm1 = new MoneyMarket();
		ic1 = new InterestChecking();
		ds = new DepositServices();
		ps = new PaymentServices();
		
	}
	
	//TASK 1 
	//The next two tests are cheating. Make it work without having to typecast to a specific account
	//You might have to typecast to an interface, but this is ok as you won't be able to typecast
	//to an account that doesn't implement the correct interface.
	
	//And while you are at it, refactor DepositServices and Payment services using polymorphism
	//	Right now every time you create a new account type you have to add another function
	//	This violate the open closed principle of the SOLID OOD principles (more on this later)

	/**
	 * Note:
	 * Let Saving class implements Depositable interface, use the method of the interface
	 * to change balance, by doing this does not need to do a type casting.
	 *
	 * Let Loan class implements Payable interface, use the method of the interface to change balance,
	 * by doing this does not need to do a type casting.
	 *
	 * In deposit method in DepositServices, Using Depositable interface instead of different account type
	 * as method input, see code in class DepositServices
	 *
	 * In processPayment method in PaymentServices, Using Payable interface instead of different account type
	 * as method input, see code in class PaymentServices
	 */

	@Test
	public void savingsDeposit() {
		s1.incBalance(5.00);
		assertEquals(5.00,s1.getBalance(),.001);
	}

	@Test
	public void loanPayment() {
		l1.decBalance(5.00);
		assertEquals(-5.00,l1.getBalance(),.001);
	}

	//TASK 2 
	//In task 1 I asked you to use polymorphism to get rid of the typecasting and to refactor the code. 
	//There are two ways to do this. I'll give you credit for task 2 if you make sure you can't use 
	//PaymentServices on a Savings or checking account and you can't use DepositServices on a Loan or
	//Mortgage or Loan

	/**
	 * Note:
	 * deposit method in DepositServices uses Depositable interface as an input parameter
	 * processPayment method in PaymentServices use Payable interface as an input parameter
	 * this could avoid using DepositServices on a Mortgage or Loan, and avoid using PaymentServices
	 * on a Savings or checking account.
	 */

	
	//TASK 3
	//These tests don't pass. 
	//Why?
	//Fix this

	/**
	 * Note:
	 * In account abstract class, a getAccountType() method is given, however Mortgage extends Loan class,
	 * Moneymarket and interestChecking extends saving class. In getAccountType() of Account class, it will
	 * check if the given account is Savings or Loan and return the result.
	 *
	 * To solve this, change the order in getAccountType() method in Account class(I changed in this way).
	 * Another way is to override the getAccountType method in MoneyMarket, Mortgage and Interest Checking class.
	 */
	@Test
	public void getTypeTest() {
		assertEquals("Savings", s1.getAccountType());
		assertEquals("Loan", l1.getAccountType()); 
		assertEquals("Mortgage", m1.getAccountType()); 
		assertEquals("MoneyMarket", mm1.getAccountType()); 
		assertEquals("Interest Checking", ic1.getAccountType()); 
	}


	
	//TASK 4
	//Fix it so you don't have to typecast here
	//The default interest rate for a money market is .05
	//Why is the balance incorrect here?
	//Fix this

	/**
	 * Note:
	 * The problem is in the accumInterest() method in MoneyMarket class, originally it extends
	 * the method from Checking and use the interest rate of checking.
	 *
	 * To solve this, I rewrote the accumInterest() method in MoneyMarket class, extends incbalance
	 * method from account class and uses the specific rate in MoneyMarket class.
	 */
	@Test
	public void accumInterestTest() {
		mm1.incBalance(5.00);
		mm1.accumInterest();
		assertEquals(mm1.getBalance(), 5.25,.001);
	}
	
	//TASK 5 
	//I wanted to do a test for this one, but it didn't work out the way I wanted
	//Swap Mortgage from inheritance to composition and make sure every thing still works as intended

	/**
	 * Note:
	 * Instead extends from Loan class, Using a Loan instance as an attribute of Mortgage class
	 * Address is stored in the loan instance of Mortgage class
	 */

}
