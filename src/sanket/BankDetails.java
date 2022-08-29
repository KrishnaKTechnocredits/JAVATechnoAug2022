package sanket;

class BankDetails{
	int balance = 100000;
	int debitCount;
	int creditCount;
	
	void debitAmt(int amt){
		if(amt<=balance){
		balance = balance - amt;
		debitCount++;
		}else{
			System.out.println("Insufficient Balance.");
		}
	}
	
	void creditAmt(int amt){
		balance = balance - amt;
		creditCount++;
	}
	
	void display(){
		System.out.println("Balance is : " + balance);
		System.out.println("Credit count is : " + creditCount); 
		System.out.println("Debit count is : " + debitCount);				
	}
	
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.creditAmt(2000);
		bankDetails.debitAmt(7000);
		bankDetails.creditAmt(5000);
		bankDetails.debitAmt(6000);
		bankDetails.debitAmt(4000);
		bankDetails.creditAmt(7500);
		bankDetails.creditAmt(5500);
		bankDetails.display();	
	}
}