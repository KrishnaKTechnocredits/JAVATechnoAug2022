/*Create a class called Bank having 3 methods and 3 instance variables.
- expected operations - debitAmount, creditAmount, printInfo.
- print info should print total debit operation, total credits operations and current balance.
- variable balance to hold current balance, creditCount, debitCount.
- create only one object and call methods multiple times, at the end call printInfo method.
- I suggest using the If condition to make sure the asked amount <= balance, if not please print InSufficient fund message in debit method.
*/

package asthaSrivastava.assignments;

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
		