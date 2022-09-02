package technocredits.basicexamples;

class BankDetail{
	int balance = 1000;
	int debitCount = 0;
		
	void debitAmt(int amt){
		if(amt<=balance){
			balance = balance - amt;
			debitCount++;
		}else{
			System.out.println("Insufficent fund");
		}
	}
	
	void printInfo(){
		System.out.println("Now your current balance is " + balance);
		System.out.println("Total debit operation : " + debitCount);
	//	System.out.println("Total credit operation : " + creditCount);
	}
	
}