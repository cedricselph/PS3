package mainPackage;

public class InsufficientFundsException extends Exception
{
	private static final long serialVersionUID = -7493759501295475648L;

private double amount;

   public InsufficientFundsException(double amount)
   {this.amount = amount;} 
   
   public double getAmount()
   {return amount;}
}