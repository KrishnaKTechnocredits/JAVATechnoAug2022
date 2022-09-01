package sagarY;

public class Bank {

	int balance;
	int debitAmnt;
	int creditAmnt;
	int printBal = 0;
	static int debitAmount;
	static int creditAmount;
	static int printBalance;

	void setUserDetails(String user, int bal) {
		balance = bal;
		System.out.println("Username is :" + user);
		System.out.println(user + "'s Innitial balance is : " + balance);

	}

	void creditAmount(int amt) {
		balance = balance + amt;
		creditAmount++;
		creditAmnt++;
	}

	void debitAmt(int amt) {
		balance = balance - amt;
		debitAmnt++;
		debitAmount++;
	}

	void printBalance() {
		System.out.println("The updated balance of the account is: " + balance);
		printBal++;
		printBalance++;
	}

	void individualTransactionSummary() {

		System.out.println("Credit Count: " + creditAmnt);
		System.out.println("Debit Count: " + debitAmnt);
		System.out.println("PrintBalance Count: " + printBal + " times\n");
	}

	void allTransactionSummary() {
		System.out.println("***************************");
		System.out.println("Total Credit Count by User1 & User 2 is: " + creditAmount);
		System.out.println("Total Debit Count by User1 & User 2 is: " + debitAmount);
		System.out.println("Total PrintBalance Count: " + printBalance + " \n");
	}

	public static void main(String[] args) {
		System.out.println("***************************");
		Bank bank1 = new Bank();
		bank1.setUserDetails("User1", 5000);
		bank1.creditAmount(3000);
		bank1.debitAmt(2000);
		bank1.creditAmount(3000);
		bank1.printBalance();
		bank1.individualTransactionSummary();

		System.out.println("***************************");

		Bank bank2 = new Bank();
		bank2.setUserDetails("User2", 7000);
		bank2.creditAmount(3000);
		bank2.debitAmt(2000);
		bank2.creditAmount(3000);
		bank2.debitAmt(2000);
		bank2.creditAmount(4000);
		bank2.creditAmount(3000);
		bank2.creditAmount(3000);
		bank2.individualTransactionSummary();
		bank2.allTransactionSummary();
	}

}
