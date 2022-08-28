package saroj;
class Bank1{

	int creditCount = 0;
	int debitCount = 0;
	int balance = 15000;
	
	void debitAmount(int amt){
		if(amt<=balance){
			balance = balance - amt;
			debitCount++;	
		}else{
			System.out.println("Insufficent Balance");
		}
	}
	
	void creditAmount(int amt){
		balance = balance + amt;
		creditCount++;
	}
	
	void printInfo(){
		System.out.println("Current balance =" + balance);
		System.out.println("Total debit operation =" + debitCount);
		System.out.println("Total credit operation =" + creditCount);
	}
	
	public static void main(String[] args){
		Bank1 bank1 = new Bank1();
		bank1.creditAmount(3000);
		bank1.creditAmount(1000);
		bank1.debitAmount(7000);
		bank1.debitAmount(5000);
		bank1.debitAmount(8000);
		bank1.printInfo();
	}		
}