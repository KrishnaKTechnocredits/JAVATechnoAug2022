package akankshaSharma;
class Bank{ 
	int balance = 20000; 
	int debitCount; 
	int creditCount; 

	void debitAmount(int amt){ 
		if(amt<=balance){ 
			balance = balance - amt; debitCount++; 
			} 
		else{
			System.out.println( " Can't process request due to insufficient Balance"); 
			} 
	}
 
	void creditAmount(int amt){
		balance = balance + amt; creditCount++; 
	}
	
	void printInfo(){
		System.out.println(" Now Available Balance is " + balance); 
		System.out.println(" Credit count is " + creditCount); 
		System.out.println (" Debit Count is " + debitCount);
	} 
		
		public static void main(String[] args){
			Bank bank = new Bank(); 
			bank.debitAmount(222000); 
			bank.creditAmount(1000);
			bank.printInfo(); bank.creditAmount(5000); 
			bank.debitAmount(3000); 
			bank.debitAmount(1000); 
			bank.creditAmount(500);
			bank.printInfo(); 
		}
}