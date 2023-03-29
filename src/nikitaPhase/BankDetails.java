package nikitaPhase;
class BankDetails{
	//Define Instance variables:
	int bal = 10000;
	int creditCount = 0;
	int debitCount = 0;
	
	//Define a method to subtract amount from the balance:
	void debitAmt(int amount){
		System.out.println("Rs." + amount + "/- has been entered for withdrawn.");
		debitCount += 1;
		
		if (amount > bal){
			System.out.println("Insufficient Balance.");
		}
		else{
			bal = bal - amount;
		}
		System.out.println("Updated Balance is: " + bal);
		System.out.println();
	}
		
	//Define a method add amount into balance:
	void creditAmt(int amount){
		System.out.println("Rs." + amount + "/- has been entered for deposit.");
		creditCount += 1;
		bal = bal + amount;
		System.out.println("Updated Balance is: " + bal);
		System.out.println();
	}
	
	//Print debit & credit counts:
	void printCounts(){
		//Print debit count:
		System.out.println("Your debit count: " + debitCount);
		
		//Print credit count:
		System.out.println("Your credit count: " + creditCount);
		System.out.println();
	}

	//Define main method:
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		
		//Print current balance:
		System.out.println("Current balance is: " + bankDetails.bal);
		System.out.println();
		
		//Debit Rs.1000/- from balance:
		bankDetails.debitAmt(1000);
		
		//Credit Rs.5000/- to the balance:
		bankDetails.creditAmt(5000);
		
		//Print Debit & Credit counts:
		bankDetails.printCounts();
		
		//Debit Rs.2000/- from balance:
		bankDetails.debitAmt(1000);
		
		//Credit Rs.3000/- to the balance:
		bankDetails.creditAmt(5000);
		
		//Print Debit & Credit counts:
		bankDetails.printCounts();
		
		//Debit Rs.2000/- from balance:
		bankDetails.debitAmt(100000);
	}
}