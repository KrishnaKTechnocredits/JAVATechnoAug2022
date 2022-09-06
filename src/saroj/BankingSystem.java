package saroj;

public class BankingSystem {

	static int debit;
	static int credit;
	static int balance;
	int prntBalance;
	int debitCount;
	int creditCount;
	
	void debitAmount(int amt) {
		if(amt< balance) {
		balance = balance - amt;
		debit++;
		}else
			System.out.println("Insufficent balance: "+ balance);
	}
	
	void creditAmount(int amt) {
		balance = balance + amt;
		credit++;
	}
	void printBalance() {
		prntBalance++;
		System.out.println("Current balance: "+balance);
	}
	void individualTransactionSummary() {
		System.out.println("credit-"+credit +"times,"+"Debit-"+debit+"times,"+"printBalance-"+prntBalance+"time");
	}
	void setUserDetails(String userName, int initBalance ) {
	balance = initBalance;
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem1.setUserDetails("saroj", 5000);
		bankingSystem1.debitAmount(50);
		bankingSystem1.creditAmount(100);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		bankingSystem2.setUserDetails("Abhay", 15000);
		bankingSystem2.debitAmount(500);
		bankingSystem2.creditAmount(1000);
		bankingSystem2.printBalance();
		bankingSystem2.individualTransactionSummary();
	}
}
