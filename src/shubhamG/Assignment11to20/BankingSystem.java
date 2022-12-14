package shubhamG.Assignment11to20;
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



public class BankingSystem {
	int printBalance;
	int debit;
	int credit;
	int balance;
	static int debitCount;
	static int creditCount;
	static int printBalanceCount;

	void setUserDetails(int initBalance, String userName) {
		balance = initBalance;
		System.out.println("User name is: " + userName);
		System.out.println("\nInitial Balance is: " + balance);
	}

	void creditOps(int amount) {
		balance = balance + amount;
		credit++;
		creditCount++;
	}

	void debitOps(int amount) {
		balance = balance - amount;
		debit++;
		debitCount++;
	}

	void printBalanceOps() {
		System.out.println("Current Balance is : " + balance);
		printBalance++;
		printBalanceCount++;
	}

	void individualTransactionSummary() {
		System.out.println("\nTransaction Summary: ");
		System.out.println("Total credit count is :" + credit);
		System.out.println("Total debit count is :" + debit);
		System.out.println("Total Print Balance count is :" + printBalance);
		System.out.println("\n-----------------------------------");
	}
	
	void allTransactionSummary() {
		System.out.println("\nAll Transaction Summary: ");
		System.out.println("Total credit count is :" + creditCount);
		System.out.println("Total debit count is :" + debitCount);
		System.out.println("Total Print Balance count is :" + printBalanceCount);
		System.out.println("\n-----------------------------------");
		
		
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		BankingSystem bankingSystem2 = new BankingSystem();

		bankingSystem1.setUserDetails(5000, "User1");
		bankingSystem1.creditOps(1000);
		bankingSystem1.debitOps(499);
		bankingSystem1.creditOps(1345);
		bankingSystem1.printBalanceOps();
		bankingSystem1.individualTransactionSummary();

		bankingSystem2.setUserDetails(8139, "User2");
		bankingSystem2.creditOps(1400);
		bankingSystem2.debitOps(412);
		bankingSystem2.debitOps(412);
		bankingSystem2.creditOps(1452);
		bankingSystem2.creditOps(112);
		bankingSystem2.creditOps(100);
		bankingSystem2.creditOps(1332);
		bankingSystem2.individualTransactionSummary();
		
		bankingSystem1.allTransactionSummary();

	}

}
