package harshalRane;

class BankingSystem1{
	int balance;
	int debitCount;
	int creditCount;
	int printBalanceCount;
	static int deb;
	static int cred;
	static int printBal;
	
	void setUserDetails(String user, int bal){
		balance = bal;
		System.out.println("-------");
		System.out.println(user);
		System.out.println("-------");
		System.out.println("Your Initial Balance is: " +balance); 	
	}
	
	void creditAmount(int credit){
		balance = balance + credit;
		creditCount++;
		cred++;
	}
	
	void debitAmount(int debit){
		balance = balance - debit;
		debitCount++;
		deb++;
	}
	
	void printBalance(){
		System.out.println("Your Current Balance is " + balance);
		printBalanceCount++;
		printBal++;
	}
	
	void individualTransactionSummary(){
		System.out.println("\nTransaction Summary:");
		System.out.println("Credited: "+creditCount+" times");
		System.out.println("Debited: "+debitCount+" times");
		System.out.println("Balance Printed: "+printBalanceCount+" time\n");
	}
	
	void allTransactionSummary(){
		System.out.println("-----------------------");
		System.out.println("All Transaction Summary:");
		System.out.println("-----------------------");
		System.out.println("Credited: "+cred+" times");
		System.out.println("Debited: "+deb+" times");
		System.out.println("Balance Printed: "+printBal+" time\n");
	}
	
	public static void main(String[] args){
		BankingSystem1 bankingSystem1 = new BankingSystem1();
		bankingSystem1.setUserDetails("User1",10000);
		bankingSystem1.creditAmount(1000);
		bankingSystem1.debitAmount(2000);
		bankingSystem1.creditAmount(5000);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		
		BankingSystem1 bankingSystem2 = new BankingSystem1();
		bankingSystem2.setUserDetails("User2",50000);
		bankingSystem2.creditAmount(1500);
		bankingSystem2.debitAmount(2600);
		bankingSystem2.creditAmount(2500);
		bankingSystem2.debitAmount(600);
		bankingSystem2.creditAmount(7000);
		bankingSystem2.creditAmount(300);
		bankingSystem2.creditAmount(1000);
		bankingSystem2.individualTransactionSummary();
		
		bankingSystem2.allTransactionSummary();
		
	}	
}