package rohini;
//Assignment 13
class BankDetails {

	String name;
	int balance;
	int printBal;
	int debit;
	int credit;
	static int debitCount;
	static int creditCount;
	static int printBalance;

	void setUserDetails(String sname, int bal) {
		name = sname;
		balance = bal;

	}

	void debitAmount(int debitAmt) {
		if (debitAmt <= balance) {
			balance = balance - debitAmt;
			debit++;
			debitCount++;
		} else {
			System.out.println("Insufficient fund");
		}
	}

	void creditAmount(int creditAmt) {
		balance = balance + creditAmt;
		credit++;
		creditCount++;
	}

	void printBalance() {
		System.out.println("*******************************");
		System.out.println("Transaction Summary of " + name);
		System.out.println("Your total balance is: " + balance);
		printBal++;
		printBalance++;
	}

	void individualTransactionSummary() {

		System.out.println("Total credit operation: " + credit);
		System.out.println("Total debit operation: " + debit);
		System.out.println("Total number of times balance printed " + printBal);
	}

	void allTransactionSummary() {
		System.out.println("*******************************");
		System.out.println("All Transaction Summary of " + name);
		System.out.println("Total credit operation: " + creditCount);
		System.out.println("Total debit operation: " + debitCount);
		System.out.println("Total number of times balance printed " + printBalance);
	}

	public static void main(String[] args) {
		BankDetails bankDetails1 = new BankDetails();
		bankDetails1.setUserDetails("Rohini", 50000);
		bankDetails1.creditAmount(1000);
		bankDetails1.creditAmount(1000);
		bankDetails1.debitAmount(5000);
		bankDetails1.printBalance();
		bankDetails1.individualTransactionSummary();

		BankDetails bankDetails2 = new BankDetails();
		bankDetails2.setUserDetails("Krishna", 60000);
		bankDetails2.creditAmount(100);
		bankDetails2.creditAmount(200);
		bankDetails2.creditAmount(200);
		bankDetails2.creditAmount(300);
		bankDetails2.creditAmount(400);
		bankDetails2.debitAmount(1000);
		bankDetails2.debitAmount(500);
		bankDetails2.printBalance();
		bankDetails2.individualTransactionSummary();

		bankDetails1.allTransactionSummary();
		bankDetails2.allTransactionSummary();
	}

}
