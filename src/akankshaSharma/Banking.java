package akankshaSharma;

public class Banking {
	int printBalance;
	int debit;
	int credit;
	int balance;
	static int debitCount;
	static int creditCount;
	static int printBalanceCount;

	void usrDetails(int bal, String user) {
		balance = bal;
		System.out.println(" Details for User is-: " + user);
		System.out.println(" opening balance is: " + balance);
	}

	void credit(int amount) {
		balance = balance + amount;
		credit++;
		creditCount++;
	}

	void debit(int amount) {
		balance = balance - amount;
		debit++;
		debitCount++;
	}

	void printBalance() {
		System.out.println("\nCurrent Balance is : " + balance);
		printBalance++;
		printBalanceCount++;
	}
	
		void individualTransactionSummary() {
		System.out.println("Details for individual transaction by user: ");
		System.out.println("Total credit count is :" + credit);
		System.out.println("Total debit count is :" + debit);
		System.out.println("Total Print Balance count is :" + printBalance);
		System.out.println("\n\n");
	}
	
	void allTransactionSummary() {
		System.out.println("Overall Transaction Summary: ");
		System.out.println("overall credit count is :" + creditCount);
		System.out.println("Overall debit count is :" + debitCount);
		System.out.println("Overall Print Balance count is :" + printBalanceCount);
		System.out.println("\n\n");
	}
	
	public static void main(String[] args) {
		Banking banking1 = new Banking();
		banking1.usrDetails(3000, "User1");
		banking1.credit(100);
		banking1.credit(200);
		banking1.debit(400);
		banking1.credit(550);
		banking1.debit(400);
		banking1.printBalance();
		banking1.individualTransactionSummary();
		//banking1.allTransactionSummary();
		
		Banking banking2 = new Banking();

		banking2.usrDetails(800, "User2");
		banking2.credit(1000);
		banking2.debit(40);
		banking2.debit(40);
		banking2.debit(27);
		banking2.credit(333);
		banking2.credit(11);
		banking2.printBalance();
		banking2.individualTransactionSummary();
		banking2.allTransactionSummary();
		
		

	}

}


