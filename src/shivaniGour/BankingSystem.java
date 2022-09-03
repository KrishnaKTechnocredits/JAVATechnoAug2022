package shivaniGour;

public class BankingSystem {
	int currBalance;
	int debitCount;
	int creditCount;
	int printBal;
	static int allCreditCount;
	static int allDebitCount;
	static int allPrintBalance;

	void setUserDetails(String name, int initialBalance) {
		System.out.println("Username: " + name);
		System.out.println("Initial Balance: " + initialBalance);
		currBalance = initialBalance;
	}

	void debit(int amt) {
		if (amt <= currBalance) {
			currBalance = currBalance - amt;
			System.out.println("Amount debited: " + amt);
			debitCount++;
			allDebitCount++;

		} else {
			System.out.println("Insufficient Funds");
		}
	}

	void credit(int amt2) {
		currBalance = currBalance + amt2;
		System.out.println("Amount credited: " + amt2);
		creditCount++;
		allCreditCount++;
	}

	void printBalance() {
		System.out.println("Current Balance amount is :" + currBalance);
		printBal++;
		allPrintBalance++;
	}

	void individualTransactionSummary() {
		System.out.println("Credit: " + creditCount + " times");
		System.out.println("Debit: " + debitCount + " times");
		System.out.println("Print Balance: " + printBal + " times");
	}

	void allTransactionSummary() {
		System.out.println("All users Credit Count: " + allCreditCount + " times");
		System.out.println("All users Debit Count: " + allDebitCount + " times");
		System.out.println("All users Print Balance count: " + allPrintBalance + " times");
	}

	public static void main(String[] args) {
		BankingSystem bankUser1 = new BankingSystem();
		bankUser1.setUserDetails("Anil", 10000);
		bankUser1.debit(500);
		bankUser1.printBalance();
		bankUser1.credit(100);
		bankUser1.printBalance();
		bankUser1.individualTransactionSummary();
		System.out.println("********************************");
		BankingSystem bankUser2 = new BankingSystem();
		bankUser2.setUserDetails("Umesh", 20000);
		bankUser2.debit(600);
		bankUser2.printBalance();
		bankUser2.credit(300);
		bankUser2.debit(100);
		bankUser2.printBalance();
		bankUser2.credit(200);
		bankUser2.printBalance();
		bankUser2.individualTransactionSummary();
		System.out.println("********************************");
		BankingSystem bankUser3 = new BankingSystem();
		bankUser3.setUserDetails("Sujata", 15000);
		bankUser3.debit(600);
		bankUser3.printBalance();
		bankUser3.credit(300);
		bankUser3.debit(100);
		bankUser3.printBalance();
		bankUser3.credit(200);
		bankUser3.printBalance();
		bankUser3.individualTransactionSummary();
		System.out.println("********************************");
		System.out.println("--Total Summary of Transactions--");
		bankUser3.allTransactionSummary();
	}

}
