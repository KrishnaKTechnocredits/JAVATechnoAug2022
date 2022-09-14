package shrutiArora;
public class Assignment13 {
	int balance;
	String userName;
	int individualDebitCount;
	int individualCreditCount;
	int individualBalanceCount;
	static int debitCount;
	static int creditCount;
	static int balanceCount;

	void setUserDetails(String userName, int balance) {
		this.userName = userName;
		this.balance = balance;
		System.out.println("Username : " + userName + " ,Initial Balance : " + balance);
	}
    void debitInfo(int debitAmount) {
		if (balance >= debitAmount) {
			balance = balance - debitAmount;
			individualDebitCount++;
			debitCount++;
		}
	    else {
			System.out.println("InSufficient Amount");
		}
	}
    void creditInfo(int creditAmount) {
		balance = balance + creditAmount;
		individualCreditCount++;
		creditCount++;
	}

 	void printBalance() {
		System.out.println("Current Balance : " + balance);
		individualBalanceCount++;
		balanceCount++;
	}

	void individualTransactionSummary() {
		System.out.println("User: " + userName + " Transaction summary : Credit - " + individualCreditCount + " times, Debit - "
				+ individualDebitCount + " times, printBalance - " + individualBalanceCount + " time ");
	}

	static void totalSummary() {
		System.out.println("All transaction summary : Credit - " + creditCount + " times, Debit - "+ debitCount + " times, printBalance - " + balanceCount + " time");
	}
				
	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		System.out.println("****************************************************User1 Bank Details*************************");
		assignment13.setUserDetails("Shruti", 20000);
		assignment13.creditInfo(800);
		assignment13.creditInfo(600);
		assignment13.debitInfo(2500);
		assignment13.printBalance();
		assignment13.individualTransactionSummary();
		System.out.println();
		Assignment13 assignment13_2 = new Assignment13();
		System.out.println("****************************************************User2 Bank Details*************************");
		assignment13_2.setUserDetails("Shreya", 30000);
		assignment13_2.creditInfo(2000);
		assignment13_2.creditInfo(800);
		assignment13_2.creditInfo(300);
		assignment13_2.creditInfo(250);
		assignment13_2.creditInfo(300);
		assignment13_2.debitInfo(5500);
		assignment13_2.debitInfo(2000);
		assignment13_2.individualTransactionSummary();
        assignment13_2.totalSummary();
	}
}