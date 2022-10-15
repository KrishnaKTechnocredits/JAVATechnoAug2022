package shraddhaRekhate.Assignment34;

public class Fibonacci {
  void printFibonacciSeries(int num) {
	  //num=8- 0 1 1 2 3 5 8 13 
	  //num1 and num2 hard coded 0 and 1 //loop will iterate till num-1 times 8-2=6 times
	  int num1=0;
	  int num2=1;
	  System.out.println(num1);
	  System.out.println(num2);
	  for(int index=0;index<num-2;index++) {
		  int temp=num2;//1
		   num2=num1+num2;//0+1//num2=1
		   num1=temp;//1
		   System.out.println(num2);
	  }
  }
  
  public static void main(String[] args) {
	  Fibonacci obj1=new Fibonacci();
	  obj1.printFibonacciSeries(8);
}
}
