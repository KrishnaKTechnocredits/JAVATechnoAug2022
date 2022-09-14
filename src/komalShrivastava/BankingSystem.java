package komalShrivastava;

public class BankingSystem {
	String name;
	int balance;
	int debitCount;
	int creditCount;
	int printBalance;
	static int alldebitCount;
	static int allcreditCount;
	static int allprintBalance;
	
	void setUserDetails(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	void debit(int amount) {
		if(amount <= balance) {
			balance = balance - amount;
			debitCount++;
			alldebitCount++;
		}else
			System.out.println("Insufficient Balance");
	}
	
	void credit(int amount) {
		balance = balance + amount;
		creditCount++;
		allcreditCount++;
	}
	
	void printBalance() {
	//	System.out.println(balance);  //Currently in requirement it is not mentioned to print the balance amount.
		printBalance++;
		allprintBalance++;
	}
	
	void individualTransactionSummary() {
		System.out.println(name + " transaction summary : Credit - " + creditCount + " times, Debit - " + debitCount + " times , Print Balance - " + printBalance);
	}
	
	void allTransactionSummary() {
		System.out.print("Total Credit - " + allcreditCount + " times, Total Debit - " + alldebitCount + " times , Print Balance - " + allprintBalance);
	}
	
	public static void main(String[] args) {
		BankingSystem bankingSystem1 = new BankingSystem();
		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem1.setUserDetails("User 1", 10000);
		bankingSystem1.debit(2000);
		bankingSystem1.credit(10000);
		bankingSystem1.credit(4000);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		bankingSystem2.setUserDetails("User 2", 5000);
		bankingSystem2.credit(2000);
		bankingSystem2.credit(4000);
		bankingSystem2.credit(7000);
		bankingSystem2.credit(1000);
		bankingSystem2.credit(3000);
		bankingSystem2.debit(9000);
		bankingSystem2.debit(3000);
		bankingSystem2.individualTransactionSummary();
		bankingSystem1.allTransactionSummary();
	}
}