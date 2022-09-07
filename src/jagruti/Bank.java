
/*
 *Assignment - 3 : 22nd Aug'22
Create a class called Bank having 3 methods and 3 instance variables.
- expected operations - debitAmount, creditAmount, printInfo.
- print info should print total debit operation, total credits operations and current balance.
- variable balance to hold current balance, creditCount, debitCount.
- create only one object and call methods multiple times, at the end call printInfo method.
- I suggest using the If condition to make sure the asked amount <= balance, if not please print InSufficient fund message in debit method.

 */
package jagruti;
class Bank
{
	int balance = 5000;
	int debitCount = 0;
	int creditCount = 0;
	
	void debitAmount(int amount)
	{
		if(amount<=balance){
			balance = balance - amount;
			debitCount++;
			
		}else
		{
			System.out.println("Insufficient balance in your account");
		}
			
		
	}	
	void creditAmount(int amount)
	{
		balance = balance + amount;
		creditCount++;
		
	}
	void printInfo()
	{
		System.out.println("Current balance in your account is : "+balance);
		System.out.println("Total debit operations : "+debitCount);
		System.out.println("Total credit operations : "+creditCount);
	}
	public static void main(String[] args)
	{
		Bank bank = new Bank();
		bank.creditAmount(5000);
		bank.debitAmount(3000);
		bank.debitAmount(5000);
		bank.creditAmount(2000);
		bank.printInfo();		
	}
	
}