package apurvaBabel;

class Bank{
	int balance = 5000;
	int debitCount = 0;
	int creditCount = 0;
	
	void debitAmount(int amount){
		if (amount<=balance){
			balance = balance-amount;
			debitCount++;
		} else{
			System.out.println("Insufficient Fund");
		}
	}
	void creditAmount(int amount){
		balance = balance+amount;
		creditCount++;
	}
	void printInfo(){
		System.out.println("Your current balance is " + balance);
		System.out.println("Total debit operations : " + debitCount);
		System.out.println("Total credit operations : " + creditCount);
	}
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmount(3000);
		bank.creditAmount(2000);
		bank.creditAmount(1500);
		bank.debitAmount(5000);
		bank.debitAmount(1000);
		bank.printInfo();
	}
}