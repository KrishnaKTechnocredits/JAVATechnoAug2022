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

when calling the method on the second object.
Output: user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE : You should have setUserDetails method to set username and initial Balance .
*/

package deepakPatil;

public class BankSystem {
	
	String userName;
	int balance;
	int creditCount;
	int debitCount;
	int printBalanceCount;
	static int allCreditCount;
	static int allDebitCount;
	static int allPrintBalanceCount;
	
	void setUserDetails(String userName,int userBalance) {
		balance=userBalance;
		this.userName=userName;
	}
	
	void debitAmount(int amount) {
		balance=balance-amount;
		debitCount++;
		allDebitCount++;
	}
	
	void creditAmount(int amount) {
		balance = balance + amount;
		creditCount++;
		allCreditCount++;
	}
	
	void printBalance() {
		System.out.println(userName+" Current balance is "+balance);
		printBalanceCount++;
		allPrintBalanceCount++;
	}
	
	void individualTransactionSummary() {
		System.out.println("\n"+userName+" transaction summary : Credit - "+creditCount+" times, Debit - "+debitCount+" times, Print Balance - "+printBalanceCount+" time");
	}
	
	void allTransactionSummary() {
		System.out.println("\nAll transaction summary : Credit - "+allCreditCount+" times, Debit - "+allDebitCount+" times, Print Balance - "+allPrintBalanceCount+" time");
	}
	
	public static void main(String[]args) {
		BankSystem bankSystem1=new BankSystem();
		BankSystem bankSystem2=new BankSystem();
		BankSystem bankSystem3=new BankSystem();
		
		bankSystem1.setUserDetails("user1", 1000);
		bankSystem1.creditAmount(5000);
		bankSystem1.debitAmount(2000);
		bankSystem1.creditAmount(1000);
		bankSystem1.printBalance();
		bankSystem1.individualTransactionSummary();
		
		bankSystem2.setUserDetails("user2", 1000);
		bankSystem2.creditAmount(3000);
		bankSystem2.creditAmount(1000);
		bankSystem2.creditAmount(4000);
		bankSystem2.creditAmount(1000);
		bankSystem2.creditAmount(1000);
		bankSystem2.debitAmount(3000);
		bankSystem2.debitAmount(2000);
		bankSystem2.individualTransactionSummary();
		
		bankSystem3.allTransactionSummary();
	}

}
