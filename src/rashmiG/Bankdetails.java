package rashmiG;

class Bankdetails{
	int balance = 15000;
	int debitCount;
	int creditCount;
	
	void debitAmt(int amt){
		if(amt<=balance && amt>0){
			balance=balance-amt;
			debitCount++;
		}
		else{
			System.out.println("Insufficient amount to debit");
		}
	}
	
	void creditAmt(int amt){
		if(amt>0){
			balance=balance+amt;
			creditCount++;
		}
		else{
			System.out.println("Credit amount cannot be zero or negative");
		}
	}
	
	void printInfo(){
		System.out.println("Total balance : "+balance);
		System.out.println("Debit operation is done "+debitCount+" times");
		System.out.println("Credit operation is done "+creditCount+" times");
	}
	
	public static void main(String[] args){
		Bankdetails bankdetails = new Bankdetails();
		bankdetails.debitAmt(2000);
		bankdetails.creditAmt(-9);
		bankdetails.debitAmt(16000);
		bankdetails.creditAmt(7000);
		bankdetails.debitAmt(5000);
		bankdetails.creditAmt(1000);
		bankdetails.printInfo();
	}
}
	