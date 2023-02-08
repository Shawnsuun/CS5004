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
	
	//TASK 3
	//These tests don't pass. 
	//Why?
	//Fix this
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
	@Test
	public void accumInterestTest() {
		mm1.incBalance(5.00);
		mm1.accumInterest();
		assertEquals(mm1.getBalance(), 5.25,.001);
	}
	
	//TASK 5 
	//I wanted to do a test for this one, but it didn't work out the way I wanted
	//Swap Mortgage from inheritance to composition and make sure every thing still works as intended


}
