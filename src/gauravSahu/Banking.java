package gauravSahu;

public class Banking {

	static int balance = 10000;
	static int debitcount = 0;
	static int creditcount = 0;
	static int printbalance = 0;

	int individualprintbalance;
	int individualdebit;
	int individualcredit;
	int userprintbalance;

	void userDetails(String name) {
		System.out.println("User name is " + name);
	}

	void debit(int debitamt) {
		if (balance > 0 && balance > debitamt) {
			balance = balance - debitamt;
			debitcount++;
			individualdebit++;
			printbalance++;
			individualprintbalance++;
			System.out.println("Debited amount is " + debitamt);
			System.out.println("Debit count is " + debitcount);
			System.out.println("Current balance " + balance);
		} else {
			System.out.println("Debited amount is " + debitamt);
			System.out.println("Insufficient balance");
		}
	}

	void credit(int creditamt) {
		if (balance >= creditamt) {
			balance = balance + creditamt;
			individualcredit++;
			printbalance++;
			creditcount++;
			individualprintbalance++;
			System.out.println("Credited amount is " + creditamt);
			System.out.println("Credit count is " + creditcount);
			System.out.println("Current balance " + balance);
		} else {
			System.out.println("Enter valid amount");
		}
	}

	void individualtransaction() {
		System.out.println("User debit count " + individualdebit);
		System.out.println("User Credit count " + individualcredit);
		System.out.println("User Print balance executed " + individualprintbalance);
	}

	void transactionSummary() {
		System.out.println("Total debit count " + debitcount);
		System.out.println("Total Credit count " + creditcount);
		System.out.println("Current balance " + balance);
		System.out.println("Total Print balance executed " + printbalance + "times");
	}

	public static void main(String[] args) {
		Banking user1 = new Banking();
		user1.userDetails("Gaurav");
		System.out.println("                           ");
		user1.debit(3000);
		System.out.println("                           ");
		user1.debit(1000);
		System.out.println("                           ");
		user1.credit(2000);
		System.out.println("                           ");
		user1.credit(1000);
		System.out.println("                           ");
		user1.debit(500000);
		System.out.println("                           ");
		user1.individualtransaction();
		System.out.println("                           ");
		Banking user2 = new Banking();
		System.out.println("                           ");
		user2.userDetails("Raju");
		System.out.println("                           ");
		user2.debit(3000);
		System.out.println("                           ");
		user2.debit(1000);
		System.out.println("                           ");
		user2.credit(2000);
		System.out.println("                           ");
		user2.credit(0);
		System.out.println("                           ");
		user2.debit(500000);
		System.out.println("                           ");
		user1.individualtransaction();
		System.out.println("                           ");
		user2.transactionSummary();
	}

}