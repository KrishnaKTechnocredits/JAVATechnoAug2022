package swatiM.assignments;
class BankDetails{
	int balance = 500;
	int creditcount,debitcount;
	
	void creditAmount(int amount){
		 balance = balance + amount;
         creditcount++;
	}
	void debitAmount(int amount){
		 if(amount<=balance)
		 {
		 balance = balance - amount;
         debitcount++;
	}else
	 {
		System.out.println("Insufficient balance");
	 }
   }
	void printdetails(){
		System.out.println("current balance is  : " + balance);
		System.out.println("total number of perform credit action  : " + creditcount);
		System.out.println("total number of perform debit action  : " + debitcount);
	}
	public static void main(String[] a){
		BankDetails bank = new BankDetails();
		bank.creditAmount(100);
		bank.printdetails();
		bank.debitAmount(200);
		bank.creditAmount(100);
		bank.printdetails();
		bank.debitAmount(600);
		bank.printdetails();
	}
	}