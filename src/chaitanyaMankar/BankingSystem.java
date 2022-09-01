/*Assignment - 13 : 1st Sep'2022

Create a Banking System which has the following functionality.

Create two objects to perform the below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called .
Hint : Create 3 non static instance variables.

when calling the method on the first object.
Output: user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time

when calling the method on the first object.
Output: user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE : You should have setUserDetails method to set username and initial Balance .*/
package chaitanyaMankar;

public class BankingSystem 
{
	String name; 
	static int bal;
	int cCount;
	int dCount;
	static int scCount;
	static int sdCount;
	
	void setUserDetails(String sname, int balance)
	{
		bal = balance;
		name = sname;
	}
	void creditAmount(int cAmount)
	{
		bal=bal+cAmount;
		cCount++;
		scCount++;
	}
	
	void debitAmount(int dAmount)
	{
		bal=bal-dAmount;
		dCount++;
		sdCount++;
		}	
	
	void printBalance()
	{
		System.out.println("printBalance: "+ bal);
		System.out.println("");
	}
	
	void individualTransactionSummary()
	{
		System.out.println("UserName - "+name);
		System.out.println("Credit - "+cCount);
		System.out.println("Debit - "+dCount);		
	}
	
	void allTransactionSummary()
	{
		System.out.println("Total Credit - "+scCount);
		System.out.println("Total Debit - "+sdCount);	
		System.out.println("Remaining Balance - "+bal);
	}
	
	public static void main(String[] args) 
	{
		BankingSystem bsystem1 = new BankingSystem();
		BankingSystem bsystem2 = new BankingSystem();
		
		bsystem1.setUserDetails("User 1",1000);
		bsystem1.creditAmount(100);
		bsystem1.creditAmount(100);
		bsystem1.debitAmount(200);
		bsystem1.individualTransactionSummary();
		bsystem1.printBalance();
		
		bsystem2.setUserDetails("User 2",2000);
	    bsystem2.creditAmount(10);
		bsystem2.creditAmount(10);
		bsystem2.creditAmount(10);
		bsystem2.creditAmount(10);
		bsystem2.creditAmount(10);
		bsystem2.debitAmount(25);
		bsystem2.debitAmount(25);
		bsystem2.individualTransactionSummary();
		
		bsystem1.allTransactionSummary();				
	}
}
