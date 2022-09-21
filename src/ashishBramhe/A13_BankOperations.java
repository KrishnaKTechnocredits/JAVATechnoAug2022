package ashishBramhe;

public class A13_BankOperations {

	static int totalCreditCount, totalDebitCount, totalPrintBalanceCount;
	int creditCount, debitCount, printBalanceCount, initialBalance, currentBalance;
	String userName;
	
	void setUserDetails(String userName, int initialBalance) {
		this.userName = userName;
		this.initialBalance = initialBalance;
		currentBalance = initialBalance;
	}
	
	void printIndividualTransactionSummary() {
		System.out.println("\n Transaction Summary for " + userName);
		System.out.println("Credit : " + creditCount + " times");
		System.out.println("Debit : " + debitCount + " times");
		System.out.println("Print Balance : " + printBalanceCount + " times");
	}
	
	void printTotalTransactionSummary() {
		System.out.println("\n Total Transaction Summary :");
		System.out.println("Credit : " + totalCreditCount + " times");
		System.out.println("Debit : " + totalDebitCount + " times");
		System.out.println("Print Balance : " + totalPrintBalanceCount + " times");
	}
	
	void printBalance() {
		System.out.println("\n Current Balance for User : " + userName + " : " + currentBalance);
		printBalanceCount++;
		totalPrintBalanceCount++;
	}
	
	void creditAmount(int amount) {
		currentBalance+=amount;
		creditCount++;
		totalCreditCount++;
	}
	
	void debitAmount(int amount) {
		currentBalance-=amount;
		debitCount++;
		totalDebitCount++;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A13_BankOperations bankOperations1 = new A13_BankOperations();
		A13_BankOperations bankOperations2 = new A13_BankOperations();		
		bankOperations1.setUserDetails("Ashish", 1000);
		bankOperations2.setUserDetails("Neha", 5000);		
		bankOperations1.creditAmount(500);
		bankOperations1.creditAmount(200);
		bankOperations1.debitAmount(100);
		bankOperations1.debitAmount(200);
		bankOperations2.creditAmount(500);
		bankOperations2.creditAmount(200);
		bankOperations2.debitAmount(100);
		bankOperations2.debitAmount(200);
		bankOperations1.printBalance();
		bankOperations2.printBalance();
		bankOperations1.printIndividualTransactionSummary();
		bankOperations2.printIndividualTransactionSummary();
		bankOperations1.printTotalTransactionSummary();
	}
}
