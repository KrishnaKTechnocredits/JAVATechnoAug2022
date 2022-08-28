package monikaDwivedi;
class BankDetails{
	int bal = 1500;
	
	void debitAmount(){
		bal = bal-500;
	}
	
	void creditAmount(){
		bal = bal +1000;
	}
	
	void display(){
		System.out.println(bal);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails1 = new BankDetails();
		bankDetails1.creditAmount();
		bankDetails1.creditAmount();
		bankDetails1.debitAmount();
		
		BankDetails bankDetails2 = new BankDetails();
		bankDetails2.debitAmount();
		
		bankDetails1.display();
		bankDetails2.display();
	}
}
