//package nikeshM;

 class Bank {
	int totalBalance = 3500;
	int debitCount;
	int creditCount;
	
	void debitAmount( int balance){
		if (balance <= totalBalance){
		totalBalance = totalBalance-balance;
		debitCount ++;
		}
		else {
		System.out.println("InSufficient fund");
		}	
	}
	void creditAmount (int balance){
		totalBalance = totalBalance+balance;
		creditCount++;
	}
	void printInfo(){
		System.out.println("The current balance is " +totalBalance);
		System.out.println("The debit count is " + debitCount);
		System.out.println("The credit count is "+ creditCount);
	}
	public static void main(String [] args){
			Bank bank = new Bank();
			bank.debitAmount(200);
			bank.debitAmount(100);
			bank.debitAmount(4000);
			bank.creditAmount(1000);
			bank.creditAmount(500);
			bank.printInfo();
	}
	}

