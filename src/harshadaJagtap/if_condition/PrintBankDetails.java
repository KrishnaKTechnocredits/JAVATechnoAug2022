package harshadaJagtap.if_condition;

public class PrintBankDetails {
	
	static int balance=10000; 
	String username;
	int debitCount=0;
	int credCount=0;
	int printBal=0;
	static int totalDebitCount=0;
	static int totalCreditCount=0;
	
	void setUserDetails(String username) {
			this.username=username;
			System.out.println("User Name is = " + this.username);
			System.out.println("Balance is = " + balance);
		}
	
	void debitAmt(int amt) {
		balance= balance-amt;
		debitCount++;
		totalDebitCount++;
	}

	void creditAmt(int amt) {
		balance= balance+amt;
		credCount++;
		totalCreditCount++;
	}
	
	void printBalance() {
		System.out.println("Balance is "+ balance);
		printBal++;
	}
	
	void individualTranSummery() {
		System.out.println("No. of debit Transactions = "+ debitCount);
		System.out.println("No. of credit Transactions = "+ credCount);
	}
	
	void allTranSummery() {
		System.out.println("No. of total debit Transactions = "+ totalDebitCount);
		System.out.println("No. of total credit Transactions = "+ totalCreditCount);
	}
	
	public static void main(String[] args) {
		PrintBankDetails user1=new PrintBankDetails();
		user1.setUserDetails("Harshada");
		user1.creditAmt(2000);
		user1.creditAmt(2000);
		user1.debitAmt(1000);
		user1.printBalance();
		user1.individualTranSummery();
		PrintBankDetails user2=new PrintBankDetails();
		user2.setUserDetails("Gaurav");
		user2.creditAmt(2000);
		user2.creditAmt(2000);
		user2.creditAmt(2000);
		user2.creditAmt(2000);
		user2.creditAmt(2000);
		user2.debitAmt(1000);
		user2.debitAmt(1000);
		user2.individualTranSummery();
		user2.allTranSummery();
	}
}
