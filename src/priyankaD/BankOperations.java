package priyankaD;

public class BankOperations {
	int amount=10000;
	int debitCount=0;
	int creditCount=0;
	void debitAmt(int bal){
		amount=amount-bal;
		debitCount++;
		}
	void creditAmt(int bal){
		amount=amount+bal;
		creditCount++;
	}
    void display() {
    	System.out.println("#Client 1-");
    	System.out.println("Total debit count is: "+ debitCount);
    	System.out.println("Total credit count is: "+ creditCount);
    	System.out.println("Your Current balance is: "+amount);
    }
    
    int amount2=20000;
    int debitCount2=0;
    int creditCount2=0;
    void debitAmt2(int bal2){
    	amount2=amount2-bal2;
    	debitCount2++;
    }
    void creditAmt2(int bal2) {
    	amount2=amount2+bal2;
    	creditCount2++;
    }
    void display2() {
    	System.out.println("#Client 2-");
    	System.out.println("Total debit count is: "+debitCount2);
    	System.out.println("Total credit count it: "+creditCount2);
    }
    void display3() {
    	System.out.println("##Total Operations conducted and amount in bank- ");
    	System.out.println("Total debit operations are: "+(debitCount+debitCount2));
    	System.out.println("Total credit operations are: "+(creditCount+creditCount2));
    	System.out.println("Balance: "+(amount+amount2));
    }
    public static void main(String[]args) {
    BankOperations bo=new BankOperations();
    bo.creditAmt(5000);
    bo.creditAmt(5000);
    bo.debitAmt(5000);
    bo.display();
    bo.debitAmt2(5000);
    bo.creditAmt2(10000);
    bo.debitAmt2(5000);
    bo.creditAmt2(5000);
    bo.creditAmt2(5000);
    bo.creditAmt2(3000);
    bo.creditAmt2(2000);
    bo.display2();
    bo.display3();
    }
}
