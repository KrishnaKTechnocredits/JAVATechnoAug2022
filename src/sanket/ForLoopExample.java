package sanket;

class ForLoopExample{
	
	void evenNumber(int startIndex, int endIndex){
		System.out.println("Even numbers between "+startIndex+" and "+endIndex+" range are :");
		for (; startIndex <= endIndex; startIndex++){
			if (startIndex%2==0){
				System.out.println(startIndex);
			}
		}	
	}
	
	void divisibleBy5(int startIndex, int endIndex){
		System.out.println("\n" + "Numbers between "+startIndex+" and "+endIndex+" range divisible by 5 are : ");
		for (; startIndex <= endIndex; startIndex++){
			if (startIndex%5==0){
				System.out.println(startIndex);
			}
		}
	}
	
	void divisibleBy5And3(int startIndex, int endIndex){
		System.out.println("\n" + "Numbers between "+startIndex+" and "+endIndex+" range divisible by 5 and 3 are : ");
		for (; startIndex <= endIndex; startIndex++){
			if (startIndex%5==0 && startIndex%3==0){
				System.out.println(startIndex);
			}
		}
	}
	
	void divisibleBy7Or13(int startIndex, int endIndex){
		System.out.println("\n" + "Numbers between "+startIndex+" and "+endIndex+" range divisible by 7 or 13 are : ");
		for (; startIndex <= endIndex; startIndex++){
			if (startIndex%7==0 || startIndex%13==0){
				System.out.println(startIndex);
			}
		}
	}
	
	void sumNumber(int startIndex, int endIndex){
		System.out.println("\n" + "Sum of numbers between "+startIndex+" and "+endIndex+" is : ");
		int sum = 0;
		for (; startIndex <= endIndex; startIndex++){
			sum = sum + startIndex;
		}
		System.out.println(sum);
	}
	
	void differnceOddEven(int startIndex, int endIndex){
		System.out.println("\n" + "Difference of odd numbers and even numbers between "+startIndex+" and "+endIndex+" is : ");
		int difference=0, sumEven=0, sumOdd=0;
		for (; startIndex <= endIndex; startIndex++){
			if (startIndex%2==1)
				sumOdd = sumOdd + startIndex;
			else
				sumEven = sumEven + startIndex;
		}
		difference = sumOdd - sumEven;
		System.out.println(difference);
	}
	
	void oddReverseNumber(int startIndex, int endIndex){
		System.out.println("\n" + "Odd numbers between "+startIndex+" and "+endIndex+" in reverse order are : ");
		for (;endIndex>=startIndex; endIndex--){ 
			if (endIndex%2==1)
				System.out.println(endIndex);
		}
	}
		
	public static void main(String[] a){
		ForLoopExample forLoopExample1 = new ForLoopExample();
		forLoopExample1.evenNumber(10,15);
		forLoopExample1.divisibleBy5(10,30);
		forLoopExample1.divisibleBy5And3(5,18);
		forLoopExample1.divisibleBy7Or13(5,40);
		forLoopExample1.sumNumber(1,5);
		forLoopExample1.differnceOddEven(3,9);
		forLoopExample1.oddReverseNumber(10,20);
	}
}