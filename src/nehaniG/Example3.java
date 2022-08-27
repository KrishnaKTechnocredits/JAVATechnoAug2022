class Example3{

     int bal = 10000;
	 
	 void debitAmt() {
	  bal = bal-2000;
	 }
	 
	 void creditAmt() {
	 bal = bal + 3000;
	 }
	 
	 void display() {
	 System.out.println("Now balance is " + bal);
	 }
	 
	 public static void main(String[] a){
	     Example3 example3 = new Example3();
		 example3.creditAmt();
		 example3.debitAmt();
		 example3.display();
	 }
}		 