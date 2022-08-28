package ankitaBarwad;

class BankDetails{
	
	int balance = 1000;
	int debitCount;
	int creditCount;
	
	void debitInfo(int debitAmount){
		if(balance >= debitAmount){
			balance = balance - debitAmount;
			debitCount++;
		}
		else{
			System.out.println("InSufficient fund");
		}
	}
	
	void creditInfo(int creditAmount){
		balance = balance + creditAmount;
		creditCount++;
	}
	
	void printInfo(){
		System.out.println("Total Debit Operation : " + debitCount);
		System.out.println("Total Credit Operation : " + creditCount);
		System.out.println("Current Balance : " + balance);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.creditInfo(500);
		bankDetails.debitInfo(1000);
		bankDetails.debitInfo(500);
		bankDetails.creditInfo(2000);
		bankDetails.creditInfo(2000);
		bankDetails.debitInfo(4500);
		bankDetails.creditInfo(2000);
		bankDetails.printInfo();		
	}
}