package niveditaGavade;

class Bank1{
	int bal=1000;
	int debitCount=0;
	int creditCount=0;
	
	void debitAmount(int amt){
		if(amt<=bal){
		bal=bal-amt;
		debitCount++;
		}else
		{System.out.println ("Insuffcient fund");	
		}
	}
	void creditAmount(int amt){
		bal = bal+amt;
		creditCount++;	
	}
	void printInfo(){
		System.out.println("Total debit operation: "+ debitCount);
		System.out.println("Total credit operation: "+ creditCount);
		System.out.println("Current balance is  "+ bal);
	}
	
	public static void main(String[] args){
	Bank1 bank1= new Bank1();
	bank1.debitAmount(200);
	bank1.creditAmount(2000);
	bank1.debitAmount(5000);
	bank1.creditAmount(3000);
	bank1.printInfo();
	}
}