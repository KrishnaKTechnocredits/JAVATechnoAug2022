/*Write only one program having the following methods. [7 methods in same program] 

1. On user defined range (parameterized method) print all even numbers. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

2. On user defined range print all numbers which are divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user defined range print all numbers which are divisible by 5 and divisible by 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user defined range print all numbers which are divisible by 7 or 13. 
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
		 
5. Find sum of all the numbers in user defined range.
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
package asthaSrivastava.assignments;

public class ForAssignments {                       //25 Aug 22
	void m1(int startIndex, int endIndex){ // Method 1 Print all even numbers.
		System.out.println("Print even number between "+startIndex+" and "+endIndex+" are:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2==0){
			System.out.println(index);
			}
		}	
	}
	
	void m2(int startIndex, int endIndex){ //Method 2 Print all numbers which is divisible by 5. 
		System.out.println("Numbers divisible by 5 are:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%5==0){
			System.out.println(index);
			}
		}	
	}
	
	void m3(int startIndex, int endIndex){ //Method 3 Print all numbers which is divisible by 5 and divisible by 3. 
		System.out.println("Divisible by 5 and 3 are:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%5==0 && index%3==0){
			System.out.println(index);
			}
		}	
	}
	
	void m4(int startIndex, int endIndex){ // Method 4 Print all numbers which is divisible by 7 or 13.
		System.out.println("Divisible by 7 or 13 are:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%7==0 || index%13==0){
			System.out.println(index);
			}
		}	
	}
	
	void m5(int num){		// Method 5 Sum of all the numbers in user define range.
		int sum =0;
		for(int index=1;index<=num;index++){
			sum = sum + index;
		}
		System.out.println("Sum of all the numbers is : "+sum+"");
	}
	
	void m6(int startIndex, int endIndex){  // Method 6 Difference between sum of odd numbers and even numbers in a given range.
		int sumEven =0;
		int sumOdd =0;
		int diff =0;
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2==0)
			sumEven = sumEven + index;
			else 
			sumOdd = sumOdd + index;
		}
			
		diff = sumOdd -sumEven;
		System.out.println("Difference between sum of Odd numbers and Even numbers is : "+diff);
	}
	
	void m7(int startIndex, int endIndex){  //Method 7 Print only odd numbers in reverse order.
		for(int index=endIndex;index>=startIndex;index--){
			if(index%2!=0){
			System.out.println("Print odd numbers in reverse order as: "+index);
			}
		}
	}
	
	public static void main(String[] args){
		ForAssignments forassignment = new ForAssignments();
		forassignment.m1(10,15);
		forassignment.m2(10,30);
		forassignment.m3(5,18);
		forassignment.m4(5,40);
		forassignment.m5(5);
		forassignment.m6(3,9);
		forassignment.m7(10,20);
	}
}