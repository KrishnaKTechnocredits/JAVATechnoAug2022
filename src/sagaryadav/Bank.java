package sagaryadav;

class Bank{
	int bal=30000;
	int debitAmt;
	int creditAmt;
	
	void debitAmt(int amt){
		if(amt<=bal){
		bal=bal-amt;
		debitAmt++;			
	}else{
		System.out.println("Insufficient balance in the account");
	}
	}
	
	void creditAmt(int bal){
		this.bal=this.bal+bal;
		creditAmt++;			
	}
	
	void printInfo(){
		System.out.println("The updated balance of the account is: "+bal);
	}
	
	void display(){
		System.out.println("Credit Count: " +creditAmt);
		System.out.println("Debit Amount: " +debitAmt);		
	}
	
	public static void main(String[] args){
		Bank bank=new Bank();
		bank.creditAmt(23000);
		bank.debitAmt(50000);
		bank.printInfo();
		bank.creditAmt(5000);
		bank.debitAmt(65000);
		bank.printInfo();
		bank.display();
		
	}
}