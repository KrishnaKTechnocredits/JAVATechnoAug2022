package vibhaS;

class Bank{
	int balance=2000;
	int debitcount;
	int creditcount;
	
	void debitAmount(int amount){
		if(amount<=balance){
			balance=balance-amount;
			debitcount++;
		}else{
			System.out.println("Sorry! insufficient balance");
		}
	}
	
	void creditAmount(int amount){
		balance=balance+amount;
		creditcount++;
	}

    void printInfo(){
		System.out.println("Remaining amount is => " +balance);
		System.out.println("Total debit Count is => " +debitcount);
		System.out.println("Total credit Count is => " +creditcount);
	}
	
	public static void main(String[] args){
		Bank bank=new Bank();
		bank.debitAmount(200);
		bank.creditAmount(400);
		bank.creditAmount(400);
		bank.debitAmount(300);
		bank.debitAmount(100);
		bank.printInfo();
	}
}