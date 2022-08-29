//sum of numbers from given range
package harshadaJagtap;
class Loop1{
	void m1(int startIndex, int endIndex){
		int sum=0;
		for (int index=startIndex;index<=endIndex;index++){
			sum=sum+index;
		}
		System.out.println("sum from " + startIndex + " to " + endIndex+" is "+sum);
	}
	
	public static void main(String[]args){
		Loop1 loop1=new Loop1();
		loop1.m1(10,20);
	}
}