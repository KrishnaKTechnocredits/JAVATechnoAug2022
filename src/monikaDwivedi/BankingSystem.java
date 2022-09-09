/*Create a Banking System which has the following functionality.

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

NOTE : You should have setUserDetails method to set username and initial Balance */
package monikaDwivedi;

public class BankingSystem {
	int amount = 0;
	static int debitCount, creditCount,printbalcount; //for all transaction
	int debCount, credCount,printcountofbal;
	String usrname;
	
	void creditAmount(int credit) {
		//int creditcount = 0;
		amount = amount + credit;
		System.out.println("Amount credited in "+usrname+"'s"+" account is :- "+ credit);
		//System.out.println("Available balance in customer's account:- "+ amount);
		creditCount++;
		credCount++;
	}
	void debitAmount(int debit) {
		//int debitcount = 0;
		amount = amount - debit;
		System.out.println("Amount debited from "+usrname+"'s"+" account is :- "+ debit);
		//System.out.println("Available balance in customers's account:- "+ amount);
		debitCount++;
		debCount++;
	}
	void printBalance() {
		System.out.println("your available balance is: "+ amount);
	}
	
	void setUserDetails(String name, int balance) {
		System.out.println();
		amount = balance;
		usrname = name;
	}
	void allTransactionSummary() {
		System.out.println("-----------All Transactions Summary-----------");
		System.out.println("Total Number of Credit operations - " + creditCount);
		System.out.println("Total Number of Debit operations - "+ debitCount);
		System.out.println("Total number of times balance printed - " + printbalcount);
		
	}
	void individualTransactionSummary() {
		System.out.println("-----------Individual Transaction Summary-----------");
		System.out.println("Total Number of Credit operations - " + credCount);
		System.out.println("Total Number of Debit operations - "+ debCount);
		System.out.println("Total number of times balance printed - " + printcountofbal);
		
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem = new BankingSystem();
		bankingSystem.setUserDetails("Monika Dwivedi", 4000);
		bankingSystem.creditAmount(1060);
		bankingSystem.debitAmount(509);
		bankingSystem.printBalance();
		bankingSystem.individualTransactionSummary();
		
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.setUserDetails("Satyam Dwivedi", 7000);
		bankingSystem2.creditAmount(1063);
		bankingSystem2.debitAmount(59);
		bankingSystem2.debitAmount(19);
		bankingSystem2.creditAmount(106);
		bankingSystem2.printBalance();
		bankingSystem2.individualTransactionSummary();
		
		bankingSystem.allTransactionSummary();
		//System.out.println("Available balance in the account:- "+ amount);
		 
	}
}





















