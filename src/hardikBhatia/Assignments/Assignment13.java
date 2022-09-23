package hardikBhatia.Assignments;

public class Assignment13 {
	
	static String username  = "";
	static int balance  = 0;
	static int sCredit = 0;
	static int sDebit = 0;
	static int sPrintBalance = 0;
	int credit = 0;
	int debit = 0;
	int printBalance = 0;
	
	void setUserDetails(String user, int intialBal) {
		username = user;
		balance = intialBal;
	}
	
	void printBalance() {
		System.out.println("Balance : " + balance);
		sPrintBalance++;
		printBalance++;
	}
	
	void debitAmount(int amount) {
		if(balance > amount) {
			balance = balance - amount;
			debit++;
			sDebit++;
		}else {
			System.out.println("Insufficient Balance.");
		}
	}
	
	void creditAmount(int amount) {
		balance = balance + amount;
		credit++;
		sCredit++;
	}
	
	void individualTransactionSummary() {
		System.out.println("Individual transaction summary : Credit - " + credit + " times, Debit - " + debit + " times, printBalance - " + printBalance +" time");
	}
	
	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - " + sCredit + " times, Debit - " + sDebit + " times, printBalance - " + sPrintBalance +" time");
	}
	
	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.setUserDetails("Hardik", 10000);
		assignment13.printBalance();
		assignment13.debitAmount(1000);
		assignment13.creditAmount(10000);
		assignment13.printBalance();
		assignment13.individualTransactionSummary();
		System.out.println("================================================================================================================================");
		
		Assignment13 assignment13_1 = new Assignment13();
		assignment13_1.setUserDetails("User 2", 10000);
		assignment13_1.printBalance();
		assignment13_1.debitAmount(10000);
		assignment13_1.creditAmount(10000);
		assignment13_1.debitAmount(10000);
		assignment13_1.debitAmount(10000);
		assignment13_1.creditAmount(10000);
		assignment13_1.printBalance();
		assignment13_1.individualTransactionSummary();
		System.out.println("================================================================================================================================");
		
		assignment13.allTransactionSummary();
	}

}
