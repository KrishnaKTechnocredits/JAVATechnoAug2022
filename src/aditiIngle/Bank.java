package aditiIngle;
class Bank{

	int balance=1000;
	int debitCount=0;
	int creditCount=0;
	
	void debitAmount(int amount){
		if (amount <= balance){
			balance = balance - amount;
			debitCount++;
		}
		else{
			System.out.println("Insufficient balance in account");
		}
		
	}
	
	void creditAmount(int amount){
		balance = balance + amount;
		creditCount++;
	}
	void printInfo(){
		System.out.println("Current available balance is :" + balance);
		System.out.println("No. of debit transactions are: "+ debitCount);
		System.out.println("No. of credit transactions are: "+ creditCount);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmount(1001);
		bank.creditAmount(1000);
		bank.debitAmount(500);
		bank.creditAmount(200);
		bank.debitAmount(200);
		bank.printInfo();
	}
}