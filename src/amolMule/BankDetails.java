package amolMule;
class BankDetails{
	int debitCount=0;
	int creditCount=0;
	int balance= 10000;
	
	void credit(int amt){
		balance=balance+amt;
		creditCount++;
	}
	
	void debit(int amt){
		if(balance>amt){
			balance=balance-amt;
			debitCount++;
			}
		else{
			System.out.println("Insufficient balance");
			}
	}
	void displayBalance(){
		System.out.println("Balance is "+ balance);
		System.out.println("Debit count is "+ debitCount);;
		System.out.println("Credit count is "+ creditCount);
	}
	
	public static void main(String args[]){
		BankDetails bankdetails= new BankDetails();
		bankdetails.credit(2000);
		bankdetails.debit(1000);
		bankdetails.debit(1000);
		bankdetails.debit(1000);
		bankdetails.debit(1000);
		bankdetails.credit(5000);
		bankdetails.debit(1000);
		bankdetails.credit(2000);
		bankdetails.displayBalance();
		}
}
