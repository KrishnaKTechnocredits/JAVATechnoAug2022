package adittyThakare;

public class Assignment13 {
	static int debitCount, creditCount, printBalance, balance;
	int individualDebitCount , invidualCreditCount , individualPrintBalance;
	
	void setUserDetails(String username, int initialBalance) {
		balance=initialBalance;
		System.out.println("------- Transaction details -------");
		System.out.println("Username: "+username);
		System.out.println("Initial balance: "+initialBalance);
	}
	
	void debitAmount(int amount) {
		if(amount<=balance){
			balance = balance - amount;
			debitCount++;
			individualDebitCount++;
		}else{
			System.out.println("Debit cannot be performed. Insufficient balance!!");
		}
	}
	
	void creditAmount(int amount) {
		balance = balance + amount;
		creditCount++;
		invidualCreditCount++;
	}
	
	void printBalance() {
		System.out.println("Current account balance is: "+balance+"\n");
		printBalance++;
		individualPrintBalance++;
	}
	
	void individualTransactionSummary() {
		System.out.println("Account debited "+individualDebitCount+" times");
		System.out.println("Account credited "+invidualCreditCount+" times");
		System.out.println("Print balance "+individualPrintBalance+" times");
	}
	
	void allTransactionSummary() {
		System.out.println("##### Total bank transaction details #####");
		System.out.println("Debit transactions count: "+debitCount);
		System.out.println("Credit transactions count: "+creditCount);
		System.out.println("Print balance count: "+printBalance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment13 user1 = new Assignment13();
		user1.setUserDetails("Aditty", 50000);
		user1.creditAmount(2000);
		user1.debitAmount(18000);
		user1.creditAmount(8000);
		user1.individualTransactionSummary();
		user1.printBalance();
		
		Assignment13 user2 = new Assignment13();
		user2.setUserDetails("Nisha", 80000);
		user2.creditAmount(2000);
		user2.debitAmount(12000);
		user2.creditAmount(2000);
		user2.creditAmount(2000);
		user2.debitAmount(18000);
		user2.creditAmount(2000);
		user2.creditAmount(20000);
		user2.individualTransactionSummary();
		user2.printBalance();
		
		user1.allTransactionSummary();	
	}

}
