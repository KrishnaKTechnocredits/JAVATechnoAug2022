package amolMule;

public class BankSystem {

	static int balance;
	static int debitCount;
	static int creditCount;
	static int printCount;
	int indDebCount;
	int indCredCount;
	int indPrintCount;

	void userDetails(String username, int bal) {
		balance = bal;
		System.out.println("*******USER DETAILS*****************");
		System.out.println("User name " + username);
		System.out.println("Current balance is " + balance);
	}

	void debitAmount(int amt) {
		if (balance > amt) {
			balance = balance - amt;
			debitCount++;
			indDebCount++;
		}
		else
			System.out.println("Insufficient Balance");
	}

	void creditAmount(int amt) {
		balance = balance + amt;
		creditCount++;
		indCredCount++;
	}

	void printBalance() {
		System.out.println("Current balance is " + balance);
		printCount++;
		indPrintCount++;
	}

	void overallTransactionSummary() {
		System.out.println("*******Overall Bank Account Summary************");
		System.out.println("Totl debit count is " + debitCount);
		System.out.println("Totl credit count is " + creditCount);
		System.out.println("Totl print count is " + printCount);
	}

	void indTransactionSummary() {
		System.out.println("Totl individual debit count is " + indDebCount);
		System.out.println("Totl individual credit count is " + indCredCount);
		System.out.println("Totl individual print count is " + indPrintCount);
	}

	public static void main(String args[]) {
		BankSystem user1 = new BankSystem();
		BankSystem user2 = new BankSystem();
		user1.userDetails("Amol", 10000);
		user1.creditAmount(1000);
		user1.debitAmount(500);
		user1.debitAmount(500);
		user1.creditAmount(100);
		user1.printBalance();
		user1.indTransactionSummary();
		user1.printBalance();

		user2.userDetails("Amit", 50000);
		user2.creditAmount(5000);
		user2.debitAmount(1000);
		user2.debitAmount(100);
		user2.indTransactionSummary();
		user2.printBalance();

		user2.overallTransactionSummary();
	}

}
