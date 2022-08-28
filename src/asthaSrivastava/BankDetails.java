package asthaSrivastava;

public class BankDetails {
	int balance =1500;
	int debitCount = 0;
	int creditCount = 0;
	
	void debitAmt(int amt){
		if (amt<=balance){
		balance = balance - amt;
		debitCount++;
	} else{
		System.out.println(" Debit operation cannot be performed. Insufficient balance");
		}
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
		creditCount++;
	}
	
	void printInfo(){
		System.out.println(" Current Balance is : "+ balance);
		System.out.println(" Debit Count is : "+ debitCount);
		System.out.println(" Credit Count is : "+ creditCount);
	}
	
	public static void main(String[] args){
		BankDetails bankdetails = new BankDetails();
		
		bankdetails.debitAmt(200);
		bankdetails.creditAmt(150);
		bankdetails.debitAmt(309);
		bankdetails.debitAmt(250);
		bankdetails.creditAmt(150);
		bankdetails.printInfo();
		}
	}	
		