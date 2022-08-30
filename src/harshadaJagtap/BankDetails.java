package harshadaJagtap;

class BankDetails{
	int balance=1000;
	int debitCount;
	int credCount;
	
	void debitAmt(int amt){
		if(amt<=balance){
			balance=balance-amt;
			debitCount++;
		}
		else{
			System.out.println("Insufficient Balance");
		}
	}
	
	void credAmt(int amt){
		balance=balance+amt;
		credCount++;
	}
	
	void printInfo(){
		System.out.println("Total Balance is "+ balance);
		System.out.println("No. of debit transactions " + debitCount);
		System.out.println("No. of Credit transactions " + credCount);
	}

	public static void main(String[]args){
		BankDetails bankDetails= new BankDetails();
		bankDetails.debitAmt(100);
		bankDetails.debitAmt(200);
		bankDetails.debitAmt(300);
		bankDetails.credAmt(600);
		bankDetails.credAmt(1000);
		bankDetails.debitAmt(500);
		bankDetails.credAmt(1500);
		bankDetails.printInfo();
	}
}