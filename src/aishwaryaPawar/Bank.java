package aishwaryaPawar;

class Bank{
	int bal=5000;
	int creditCount;
	int debitCount;
	
	void printInfo(){
		System.out.println("Current Balance is "+bal);
		System.out.println("TOtal credit count is "+creditCount);
		System.out.println("Total debit Count is "+debitCount);
	}
	
	void creditInfo(int amount){
		bal=bal+amount;
		creditCount++;
		System.out.println(amount+" is Credited");
	}
	
	void debitInfo(int amount){
		if(amount<=bal){
			bal=bal-amount;
			debitCount++;
			System.out.println(amount+" is Debited");
		}else{
			System.out.println("Trying to Debit Amount "+amount+",Insufficient Balance");
	}
	}
	
	public static void main (String[] a){
		Bank bank= new Bank();
		bank.printInfo();
		bank.creditInfo(500);
		bank.creditInfo(1000);
		bank.debitInfo(200);
		bank.debitInfo(500);
		bank.debitInfo(6000);
		bank.printInfo();
	}
}
		
	