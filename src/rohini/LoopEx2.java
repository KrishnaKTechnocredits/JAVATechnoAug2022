package rohini;
class LoopEx2{
	//1.Print even numbers
	void evenNumbers(int firstNum, int lastNum){ 
		System.out.println("Even numbers between "+firstNum+" and "+lastNum+" are :");
		for(int i=firstNum;i<=lastNum;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	//2.Print all numbers divisible by 5
	void divisibleByFive(int firstNum, int lastNum){
		System.out.println("Divisible by 5, numbers are :");
		for(int i=firstNum;i<=lastNum;i++){
			if(i%5==0){
				System.out.println(i);
			}
		}
	}
	//3.Print all numbers divsible by 3 and 5
	void divisible(int firstNum, int lastNum)	{
		System.out.println("Numbers divisible by 3 and 5 from range "+firstNum+" and "+lastNum+"are :");
		for(int i=firstNum;i<=lastNum;i++){
			if(i%3==0 && i%5==0){
				System.out.println(i);
			}
		}
	}
	//4.Print all numbers which is divisible by 7 or 13
	void divisibleBy73(int firstNum, int lastNum){
		System.out.println("Numbers divisible by 7 or 13 from range "+firstNum+" and "+lastNum+"are :");
		for(int i=firstNum; i<=lastNum; i++){
			if(i%7==0 && i%13==0){
				System.out.println(i+" is divisible by 7 and 13");
			}
			else if(i%7==0) {
				System.out.println(i+" is divisible by 7");
			}
			else if(i%13==0){
				System.out.println(i+" is divisible by 13");
			}			
		}
	}
	//5.Sum of all numbers in user defined range
	void displaySum(int startNum,int endNum){
		int sum=0;
	    for(int i=startNum; i<=endNum; i++){ 
			sum=sum+i;
		}
		System.out.println("sum of number from "+startNum+" to "+endNum+" is: "+sum);
	}
	//6.Find difference between sum of odd numbers and even numbers in a given range
	void sumAll(int firstNum, int lastNum){
		int oddSum=0;
		int evenSum=0;
		int total;
	    for(int i=firstNum; i<=lastNum; i++){
			if(i%2==1){
				oddSum=oddSum+i;
			}
			else {
				evenSum=evenSum+i;
			}
		}
		total=oddSum-evenSum;
		System.out.println("Difference between sum of odd numbers and even numbers is "+total);
	}
	//7. Print only odd numbers in reverse order.
	void printOddnumbers(int startNum, int lastNum){
		System.out.println("Reverse order of odd numbers :");
		for(int i=lastNum; i>=startNum; i--){
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args){
		LoopEx2 loopEx2=new LoopEx2();
		loopEx2.evenNumbers(10,15);
		loopEx2.divisibleByFive(10,30);
		loopEx2.divisible(10,18);
		loopEx2.divisibleBy73(5,100);
		loopEx2.displaySum(1,5);
		loopEx2.sumAll(3,9);
		loopEx2.printOddnumbers(10,20);
	   
	}
}