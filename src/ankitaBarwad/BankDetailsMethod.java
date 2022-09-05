package ankitaBarwad;

//Assignment No.13
public class BankDetailsMethod {

	int balance;
	String userName;
	int individualDebitCount;
	int individualCreditCount;
	int individualBalanceCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalBalanceCount;

	void setUserDetails(String userName, int balance) {
		this.userName = userName;
		this.balance = balance;
		System.out.println("Username : " + userName + " ,Initial Balance : " + balance);
	}

	void debitInfo(int debitAmount) {
		if (balance >= debitAmount) {
			balance = balance - debitAmount;
			individualDebitCount++;
			totalDebitCount++;
		} else {
			System.out.println("InSufficient fund");
		}
	}

	void creditInfo(int creditAmount) {
		balance = balance + creditAmount;
		individualCreditCount++;
		totalCreditCount++;
	}

	void printBalance() {
		System.out.println("Current Balance : " + balance);
		individualBalanceCount++;
		totalBalanceCount++;
	}

	void individualTransactionSummary() {
		System.out.println(
				"User " + userName + " Transaction summary : Credit - " + individualCreditCount + " times, Debit - "
						+ individualDebitCount + " times, printBalance - " + individualBalanceCount + " time" + "\n");
	}

	static void totalSummary() {
		System.out.println("All transaction summary : Credit - " + totalCreditCount + " times, Debit - "
				+ totalDebitCount + " times, printBalance - " + totalBalanceCount + " time");
	}

	public static void main(String[] args) {
		BankDetailsMethod bankDetailsMethod1 = new BankDetailsMethod();
		bankDetailsMethod1.setUserDetails("Ankita", 10000);
		bankDetailsMethod1.creditInfo(1200);
		bankDetailsMethod1.creditInfo(1200);
		bankDetailsMethod1.debitInfo(6000);
		bankDetailsMethod1.printBalance();
		bankDetailsMethod1.individualTransactionSummary();

		BankDetailsMethod bankDetailsMethod2 = new BankDetailsMethod();
		bankDetailsMethod2.setUserDetails("Rekha", 8800);
		bankDetailsMethod2.creditInfo(200);
		bankDetailsMethod2.creditInfo(1200);
		bankDetailsMethod2.creditInfo(600);
		bankDetailsMethod2.creditInfo(100);
		bankDetailsMethod2.creditInfo(300);
		bankDetailsMethod2.debitInfo(8000);
		bankDetailsMethod2.individualTransactionSummary();

		BankDetailsMethod.totalSummary();
	}

}
