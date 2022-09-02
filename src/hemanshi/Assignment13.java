package hemanshi;

public class Assignment13 {
	static int debitCount, creditCount, printBalance, balance;
	int individualDebitCount , invidualCreditCount , individualPrintBalance;
	
	void setUserDetails(String username, int StartingBalance) {
		balance=StartingBalance;
		System.out.println("--+++++ Transaction details +++++--");
		System.out.println("Username: "+username);
		System.out.println("Initial balance: "+StartingBalance);

}
	void DebitAmount(int amount) {
		if(amount<=balance){
			balance = balance - amount;
			debitCount++;
			individualDebitCount++;
		}else{
			System.out.println("Money cannot be debited. Insufficient balance!!");
		}
	}
	
	void CreditAmount(int amount) {
		balance = balance + amount;
		creditCount++;
		invidualCreditCount++;
	}
	
	void PrintBalance() {
		System.out.println(" Your Current account balance is: "+balance+"\n");
		printBalance++;
		individualPrintBalance++;
	}
	
	void IndividualTransactionSummary() {
		System.out.println("Account debited "+individualDebitCount+" times");
		System.out.println("Account credited "+invidualCreditCount+" times");
		System.out.println("Print balance "+individualPrintBalance+" times");
	}
	
	void AllTransactionSummary() {
		System.out.println("*****Total bank transaction details *****");
		System.out.println("Debit transactions count: "+debitCount);
		System.out.println("Credit transactions count: "+creditCount);
		System.out.println("Print balance count: "+printBalance);
	}
	
	public static void main(String[] args) {
	
		Assignment13 client1 = new Assignment13();
		client1.setUserDetails("Hemu", 50000);
		client1.CreditAmount(4000);
		client1.DebitAmount(20000);
		client1.CreditAmount(8000);
		client1.IndividualTransactionSummary();
		client1.PrintBalance();
		
		Assignment13 client2 = new Assignment13();
		client2.setUserDetails("Himss", 10000);
		client2.CreditAmount(3000);
		client2.DebitAmount(12000);
		client2.CreditAmount(2000);
		client2.CreditAmount(2000);
		client2.DebitAmount(15000);
		client2.CreditAmount(3000);
		client2.CreditAmount(20000);
		client2.IndividualTransactionSummary();
		client2.PrintBalance();
		
		client1.AllTransactionSummary();	
	}

}
	
	