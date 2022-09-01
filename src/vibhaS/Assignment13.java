package vibhaS;

public class Assignment13 {
	int totalBalance=25000;
    int debitOp=0;
    int creditOp=0;
    int printBalance=0;
    static int totalPrintBalance;
    static int totalDebitOp=0;
    static int totalCreditOp=0;
	 
	void debitOp(int amount) {
		totalBalance=totalBalance-amount;
		debitOp++;
		totalDebitOp++;
	}
	
	void creditOp(int amount) {
		totalBalance=totalBalance+amount;
		creditOp++;
		totalCreditOp++;
	}
	
	void printBalance() {
		System.out.println("Current balance is  "+totalBalance);
		printBalance++;
		totalPrintBalance++;
	}
	
	void individualTransactionSummary() {
		System.out.println("Individual transaction summary");
		System.out.println("debit operation is => "+debitOp);
		System.out.println("Credit Operation is => "+creditOp);
		System.out.println("Print Balance method has call only  "+printBalance+" time");
	}
	
	void allTransactionSummary(){
		System.out.println("All transaction summary");
		System.out.println("Total debit operation is => "+totalDebitOp);
		System.out.println("Total Credit  operation is => "+totalCreditOp);
		System.out.println("Total Print Balance method has call only "+totalPrintBalance+" time");
	}
	
	public static void main(String[] args) {
		Assignment13 assignment13_1=new Assignment13();
		assignment13_1.debitOp(5000);
		assignment13_1.creditOp(2500);
		assignment13_1.creditOp(1000);
		System.out.println("Object 1st");
		assignment13_1.printBalance();
		
		Assignment13 assignment13_2=new Assignment13();
		assignment13_2.creditOp(1500);
		assignment13_2.creditOp(1500);
		assignment13_2.creditOp(1000);
		assignment13_2.creditOp(1000);
		assignment13_2.creditOp(2000);
		assignment13_2.debitOp(5000);
		assignment13_2.debitOp(5000);
		System.out.println("Object 2nd");
		assignment13_2.printBalance();
		System.out.println("");
		assignment13_1.individualTransactionSummary();
		System.out.println("");
		assignment13_1.allTransactionSummary();
	}
}
