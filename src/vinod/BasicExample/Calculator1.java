package vinod;
class Calculator1{
 
 void add (int x, int y){
	 int ans = x+y;
	 System.out.println("Addition is "+ans);
 }
 void sub (int x, int y){
	 int ans = x-y;
	 System.out.println("Substraction is "+ans);
 }
 void mul (int x, int y){
	 int ans = x*y;
	 System.out.println("Multiplication is "+ans);
 }
 void div (int x, int y){
	 int ans = x/y;
	 System.out.println("Division is "+ans);
 }
 public static void main (String[] args){
	 Calculator1 cal = new Calculator1();
	 cal.add(20,40);
	 cal.sub(20,40);
	 cal.mul(20,40);
	 cal.div(20,40);
 }
}