package pujaSah;

class Example2{

	int balance=1000;
	
	 void debitAmt(){
		int balance=3000;
		balance=balance-2400;
	}
	
	void creditAmt(){
		balance=balance+1000;
	}
	
	void display(){
		System.out.println("Now balance is "+balance);
	}
	
	public static void main(String[] args){
		Example2 example2=new Example2();
		example2.debitAmt();
		example2.creditAmt();
		example2.display();
	}
}
	
		
		
		
		
		
		
		
 