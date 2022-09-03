//Assignment:3
//Mahesh Santoki
package maheshSantoki.startingExamples;
class BankDetail{
	int balance = 10000;
	int creditCount=0;
	int debitCount = 0;
	
	void debitAmt(int amt){
		if(amt<=balance){
			balance = balance - amt;
			debitCount++;
		}
		else{
		System.out.println("Insufficent fund");
		}
	}
	
	void creditAmt(int amt){
			balance = balance + amt;
			creditCount++;
	}
	void printInfo(){
				System.out.println("Now your current balance is " + balance);
				System.out.println("Total credit transcation is " + creditCount);
				System.out.println("total debit transcation is " + debitCount);
	}
	
	public static void main(String[] args){
		BankDetail bank1 = new BankDetail();
		bank1.creditAmt(500);
		bank1.debitAmt(1500);
		bank1.debitAmt(1300);
		bank1.creditAmt(700);
		bank1.debitAmt(1900);
		bank1.printInfo();
	}
}