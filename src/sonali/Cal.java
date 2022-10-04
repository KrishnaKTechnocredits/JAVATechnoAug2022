package sonali;
class Cal{
 int ans = 0;
 
  void add(int x,int y){
	int ans = x+y;
	System.out.println("Addition is " + ans);
	
  }
  void sub(int x,int y){
	ans = x-y;
	System.out.println("Substraction is " + ans);
 }
  void div(int x,int y){
	ans = x/y;
	System.out.println("Division is " + ans);
 }
  void mul(int x,int y){
	ans = x*y;
	System.out.println("Multiple is " + ans);
 }
  public static void main(String []args){
	Cal cal1 = new Cal();
	cal1.add(10,20);
	cal1.sub(15,25);
	cal1.div(10,25);
	cal1.mul(5,10);
 }
}