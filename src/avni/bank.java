// avni Dalsaniya 
package avni;
class Bank{
	int debitcount ;
	int creditcount ;
	int balance = 1000 ;
	
	void debit(int askamount){
		if (askamount<=balance){
			balance = balance -askamount ;
			debitcount++ ;
			}
		else{
			System.out.print("insufficient fund");
		}
	}
	
	void credit(int amt){
		balance= amt+balance;
		creditcount++ ;
	}
	
	void printinfo(){
		System.out.println("total balance is "+balance);
		System.out.println("total debit operation "+ debitcount);
		System.out.println("total credit operation"+ creditcount);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.credit(1000);
		bank.debit(400);
		bank.credit(500);
		bank.credit(600);
		bank.printinfo();
	}
}
		
		
		
