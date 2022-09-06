package sohail.if_else_program;

class Bank1{
	int balance=500;
	int amount;
	int creditcount;
	int debitcount;	
	int debitAmount( int amnt){
		if (amnt<=balance){			
			balance= balance-amnt;
				debitcount ++;			
		}
		else{
			System.out.println("Insufficient Funds because Account");
		}
		return amount;		
	}	
	void creditAmount(int amnt){
		balance=balance+amnt;
		creditcount ++;
	}	
	void printInfo(){
		System.out.println("Balance is "+balance);
		System.out.println("Count of Credit Operation " + creditcount);
		System.out.println("Count of Credit Operation " + debitcount);		
	}
	public static void main (String [] args){
			Bank1 bank1=new Bank1();
			bank1.debitAmount(20);
			bank1.debitAmount(100);
			bank1.debitAmount(200);
			bank1.creditAmount(100);
			bank1.creditAmount(100);
			bank1.creditAmount(100);
			bank1.printInfo();
	}
	
}