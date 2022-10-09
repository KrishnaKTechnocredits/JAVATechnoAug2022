
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
package nilamP.assignment1to16;

public class Assignment13 {
	int balance;
	int debitCount;
	int creditCount;
	int printBalanceCount;
	static int deb;
	static int cred;
	static int printBal;

	void setUserDetails(String user, int bal) {
		balance = bal;

		System.out.println(user);

		System.out.println("Your Initial Balance is: " + balance);
	}

	void creditAmount(int credit) {
		balance = balance + credit;
		creditCount++;
		cred++;
	}

	void debitAmount(int debit) {
		balance = balance - debit;
		debitCount++;
		deb++;
	}

	void printBalance() {
		System.out.println("Your Current Balance is " + balance);
		printBalanceCount++;
		printBal++;
	}

	void individualTransactionSummary() {
		System.out.println("\nTransaction Summary:");
		System.out.println("Credited: " + creditCount + " times");
		System.out.println("Debited: " + debitCount + " times");
		System.out.println("Balance Printed: " + printBalanceCount + " time\n");
	}

	void allTransactionSummary() {

		System.out.println("All Transaction Summary:");
		System.out.println("Credited: " + cred + " times");
		System.out.println("Debited: " + deb + " times");
		System.out.println("Balance Printed: " + printBal + " time\n");
	}

	public static void main(String[] args) {
		
		Assignment13 a = new Assignment13();
		System.out.println("Assignment 13 output : ");
		a.setUserDetails("User1", 10000);
		a.creditAmount(1000);
		a.debitAmount(2000);
		a.creditAmount(5000);
		a.printBalance();
		a.individualTransactionSummary();

		a.setUserDetails("User2", 50000);
		a.creditAmount(1500);
		a.debitAmount(2600);
		a.creditAmount(2500);
		a.debitAmount(600);
		a.creditAmount(7000);
		a.creditAmount(300);
		a.creditAmount(1000);
		a.individualTransactionSummary();

		Assignment13 a1 = new Assignment13();
		a1.allTransactionSummary();

	}
}
