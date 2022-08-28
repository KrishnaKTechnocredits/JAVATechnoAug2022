package mohiniA;

class BankDetail{
	int balance = 1000;
	int debitcount = 0;
	int credcount=0;
	
	void debitAmt(int amt){
		if(amt <= balance){
			balance = balance - amt;
			debitcount++;			
		} else {
			System.out.println("Insufficent fund");
		}
	}

	void credAmt(int amt){
			balance =balance + amt;
			credcount++;			
	}
	void printInfo(){
		System.out.println(" Your Current Balance is : " + balance);
		System.out.println("Total debit operation : "+ debitcount);
		System.out.println("Total credit Operation : " + credcount);
		
	}
	
	public static void main(String[] args) {
		BankDetail BankDetail1 = new BankDetail();
		BankDetail1.debitAmt(500);
		BankDetail1.credAmt(1000);
		BankDetail1.debitAmt(300);
		BankDetail1.printInfo();
	}
}