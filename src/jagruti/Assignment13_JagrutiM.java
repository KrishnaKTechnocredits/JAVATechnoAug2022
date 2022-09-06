package jagruti;

public class Assignment13_JagrutiM 
{
	int balance;
	String  username;
	int creditCount, debitCounnt, printCount;
	static int allDebitCounnt, allCreditCount, allPrintCount ;
	
	void setUserDetails(int balance, String username)
	{
		this.balance = balance;
		this.username = username;
	}	
	void debitAmount(int amount)
	{
		if (amount<=balance)
		{
			balance = balance-amount;
		}
		else
		{
			System.out.println(username+ " having low account balance, Insufficient fund");
		} 
		debitCounnt++;
		allDebitCounnt++;
	}	
	void creditAmount(int amount)
	{
		balance = balance + amount;
		creditCount++;
		allCreditCount++;
	}	
	void printInfo()
	{
		System.out.println("\n"+username+ " current balance is "+balance);
		printCount++;
		allPrintCount++;
	}
	void individualTransactionSmmary()
	{
		System.out.println(username+ "transaction summary : Credit - "+creditCount+" times, Debit - "+debitCounnt+" times, printBalance - "+printCount+" time");
	}
	static void allTransactionSmmary()
	{
		System.out.println("\nAll transaction summary : Credit - "+allCreditCount+" times, Debit - "+allDebitCounnt+" times, printBalance - "+allPrintCount+" time");
	}
	public static void main(String[] args)
	{
		Assignment13_JagrutiM user1 = new Assignment13_JagrutiM();
		Assignment13_JagrutiM user2 = new Assignment13_JagrutiM();
		
		user1.setUserDetails(10000, "Sona");
		user1.debitAmount(2000);
		user1.debitAmount(3000);
		user1.creditAmount(5500);
		user1.printInfo();		
		user1.individualTransactionSmmary();
		
		user2.setUserDetails(5000, "Mona");
		user2.creditAmount(10000);
		user2.creditAmount(2000);
		user2.debitAmount(15000);
		user2.printInfo();		
		user2.individualTransactionSmmary();
		
		allTransactionSmmary();
	}

}

/*
 * Assignment - 13 : 1st Sep'2022
Create a Banking System which has the following functionality.
Create two objects to perform the below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called .
Hint : Create 3 non static instance variables.

when calling the method on the first object.
Output: user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time

when calling the method on the second object.
Output: user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE : You should have setUserDetails method to set username and initial Balance .

 */
