/*
 Assignment - 13 : 1st Sep'2022

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
 * 
 */
package rahulSaswadkar;

public class Bank {
	
	int debitCount;
	int creditCount;
	int printSummaryCount;
	String name;
	int balance;
	static int debitCountByAllUsers;
	static int creditCountByAllUsers;
	static int printSummaryCountByAllUsers;
	
	
	
	void debitAmount(int amt) {
		balance = balance - amt;
		debitCount += 1;
		debitCountByAllUsers += 1;
	}
	
	void creditAmount(int amt) {
		balance = balance + amt;
		creditCount += 1;
		creditCountByAllUsers += 1;
	}
	
	void currentBalance() {
		//System.out.println("Current balance is : " + balance);
		printSummaryCount +=1;
		printSummaryCountByAllUsers += 1;
	}
	
	void individualTransactionSummary() {
//		System.out.println("Count of Credit Transactions : " + creditCount );
//		System.out.println("Count of Debit Transactions : " + debitCount );
//		System.out.println("Count of Print Current Balance Service call : " + printSummaryCount );
		System.out.println(name + " transaction summary : Credit - " + creditCount + " times, Debit - " + debitCount + " times, printBalance - "
				+ printSummaryCount + " times" );
		
		
	}
	
	void allTransactionSummary() {
//		System.out.println("Count of Credit Transactions by all users : " + creditCountByAllUsers );
//		System.out.println("Count of Debit Transactions by all users : " + debitCountByAllUsers );
//		System.out.println("Count of Print Current Balance Service call by all users: " + printSummaryCountByAllUsers );
		System.out.println("All Transaction summary : Credit - " + creditCountByAllUsers + " times, Debit - " + debitCountByAllUsers + 
				" times, printBalance - " + printSummaryCountByAllUsers + " times" );
		
	}
	
	void setUserDetails(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		Bank bank2 = new Bank();
		
		bank1.setUserDetails("User1", 1000);
		bank2.setUserDetails("User2", 2000);
		
		bank1.creditAmount(200);
		bank1.creditAmount(200);
		bank1.debitAmount(100);
		bank1.currentBalance();
		bank1.individualTransactionSummary();
		
		bank2.creditAmount(200);
		bank2.creditAmount(200);
		bank2.creditAmount(200);
		bank2.creditAmount(200);
		bank2.creditAmount(200);
		bank2.debitAmount(100);
		bank2.debitAmount(100);
		//bank2.currentBalance();
		bank2.individualTransactionSummary();
		
		bank1.allTransactionSummary();
		bank2.allTransactionSummary();
	}

}
