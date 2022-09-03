/*
 Assignment - 12 : 1st Sep'2022

Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range


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

when calling the method on the first object.
Output: user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE : You should have setUserDetails method to set username and initial Balance .

@all, if you couldn't build logic for Assignment - 13, we can discuss that today between 10 to 10:30 PM. 
Let us know if you want us to arrange Assignment-13 solution session.
 */
package akankshaVyas.forLoopPrimeBanking;

public class BankingSystem {

	String name;
	static int bal;
	int indDebitCount;
	int indPrintCount;
	int indCreditCount;
	static int tPrintCount;
	static int tDebitCount;
	static int tCreditCount;

	void setUserDetails(int bal, String name) {
		this.name = name;
		this.bal = bal;

	}

	void debitAmount(int amount) {

		bal = bal - amount;
		indDebitCount++;
		tDebitCount++;

	}

	void creditAmount(int amount) {
		bal = bal + amount;
		indCreditCount++;
		tCreditCount++;
	}

	void printBalance() {
		indPrintCount++;
		tPrintCount++;
	}

	void individualTransactionSummary() {

		System.out.println("Main balance for " + name + " is " + bal);
 		System.out.println(name + " transaction summary is : " + "credit- " + (indCreditCount) + " times," + " Debit- "
				+ (indDebitCount) + " times,  printBalance- " + (indPrintCount) + " times \n");

	}

	void allTransactionSummary() {
		System.out.println("\n"+"All transaction summary is : " + "credit- " + (tCreditCount) + " times," + " Debit- "
				+ (tDebitCount) + " times,  printBalance- " + (tPrintCount) + " times \n");

	}

	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.setUserDetails(5000, "User1");
		bankingSystem1.debitAmount(100);
		bankingSystem1.creditAmount(200);
		bankingSystem1.creditAmount(500);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();

		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.setUserDetails(4000, "User2");
		bankingSystem2.debitAmount(100);
		bankingSystem2.debitAmount(100);
		bankingSystem2.creditAmount(200);
		bankingSystem2.creditAmount(100);
		bankingSystem2.creditAmount(20);
		bankingSystem2.creditAmount(10);
		bankingSystem2.creditAmount(80);
		bankingSystem2.individualTransactionSummary();
		bankingSystem2.allTransactionSummary();

	}
}
