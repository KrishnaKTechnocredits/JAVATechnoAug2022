package ashishBramhe;

class A3_Bank{
	
	int balance = 1000, creditCount = 0, debitCount = 0;
	
	void creditAmount(int amt){
		balance = balance + amt;
		creditCount++;
	}
	
	void debitAmount(int amt){
		if(balance < amt)
			System.out.println("Insufficient Balance");
		else{
			balance = balance - amt;
			debitCount++;
		}
	}
	
	void printInfo(){
		System.out.println("Credit Operation Performed " + creditCount + " times");
		System.out.println("Debit Operation Performed " + debitCount + " times");
		System.out.println("Current Balance : " + balance);
	}
	
	public static void main(String args[]){
		A3_Bank bank = new A3_Bank();
		bank.creditAmount(1000);
		bank.debitAmount(500);
		bank.debitAmount(100);
		bank.creditAmount(700);
		bank.printInfo();
	}
}