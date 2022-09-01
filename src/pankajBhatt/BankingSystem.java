package pankajBhatt;

public class BankingSystem {
	
	String username;
	double initialBalance;
	int debitCount = 0,  creditCount = 0, checkBalanceCount = 0;
	
	static int uniDebitCount = 0, uniCreditCount = 0, uniCheckBalanceCount =0 ;
	
	void setUserDetails(String userName, double initialBalance) {
		this.username = userName;
		this.initialBalance = initialBalance;
		System.out.println("User Name = "+userName+", Initial Balance is : "+initialBalance);
	}

	void creditAmount(int amount){
		initialBalance+=amount;
		creditCount++;
		uniCreditCount++;
	}
	
	void debitAmount(int amount){
		if(amount<=initialBalance){
			initialBalance-=amount;
			debitCount++;
			uniDebitCount++;
		}else{
			System.out.println("Insufficient Balance to debit rupees: "+amount);
		}
	}	
	
	void printBalance(){
		checkBalanceCount++;
		uniCheckBalanceCount++;
		System.out.println("Current Balance is : "+initialBalance);
	}
	
	void individualTransactionSummary() {
		System.out.println("Check Balance Count is : "+checkBalanceCount);
		System.out.println("Credit Count is : "+creditCount);
		System.out.println("Debit Count is : "+debitCount);
	}
	
	static void allTransactionSummary() {
		System.out.println("All Transaction Summary : ");
		System.out.println("Check Balance Count is : "+uniCreditCount);
		System.out.println("Credit Count is : "+uniCreditCount);
		System.out.println("Debit Count is : "+uniDebitCount);
	}
	
	public static void main(String[] args) {
	
		BankingSystem bankingSyetemUser1 = new BankingSystem();
		bankingSyetemUser1.setUserDetails("Pankaj Bhatt", 1000);
		bankingSyetemUser1.debitAmount(200);
		bankingSyetemUser1.creditAmount(2000);
		bankingSyetemUser1.debitAmount(200);
		bankingSyetemUser1.printBalance();
		bankingSyetemUser1.individualTransactionSummary();
		System.out.println(" ");
		
		BankingSystem bankingSyetemUser2 = new BankingSystem();
		bankingSyetemUser2.setUserDetails("Pankaj", 10000);
		bankingSyetemUser2.debitAmount(200);
		bankingSyetemUser2.creditAmount(2000);
		bankingSyetemUser2.debitAmount(200);
		bankingSyetemUser2.printBalance();
		bankingSyetemUser2.debitAmount(200);
		bankingSyetemUser2.creditAmount(2000);
		bankingSyetemUser2.debitAmount(200);
		bankingSyetemUser2.printBalance();
		bankingSyetemUser2.debitAmount(200);
		bankingSyetemUser2.creditAmount(2000);
		bankingSyetemUser2.debitAmount(200);
		bankingSyetemUser2.printBalance();
		bankingSyetemUser2.individualTransactionSummary();
		System.out.println(" ");

		BankingSystem.allTransactionSummary();
	}
}
