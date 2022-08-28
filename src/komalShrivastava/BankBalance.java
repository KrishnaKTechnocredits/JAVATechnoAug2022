package komalShrivastava;

class BankBalance {

	int balance = 5000;
	int debitCount = 0;
	int creditCount = 0;
	
	void debit(int amount){
		if(amount <= balance){
			balance = balance - amount;
			debitCount++;
		} else {
			System.out.println("Insufficient Balance");
		}	
	}
	
	void credit(int amount){
		balance = balance + amount;
		creditCount++;
	}
	
	void printInfo(){
		System.out.println("Total Debit transactions : " + debitCount);
		System.out.println("Total Credit transactions : " + creditCount);
		System.out.println("Closing Balance : " + balance);
	}
	
	public static void main(String[] args){	
		BankBalance bankBalance = new BankBalance();
		bankBalance.debit(1000);
		bankBalance.credit(5000);
		bankBalance.debit(2000);
		bankBalance.credit(500);
		bankBalance.credit(2500);
		bankBalance.printInfo();
	}
}	
