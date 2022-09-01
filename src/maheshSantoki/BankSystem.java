package maheshSantoki;

public class BankSystem {

	int iCreditCount = 0;
	int iDebitCount = 0;
	int iBalanceCount = 0;
	static int balanceCount = 0;
	static int creditCount = 0;
	static int debitCount = 0;
	static int balance = 0;

	void setUserDetails(String name, int bal) {
		balance = bal;
		System.out.println("#" + name + ", Intial Balance is : " + bal);
	}

	// debit amount operation
	void debit(int amt) {
		balance = balance - amt;
		iDebitCount++;
		debitCount++;
	}

	// credit amount operation
	void credit(int amt) {
		balance = balance + amt;
		iCreditCount++;
		creditCount++;
	}

	// print current balance
	void printBalance() {
		System.out.println(" Current balance is : " + balance);
		iBalanceCount++;
		balanceCount++;
	}

	// individual summary
	void iSummary() {
		System.out.println(" Individual credit transactions : " + iCreditCount);
		System.out.println(" Individual debit transactions : " + iDebitCount);
		System.out.println(" Individual print balance Calling : " + iBalanceCount);
	}

	// all Transactions Summary
	void allSummary() {
		System.out.println("so both users Total credit transactions are : " + creditCount
				+ ", debit transactions are : " + debitCount + " and print balance transactions : " + balanceCount);
	}

	public static void main(String[] a) {
		BankSystem banksystem1 = new BankSystem();
		banksystem1.setUserDetails("user1", 15000);
		banksystem1.debit(500);
		banksystem1.debit(700);
		banksystem1.credit(1500);
		banksystem1.debit(2500);
		banksystem1.printBalance();
		banksystem1.iSummary();

		System.out.println("\n");

		BankSystem banksystem2 = new BankSystem();
		banksystem2.setUserDetails("user2", 25000);
		banksystem2.debit(2500);
		banksystem2.debit(7700);
		banksystem2.credit(5500);
		banksystem2.debit(3500);
		banksystem2.credit(2200);
		banksystem2.iSummary();

		System.out.println("\n");

		banksystem2.allSummary();
	}
}
