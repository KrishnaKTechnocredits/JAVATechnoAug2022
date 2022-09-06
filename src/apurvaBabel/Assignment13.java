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

NOTE : You should have setUserDetails method to set username and initial Balance .*/

package apurvaBabel;

public class Assignment13 {
	int balance = 50000;
	int debitCount = 0;
	int creditCount = 0;
	int printBalance = 0;
	static int totalPrintBalance = 0;
	static int totalDebitCount = 0;
	static int totalCreditCount = 0;

	void debitAmount(int amount) {
		if (amount <= balance) {
			balance = balance - amount;
			debitCount++;
			totalDebitCount++;
		} else {
			System.out.println("Insufficient Fund");
		}
	}

	void creditAmount(int amount) {
		balance = balance + amount;
		creditCount++;
		totalCreditCount++;
	}

	void printBalance() {
		System.out.println("Your current balance is " + balance);
		printBalance++;
		totalPrintBalance++;
	}

	void individualTransactionSummary() {
		System.out.println("Individual transaction summary");
		System.out.println("Debit operations performed " + debitCount + " time");
		System.out.println("Credit Operations performed " + creditCount + " time");
		System.out.println("Print Balance method called " + printBalance + " time");
	}

	void allTransactionSummary() {
		System.out.println("\nAll transaction summary");
		System.out.println("Total debit operations performed " + totalDebitCount + " time");
		System.out.println("Total credit operations performed " + totalCreditCount + " time");
		System.out.println("Total Print Balance method called " + totalPrintBalance + " time");
	}

	public static void main(String[] args) {
		Assignment13 assignment13_1 = new Assignment13();
		assignment13_1.debitAmount(5000);
		assignment13_1.creditAmount(2500);
		assignment13_1.creditAmount(1800);
		System.out.println("Object 1st");
		assignment13_1.printBalance();
		assignment13_1.individualTransactionSummary();

		Assignment13 assignment13_2 = new Assignment13();
		assignment13_2.creditAmount(1700);
		assignment13_2.creditAmount(1500);
		assignment13_2.creditAmount(1200);
		assignment13_2.creditAmount(1800);
		assignment13_2.creditAmount(2500);
		assignment13_2.debitAmount(5000);
		assignment13_2.debitAmount(8000);
		System.out.println("\nObject 2nd");
		assignment13_2.individualTransactionSummary();
		assignment13_1.allTransactionSummary();
	}
}
