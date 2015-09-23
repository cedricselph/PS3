package mainPackage;

import java.util.Date;


public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	/**
	 * id and balance defaults to 0. 
	 * The date is current date.
	 */
	public Account(){
		
		id = 0;
		balance = 0;
		dateCreated = new Date();

	}
	
	/**
	 * id and balance assigned to initial construction.
	 * @param idin
	 * @param balancein
	 */
	public Account(int idin, double balancein){
		
		id = idin;
		balance = balancein;
		dateCreated = new Date();	
		
	}
	
	/**
	 * @return this.id
	 */
	public int getId(){
		
		return this.id;
		
	}
	
	/** @param idin
	 */
	public void setId(int idin){
		
		this.id = idin;
		
	}
	
	/**
	 * @param A
	 * @return A.id
	 */
	public static int getId(Account A){
		
		return A.id;
		
	}
	
	/**
	 * @param A
	 * @param idin
	 */
	public static void setId(Account A, int idin){
		
		A.id = idin;
		
	}
	
	/**
	 * @return id
	 */
	public double getBalance(){
		
		return this.balance;
		
	}
	
	/**
	 * @param bal
	 */
	public void setBalance(double bal){
		
		this.balance = bal;
		
	}
	
	/**
	 * @param A
	 * @return A.balance
	 */
	public static double getBalance(Account A){
		
		return A.balance;
		
	}
	
	/**
	 * @param A
	 * @param bal
	 */
	public static void setBalance(Account A, double bal){
		
		A.balance = bal;
		
	}
	
	/**
	 * @return A.annualInterestRate
	 */
	public double getAnnualInterestRate() {
		
		return this.annualInterestRate;
		
	}
	
	/**
	 * @param annual_interest
	 */
	public void setAnnualInterestRate(double annual_Interest){
		
		this.annualInterestRate = annual_Interest;
		
	}
	
	/**
	 * @param A
	 * @return A.annualInterestRate
	 */
	public static double getAnnualInterestRate(Account A){
		
		return A.annualInterestRate;
		
		
	}
	
	/**
	 * @param A
	 * @param annual_Interest
	 */
	public static void setAnnualInterestRate(Account A, double annual_Interest){
		
		A.annualInterestRate = annual_Interest;
		
	}
	
	/**
	 * @return this.dateCreated
	 */
	public Date getDateCreated(){
		
		return this.dateCreated;
		
	}
	
	/**
	 * @param A
	 * @return A.dateCreated
	 */
	public static Date getDateCreated(Account A){
		
		return A.dateCreated;
		
	}
	

	/**
	 * Calculates the monthly interest rate from the annual rate
	 * @return monthly_Rate
	 */
	public double getMonthlyInterestRate(){
		
		double monthly_Rate = this.getAnnualInterestRate()/12;
		
		return monthly_Rate;
		
	}
	
	/**
	 * @param A
	 * @return monthly_Rate
	 */
	public static double getMonthlyInterestRate(Account A){
		
		double monthly_Rate = A.getAnnualInterestRate()/12;
		
		return monthly_Rate;
		
	}
	
	/**
	 * Subtracts the given amount from the account balance.
	 * @param amount
	 */
	public void withdraw(double amount) throws InsufficientFundsException 
	{
	      if(amount <= this.balance)
	      {this.balance = this.balance - amount;}
	      else{
	         
	    	  double needs = amount - this.balance;
	         
	         throw new InsufficientFundsException(needs);
	      }
	}
	
	/**
	 * Subtracts the given amount from the account balance.
	 * @param A
	 * @param amount
	 */
	public static void withdraw(Account A, double amount) throws InsufficientFundsException
	{
	      if(amount <= A.balance)
	      
	      {A.balance = A.balance - amount;}
	      
	      else{
	         
	    	  double needs = amount - A.balance;
	         
	         throw new InsufficientFundsException(needs);
	      }
		
	}
	
	/**
	 * Adds the given amount to the account balance.
	 * @param amount
	 */
	public void deposit(double amount){
		
		this.balance = this.balance + amount;
		
	}
	
	/**
	 * Adds the given amount to the account balance.
	 * @param A
	 * @param amount
	 */
	public static void deposit(Account A, double amount){
		
		A.balance = A.balance + amount;
		
	}
	
	
	
	
	
}