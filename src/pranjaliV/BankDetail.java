package pranjaliV;

class BankDetail {
	
	int balance = 2000;
	int creditCount = 0;
	int debitCount = 0;
	
	void creditAmt(int amt){
		balance = balance + amt;
		creditCount++;
	}
	
	void debitAmt(int amt){
		if(amt<=balance){
			balance = balance - amt;
			debitCount++;
		}
		else{
			System.out.println("Insufficient funds!");
		}
	}
	
	void printInfo(){
		System.out.println("Your current balance is : " + balance);
		System.out.println("No. of credit operations : " + creditCount);
		System.out.println("No. of debit operations : " + debitCount);
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
   		bankDetail.creditAmt(1000);	 
		bankDetail.debitAmt(400);
		bankDetail.printInfo();
		bankDetail.creditAmt(3000);
		bankDetail.creditAmt(1200);
		bankDetail.debitAmt(30000);
		bankDetail.debitAmt(200);
		bankDetail.debitAmt(200);
		bankDetail.printInfo();
	}
}