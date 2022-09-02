/*Write only one program having the following methods. [7 methods in same program] 

1. On user define range (parameterized method) print all even numbers. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

2. On user define range print all numbers which is divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user define range print all numbers which is divisible by 5 and divisible by 3. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user define range print all numbers which is divisible by 7 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13
		 
5. Find sum of all the numbers in user define range.
Input : Range -> 1 to 5
output : sum is 15

6. Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6
       
7. Print only odd numbers in reverse order.
Input : Range -> 10 to 20
output : 19
         17
         15
         13
         11
		 
*/
package deepakBorse.Assignments;

class loopAssignment{
	
	void evenMethod(int startindex,int endindex){
		int index;
		if(startindex>endindex){
			System.out.println("Invalid range provided: "+startindex+"-"+endindex);
		}
		else{
			System.out.println("Even numbers from range "+startindex+" to "+endindex+":");
			for(index=startindex;index<=endindex;index++){
				if(index%2==0){
					System.out.println(+index);
				}
			}			
		}
		System.out.println("-----------------------------------------------------");
	}
	
	void divFiveMethod(int startindex,int endindex){
		int index;
		if(startindex>endindex){
			System.out.println("Invalid range provided: "+startindex+"-"+endindex);
		}
		else{
			System.out.println("Numbers divisible by 5 from range "+startindex+" to "+endindex+":");
			for(index=startindex;index<=endindex;index++){
				if(index%5==0){
					System.out.println(+index);
				}
			}			
		}
		System.out.println("-----------------------------------------------------");
	}
	
	void divFiveThreeMethod(int startindex,int endindex){
		int index;
		if(startindex>endindex){
			System.out.println("Invalid range provided: "+startindex+" to "+endindex);
		}
		else{
			System.out.println("Numbers divisible by 3 & 5 from range "+startindex+" to "+endindex+":");
			for(index=startindex;index<=endindex;index++){
				if(index%3==0 && index%5==0){
					System.out.println(+index);
				}
			}			
		}
		System.out.println("-----------------------------------------------------");
	}
	
	void divSevenThriteenMethod(int startindex,int endindex){
		int index;
		if(startindex>endindex){
			System.out.println("Invalid range provided: "+startindex+" to "+endindex);
		}
		else{
			System.out.println("Numbers divisible by 7 or 13 from range "+startindex+" to "+endindex+":");
			for(index=startindex;index<=endindex;index++){
				if(index%7==0 || index%13==0){
					if(index%7==0){
						System.out.println(+index+" number divisible by 7");
					}
					if(index%13==0){
						System.out.println(+index+" number divisible by 13");
					}
				}
			}			
		}
		System.out.println("-----------------------------------------------------");
	}	
	
	void sumNumber(int startindex,int endindex){
		int index;
		int sum=0;
		
		if(startindex>endindex){
			System.out.println("Invalid range provided: "+startindex+" to "+endindex);
		}
		else{
			for(index=startindex;index<=endindex;index++){
				sum=sum+index;
			}
			System.out.println("Sum of all numbers from "+startindex+" to "+endindex+" :"+sum);
		}
		System.out.println("-----------------------------------------------------");
	}
	
	void diffOddEven(int startindex,int endindex){
		int index, oddsum=0, evensum=0;
		
		for(index=startindex;index<=endindex;index++){
			if(index%2==0){
				evensum=evensum+index;
			}
			else{
				oddsum=oddsum+index;
			}	
		}
		if(evensum>oddsum)
			System.out.println("Diff of even and odd number from "+startindex+" to "+endindex+" : "+(evensum-oddsum));
		else
			System.out.println("Diff of even and odd number from "+startindex+" to "+endindex+" : "+(oddsum-evensum));
		System.out.println("-----------------------------------------------------");
	}
	
	void printOddReverse(int startindex,int endindex){
		int index;
		
		System.out.println("Odd numbers from range "+endindex+" to "+startindex+":");
		for(index=endindex;index>=startindex;index--){
			if(index%2!=0){
				System.out.println(" "+index);
			}
		}
		System.out.println("-----------------------------------------------------");
	}	
	
	public static void main(String[] args){
		loopAssignment loopAssignment=new loopAssignment();
		loopAssignment.evenMethod(10,15);
		loopAssignment.evenMethod(45,25);
		loopAssignment.divFiveMethod(10,30);
		loopAssignment.divFiveMethod(80,45);
		loopAssignment.divFiveThreeMethod(05,18);
		loopAssignment.divSevenThriteenMethod(5,40);
		loopAssignment.sumNumber(1,5);
		loopAssignment.diffOddEven(3,9);
		loopAssignment.printOddReverse(10,20);
	}
}