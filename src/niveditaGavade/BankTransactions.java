package niveditaGavade;

public class BankTransactions {
	String userName;
	int debit=0;
	int credit=0;
	int balance=0;
	int balCount=0;
	static int debitCount=0;
	static int creditCount=0;
	static int balanceCount=0;
	
	void userDetails(String userName, int balance){
		this.userName=userName;
		this.balance=balance;
	}
	
	void debitAmount(int deb){
		balance=balance-debit;
		debit++;
		debitCount++;
	}
	void creditAmount(int cred){
		balance=balance+credit;
		credit++;
		creditCount++;
	}

	void printBalance(){
		balance= balance+credit-debit;
		balCount++;
		balanceCount++;
	}
	void individualTransactionSummary(){
		System.out.println("Total number of debits for   "+ userName + " is "  +debit);
		System.out.println("Total number of credits for "+userName + " is "  + credit);
		System.out.println("Total number of print balance for "+userName+ " is "  + balCount);
	}
	
	void individualTransactionSummaryUser1AndUser2(){
		System.out.println("Total number of debits for both: "+debitCount);
		System.out.println("Total number of credits for both: "+creditCount);
		System.out.println("Total number of print balance for both: "+balanceCount);
	}
	public static void main(String[] args){
		BankTransactions bankTransactions1=new BankTransactions();
		bankTransactions1.userDetails("Satish", 10000);
		bankTransactions1.creditAmount(1000);
		bankTransactions1.creditAmount(1000);
		bankTransactions1.debitAmount(5000);
		bankTransactions1.printBalance();
		bankTransactions1.individualTransactionSummary();
		
		BankTransactions bankTransactions2=new BankTransactions();
		bankTransactions2.userDetails("Rashmi", 7000);
		bankTransactions2.creditAmount(2000);
		bankTransactions2.creditAmount(2000);
		bankTransactions2.creditAmount(2000);
		bankTransactions2.creditAmount(2000);
		bankTransactions2.creditAmount(2000);
		bankTransactions2.debitAmount(1000);
		bankTransactions2.debitAmount(1000);
		bankTransactions2.individualTransactionSummary();
		bankTransactions2.individualTransactionSummaryUser1AndUser2();
	}
}
