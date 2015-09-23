package mainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AccountTest {

	Account acct;

	@Before
	public void setUp() throws Exception {
	acct = new Account(1122, 20000);
	acct.setAnnualInterestRate(.045);
	
	
	}

	@After
	public void tearDown() throws Exception {
	acct = null;
	}
	
	
	@Test
	public final void testStandard() throws InsufficientFundsException{
		acct.withdraw(2500);
		acct.deposit(3000);
		
		System.out.println("Account Number: " + acct.getId());
		
		System.out.println("Balance: $" + acct.getBalance());
		
		System.out.println("Interest Rate: " + acct.getAnnualInterestRate());
		
		System.out.println("Monthly Interest: $" + acct.getBalance()*acct.getAnnualInterestRate()/12);
		
		System.out.println("Date Created: " + acct.getDateCreated());
	}
	
	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		
		acct.setBalance(0);
		
		acct.deposit(500.00);
		
		assertEquals("deposit failed",(long)acct.getBalance(),(long)500.00);
       
		acct.withdraw(900);
	}

	@Test
	public final void testDeposit() {
		
		int x = 0;
		
		double initial = acct.getBalance();
		
		while (x < 20) {
			
			acct.deposit(10000);
			x++;
		}
		assertEquals("deposits failed",(long)acct.getBalance(),(long)(initial + (20 * 10000)));
		
	}

}
