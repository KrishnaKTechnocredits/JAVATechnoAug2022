package adittyThakare;

class BankDetails{
	int balance = 1000;
	int debitCount = 0;
	int creditCount = 0;
	
	void debitAmount(int amount){
		if(amount<=balance){
			balance = balance - amount;
			debitCount++;
		}else{
			System.out.println("Debit cannot be performed. Insufficient balance!!");
		}
	}

	void creditAmount(int amount){
		balance = balance + amount;
		creditCount++;
	}

	void displayBalance(){
		System.out.println("Current account balance is : "+balance);
		System.out.println("Debit transactions count : "+debitCount);
		System.out.println("Credit transactions count : "+creditCount);
	}

	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmount(500);
		bankDetails.debitAmount(300);	
		bankDetails.creditAmount(2000);	
		bankDetails.debitAmount(500);
		bankDetails.displayBalance();
		bankDetails.debitAmount(2000);
		bankDetails.displayBalance();
	}
}	