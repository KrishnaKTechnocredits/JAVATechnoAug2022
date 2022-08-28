package shivaniGour;
class Bank{
	
     int balance=10000;
	 int debitCount;
	 int creditCount;
	 
	 void debit(int amt){
		 if(amt<=balance){
			 balance=balance-amt;
			 debitCount++;
		 }else{
			 System.out.println("Insufficient Funds");
		 }
	 }
	 
	 void credit(int amt2){
		 balance=balance+amt2;
		 creditCount++;
	 }
	 
	 void printInfo(){
		 System.out.println("Number of credit transactions :" +creditCount);
		 System.out.println("Number of debit transactions :" +debitCount);
		 System.out.println("Balance amount is :"+balance);
	 }
	 
	 public static void main (String[] args){
		 Bank bank1 = new Bank();
		 bank1.debit(1000);
		 bank1.credit(700);
		 bank1.debit(500);
		 bank1.credit(200);
		 bank1.debit(9600);
		 bank1.printInfo();
	 }
}

