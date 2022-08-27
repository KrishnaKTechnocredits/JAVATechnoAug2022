class BankOperations{

    int balance=10000;
	int debitCount = 0;
	int creditCount = 0;
	
	void creditAmount(int amount){
	 balance+=amount;
	 creditCount++;
	}
	
	void debitAmount(int Amount){
		if(Amount<=balance){
			 balance-=Amount;
			 debitCount++;
		}else{
			 System.out.println("Insufficient Balance to debit rupees; "+Amount);
		}
	}
	void display(){
		System.out.println("Remaining Balance is : "+balance);
		System.out.println("Credit Count is : "+creditCount);
		System.out.println("Debit Count is : "+debitCount);
	}
	
	public static void main(String[] args){
		BankOperations bankOperations = new BankOperations();
		
		bankOperations.creditAmount(9000);
		bankOperations.debitAmount(500);
		bankOperations.debitAmount(200); 
		bankOperations.creditAmount(450);
		bankOperations.creditAmount(250);
		bankOperations.creditAmount(3000);
		bankOperations.debitAmount(7000);
		bankOperations.display();
	}
	
}
		  