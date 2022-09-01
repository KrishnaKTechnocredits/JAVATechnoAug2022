package shivaniLikhia;

public class BankingSystem {
	int balance = 100000;
	int debit = 0;
	int credit = 0;
	int printBalance = 0;
	static int totalDebitOp = 0;
	static int totalCreditOp = 0;
	static int totalPrintBalance;
	
	
	void debit(int amt) {
		if(amt<=balance) {
			balance = balance-amt;
			debit++;
			totalDebitOp++;
		}
		else {
			System.out.println("Insuffiecient Balance");
		}
	}
	
	void credit(int amt) {
		balance = balance+amt;
		credit++;
		totalCreditOp++;
	}
	
	void printBalance() {
		System.out.println("Current balance is  "+balance);
		printBalance++;
		totalPrintBalance++;
	}

	void individualTransactionSummary() {
		System.out.println("The individual Transaction Summary is : ");
		System.out.println("Debit Operations done for : " +debit+ " times.");
		System.out.println("Credit Operation is : " +credit+ " times. ");	
		System.out.println("Print Balance method has been called only "+printBalance+" times. ");
	}
	
	void allTransactionSummary(){
		System.out.println("All transaction summary");
		System.out.println("Total debit operations done " +totalDebitOp+ " times. ");
		System.out.println("Total Credit  operation done " +totalCreditOp+ "times. ");
		System.out.println("Total Print Balance method has been called "+totalPrintBalance+" times. ");
	}

	
	public static void main(String[] args) {
		
		BankingSystem bankingSystem_1 = new BankingSystem();
		bankingSystem_1.debit(5000);
		bankingSystem_1.credit(2500);
		bankingSystem_1.credit(1000);
		System.out.println("User 1");
		bankingSystem_1.printBalance();
		
		BankingSystem bankingSystem_2 = new BankingSystem();
		bankingSystem_2.credit(2000);
		bankingSystem_2.credit(1000);
		bankingSystem_2.credit(2500);
		bankingSystem_2.credit(2200);
		bankingSystem_2.credit(1800);
		bankingSystem_2.debit(5000);
		bankingSystem_2.debit(3000);
		System.out.println("User 2");
		bankingSystem_2.printBalance();
		System.out.println("");
		bankingSystem_2.individualTransactionSummary();
		System.out.println("");
		bankingSystem_2.allTransactionSummary();


		
	}
}
