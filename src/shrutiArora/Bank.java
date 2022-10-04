package shrutiArora;
public class Bank {
	  int balance=5000;
	  int debitCount;
	  int creditCount;
	  void debitAmount(int amount)
	  {
	      if(amount<=balance)
		   {
		      balance=balance-amount;
	          debitCount++;
		   }
		   else
		   {
		      System.out.println("Insufficient balance");
		   }
	   }
	   void creditAmount(int amount)
	   {
		  balance=balance+amount;
		  creditCount++;
	   }
			
	  void printInfo()
	   {
	     System.out.println("The Current balance is " + balance);
		 System.out.println("The total Credit operations are  " + creditCount);
		 System.out.println("The total Debited operations are " + debitCount);
	   }
			
	   public static void main(String[] args)
	   {
		  Bank bank = new Bank();
		  System.out.println("**************************Bank OPeration*********************************");
		  bank.debitAmount(500);
		  bank.debitAmount(200);
		  bank.creditAmount(600);
		  bank.creditAmount(300);
		  bank.debitAmount(700);
		  bank.printInfo();
	   }
}