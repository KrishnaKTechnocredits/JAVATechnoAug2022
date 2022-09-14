package shraddhaRekhate;

class Calc{

 int a=5;//instance variable
 int b=10;//instance variable
 int ans=0;
 void add(){
	 ans=a+b;// local variable
	 System.out.println("Addition is:"+ans);
 }
 void sub(){
	 ans=a-b;// local variable
	 System.out.println("Subtractions is:"+ans);
 }
 void mul(){
	 ans=a*b;// local variable
	 System.out.println("multiplications is:"+ans);
 }
 void div(){
	 ans=a/b;// local variable
     System.out.println("Division is:"+ans);
 }
 
  public static void main(String[] args){
	  Calc c1=new Calc();
	  c1.add();
	  c1.sub();
	  c1.mul();
	  c1.div();
	  
  }

}