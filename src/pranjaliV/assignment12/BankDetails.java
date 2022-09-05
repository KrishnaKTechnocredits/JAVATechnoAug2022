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

package pranjaliV.assignment12;

public class BankDetails {
	int debitCount=0;
	int creditCount=0;
	int printBalanceCount =0;
	String userName;
	int balance;
	static int staticDebitCount=0;
	static int staticCreditCount=0;
	static int staticPrintBalanceCount=0;
	
	void debitAmount(int debit) {
		if(balance>=debit) {
			balance = balance - debit;
			debitCount++;
			staticDebitCount++;
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	void creditAmount(int credit) {
		balance = balance + credit;
		creditCount++;
		staticCreditCount++;
	}

	void printBalance() {
		System.out.println("Current Balance of "+userName+" is: Rs" + balance);
		printBalanceCount++;
		staticPrintBalanceCount++;
	}
	
	void individualTransactionSummary() {
		System.out.println(userName+" transaction summary : Credit - "+creditCount+" times, Debit - "+debitCount+" times, printBalance - "+printBalanceCount+" time");
	}
	
	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - "+staticCreditCount+" times, Debit - "+staticDebitCount+" times, printBalance - "+staticPrintBalanceCount+" time");
	}
	
	void setUserDetails(String name,int initialBalance) {
		userName=name;
		balance = initialBalance;
		System.out.println("User Name: " + userName);
		System.out.println("Initial Balance: "+ balance);
	}
	
	public static void main(String[] args) {
		BankDetails user1 = new BankDetails();
		user1.setUserDetails("User1",10000);
		user1.creditAmount(1000);
		user1.debitAmount(500);
		user1.creditAmount(2500);
		user1.printBalance();
		user1.individualTransactionSummary();
		
		BankDetails user2 = new BankDetails();
		user2.setUserDetails("User2",20000);
		user2.creditAmount(1000);
		user2.debitAmount(500);
		user2.creditAmount(2500);
		user2.creditAmount(500);
		user2.debitAmount(1500);
		user2.creditAmount(500);
		user2.creditAmount(500);
		user2.individualTransactionSummary();
		user2.allTransactionSummary();
	}

}
