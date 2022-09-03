package rohanNaik;

class Bank{
	
	int balance = 2000;
	int debitcount;
	int creditcount;
		
	void debitAmount(int damount){
		
		if(balance < damount){
			System.out.println("Insufficient Balance!!!");
		}
		else{
		balance = balance - damount;
		debitcount++;
		}
	}
	
	void creditAmount(int camount){
		balance = balance + camount;
		creditcount++;
	}
	
	void printInfo(){
		System.out.println("Total debit operations are" + (debitcount));
		System.out.println("Total credit operations are" + (creditcount));
		System.out.println("Current Balance is" + balance);
	}
	
	public static void main (String[] a){
		Bank bank = new Bank();
		bank.creditAmount(1000);
		bank.debitAmount(5000);
		bank.creditAmount(8000);
		bank.printInfo();
		
		
	}
}