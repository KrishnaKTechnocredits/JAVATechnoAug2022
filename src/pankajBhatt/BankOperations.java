package pankajBhatt;

class BankOperations{

	int balance=0, debitCount = 0, creditCount = 0;
	
	void creditAmount(int amount){
		balance+=amount;
		creditCount++;
	}
	
	void debitAmount(int amount){
		if(amount<=balance){
			balance-=amount;
			debitCount++;
		}else{
			System.out.println("Insufficient Balance to debit rupees: "+amount);
		}
	}
	
	void display(){
		System.out.println("Remaining Balance is : "+balance);
		System.out.println("Credit Count is : "+creditCount);
		System.out.println("Debit Count is : "+debitCount);
	}
	
	public static void main(String[] srgs){
		BankOperations bankOperations = new BankOperations();
		
		bankOperations.creditAmount(1000);
		bankOperations.debitAmount(200);
		bankOperations.debitAmount(500);
		bankOperations.creditAmount(150);
		bankOperations.creditAmount(250);
		bankOperations.creditAmount(5000);
		bankOperations.debitAmount(6000);
		bankOperations.display();
	}
}