package abhijeet;

class Bank{
	int balance=22000;
	int debitCount;
	int creditCount;
	
	void debitAmount(int amount){
		if(amount<=balance){
			balance=balance-amount;
			debitCount++;
		}else{
			System.out.println("InSufficient fund");
		}
	}
	
	void creditAmount(int amount){
		balance=balance+amount;
		creditCount++;
	}
	
	void displayBalance(){
		System.out.println("Current balance = "+balance);
		System.out.println("Total debit count = "+debitCount);
		System.out.println("Total credit count = "+creditCount);
	}
	
	public static void main(String [] args){
		Bank bank = new Bank();
		bank.debitAmount(6000);
		bank.debitAmount(16000);
		bank.creditAmount(4000);
		bank.displayBalance();
		//A big shoutout too Technocredits team for providing manual testing and automation testing in such minimal fees.
	}
	
}	