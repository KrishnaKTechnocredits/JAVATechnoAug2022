package harshalRane;

class BankDetail{
	int balance = 10000;
	int debitCount;
	int creditCount;
	
	void debit(int debitAmount){
		if(debitAmount<=balance){
			balance = balance - debitAmount;
			debitCount++;
		}else{
			System.out.println("Insufficient funds");
		}
	}
	
	void credit(int creditAmount){
		balance = balance + creditAmount;
		creditCount++;
	}
	
	void printData(){
		System.out.println("Harshal your current balance is: " + balance);
		System.out.println("Total number of debit operations: " + debitCount);
		System.out.println("Total number of credit operations: " + creditCount);
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debit(5000);
		bankDetail.credit(10000);
		bankDetail.debit(2000);
		bankDetail.credit(5000);
		bankDetail.debit(1000);
		bankDetail.credit(2500);
		bankDetail.debit(20000);
		bankDetail.printData();
	}
}

