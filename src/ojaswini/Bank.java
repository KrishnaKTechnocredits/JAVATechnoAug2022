package ojaswini;

public class Bank {
	int balance=4000;
	   int debitCount=0;
	   int creditCount=0;
	   
	     void debitAmount(int amount)
	   {
	       if(amount<=4000)
		   {
		      balance=balance-amount;
	          debitCount++;
		   }
		   else
		   {
		      System.out.println("insufficient balance");
		   }
	   }
		  
		 void creditAmount(int amount)
	   {
		    balance=balance+amount;
			creditCount++;
	   }
			
		 void printInfo()
	   {
			 System.out.println("The balance is " + balance);
			 System.out.println("The total credited operations are  " + creditCount);
			 System.out.println("The total debited operations are " + debitCount);
	   }
			
	     public static void main(String[] args)
	   {
			  Bank bank = new Bank();
			  bank.debitAmount(1000);
			  bank.creditAmount(4000);
			  bank.printInfo();
	   }

}
