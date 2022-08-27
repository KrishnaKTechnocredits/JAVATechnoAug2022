package nehaniG;

class Example2{

     int bal = 1000;
	 
	 void debitAmt() {
	  int bal = 3000;
	  bal = bal-2400;
	 }
	 
	 void creditAmt() {
	 bal = bal + 1000;
	 }
	 
	 void display() {
	 System.out.println("Now balance is " + bal);
	 }
	 
	 public static void main(String[] a){
	     Example2 example2 = new Example2();
		 example2.creditAmt();
		 example2.debitAmt();
		 example2.display();
	 }
}		 