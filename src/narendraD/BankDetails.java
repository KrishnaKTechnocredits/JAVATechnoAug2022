package narendraD;

class BankDetails{
	int bal = 1500;
	
	void debitAmount(){
		bal = bal-500;
	}
	
	void creditAmount(){
		bal = bal+1000;
	}
	
	void display(){
		System.out.println(bal);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails1 = new BankDetails();
		bankDetails1.creditAmount(); //bal= 1500+1000 = 2500
		bankDetails1.creditAmount(); //bal= 2500+1000 = 3500
		bankDetails1.debitAmount(); //bal= 3500-500 = 3000
		
		BankDetails bankDetails2 = new BankDetails();
		bankDetails2.debitAmount(); // 1500-500 = 1000
		
		bankDetails1.display(); // ans is 3000
		bankDetails2.display(); // ans is 1000
	}
}