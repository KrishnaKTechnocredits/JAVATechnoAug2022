package snehalJojare;

class BankDetail{
	int balance = 1000;
	int debitCount = 0;
	int creditCount = 0;
	
	void debitAmt(int amt){
		if(amt<= balance){
			balance = balance - amt;
			debitCount++;
		}
		else{ 
		System.out.println("Insufficient fund");
		}
		
	}
	void creditAmt(int amt){
		balance = balance + amt;
		creditCount++;
	}
	
	void printInfo(){
		System.out.println("Current Balane : " + balance);
		System.out.println("Total No. of Debit Transactions : " + debitCount);
		System.out.println("Total No. of Credit Transactions : " + creditCount);
	}
	
	public static void main (String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmt(100);
		bankDetail.debitAmt(1000);
		bankDetail.creditAmt(20000);
		bankDetail.debitAmt(5500);
		bankDetail.creditAmt(5000);
		bankDetail.debitAmt(10000);
		bankDetail.printInfo();
	}
}