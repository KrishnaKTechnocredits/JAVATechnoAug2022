package swatiM.assignments;

public class BankingSystem {
	int balance;
	int debitCount;
	int creditCount;
	int printBalanceCount;
	static int debit;
	static int credit;
	static int printBal;

	void setUserDetails(String user, int bal) {
		balance = bal;
		System.out.println(user);
		System.out.println("Your Initial Balance is: " + balance);
	}

	void creditAmount(int credit) {
		balance = balance + credit;
		creditCount++;
		credit++;
	}

	void debitAmount(int debit) {
		balance = balance - debit;
		debitCount++;
		debit++;
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
		System.out.println("Credited: " + credit + " times");
		System.out.println("Debited: " + debit + " times");
		System.out.println("Balance Printed: " + printBal + " time\n");
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.setUserDetails("User1", 500);
		bankingSystem1.creditAmount(100);
		bankingSystem1.debitAmount(200);
		bankingSystem1.creditAmount(500);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();

		bankingSystem1.setUserDetails("User2", 5000);
		bankingSystem1.creditAmount(150);
		bankingSystem1.debitAmount(260);
		bankingSystem1.creditAmount(250);
		bankingSystem1.debitAmount(100);
		bankingSystem1.creditAmount(700);
		bankingSystem1.creditAmount(100);
		bankingSystem1.creditAmount(100);
		bankingSystem1.individualTransactionSummary();

		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.allTransactionSummary();
	}

}
