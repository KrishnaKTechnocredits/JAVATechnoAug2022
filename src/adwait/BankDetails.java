package adwait;

class BankDetails{
	int balance = 20000;
	int debitCount;
	int creditCount;
	
	void debitAmount (int amt){
		if(amt <= balance){
			balance = balance - amt;
			debitCount++;
		}
		else{
			System.out.println("Insufficient fund");
		}
	}
}