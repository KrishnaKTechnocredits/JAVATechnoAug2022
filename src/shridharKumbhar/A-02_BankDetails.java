package shridharKumbhar;

class BankDetails{

	int bal = 1500;
	
	void debitAmt(){
		bal = bal - 500;
	}
	
	void creditAmt(){
		bal = bal + 1000;
	}
	
	void display(){
		System.out.println(bal);
	}
	
	public static void main(String[] a){
		BankDetails bankdetails1 = new BankDetails();
		bankdetails1.creditAmt();
		bankdetails1.creditAmt();
		bankdetails1.debitAmt();
		
		BankDetails bankdetails2 = new BankDetails();
		bankdetails2.debitAmt();
		
		bankdetails1.display();
		bankdetails2.display();
	}
}
