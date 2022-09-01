package aishwaryaBirajdar;

class Bank{

	static int balance = 50000;
	int creditCount=0, debitCount=0;

	void debitAmount(int amount){
		
		if(balance>=amount){
			
			balance	=	balance - amount;
			debitCount++;			
		}
		else
		{
				System.out.println("Insufficient Fund");
		}
		
	}
	
	void creditAmount(int amount){
		
		balance	=	balance + amount;
		creditCount++;
		
	}
	
	void printInfo(){
		
		System.out.println("Total number of credit count is : "+creditCount);
		System.out.println("Total number of debit count is : "+debitCount);
		System.out.println("Current Balance : "+balance);
		
	}
	
	public static void main(String[] a){
		Bank bank = new Bank();
		bank.debitAmount(60000);
		bank.creditAmount(5000);
		bank.creditAmount(5000);
		bank.debitAmount(1000);
		bank.creditAmount(2000);
		bank.printInfo();
	}
}