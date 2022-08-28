package shraddhaRekhate;

class Calculator{

    int a=5;//instance variable
    int b=10;//instance variable
    int ans=0;//instance variable
	
    void add(int a, int b){
	   ans=a+b;
	   System.out.println("Addition is:"+ans);
    }
	
    void sub(int a, int b){
	   ans=a-b;
	   System.out.println("Subtractions is:"+ans);
    }
	
    void mul(int a, int b){
	   ans=a*b;
	   System.out.println("multiplications is:"+ans);
    }
    void div(int a,int b){
	   ans=a/b;
       System.out.println("Division is:"+ans);
    }
 
    public static void main(String[] args){
	   Calculator calculator=new Calculator();
	   calculator.add(100,100);
	   calculator.sub(20,10);
	   calculator.mul(5,8);
	   calculator.div(100,10);
	  
  }

}