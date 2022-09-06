//1 to 20 : number divisible by 3 : count
package shridharKumbhar;

class DivisibleBy3{
	
	void checkFor_1to20(){
		int count= 0;
		for (int n=1 ; n <= 20 ; n++ ){
			if (n%3==0){
				count++;
			}
		}
		System.out.println( "Total number divisible by 3 bet 1 to 20 are :" + count);
	}
	
	public static void main(String[] arg){
	DivisibleBy3 divisibleby3 = new DivisibleBy3();
	divisibleby3.checkFor_1to20();
	}
}
//user defined range divisible by 3

class AllRangeDivisibleBy3{
	
	void checkForRange(int num1 , int num2 ){
		int count= 0;
		for (int n=num1 ; n <= num2 ; n++ ){
			if (n%3==0){
				count++;
			}
		}
		System.out.println( "Total number divisible by 3 bet " +num1+ " to "+ num2 +" are : " + count);
	}
	
	public static void main(String[] arg){
	AllRangeDivisibleBy3 divisibleby3 = new AllRangeDivisibleBy3();
	divisibleby3.checkForRange(15,43);
	}
}