package priyankaD;

class Bank
{
    int amount=2000;
	int debitCount=0;
	int creditCount=0;
	
	void debitAmt(int bal){
	amount=amount-bal;
	debitCount++;
	}
	
	void creditAmt(int bal1){
	amount=amount+bal1;
	creditCount++;
	}
	void display(){
	System.out.println("The current amount is"+amount);
	System.out.println("The total debit count is"+debitCount);
	System.out.println("The total credit count is"+creditCount);
	}
	
	public static void main(String[]args){
	Bank bank1=new Bank();
	bank1.debitAmt(1000);
	bank1.creditAmt(2000);
	bank1.debitAmt(1000);
	bank1.debitAmt(1000);
	bank1.creditAmt(2000);
	bank1.creditAmt(1000);
	bank1.debitAmt(1000);
	bank1.display();
	
	}
}