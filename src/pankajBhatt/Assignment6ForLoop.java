package pankajBhatt;

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
		 
class Assignment6ForLoop{
	
	void evenNumbers(int n, int m){
		for( ; n<=m; n++){
			if(n % 2 == 0 ){
				System.out.println("Prime Numbers between "+n+", "+m+" : "+ n);
			}
		}
	}
	
	void countDivisibleByFive(int n, int m){
		for( ; n <= m; n++ ){
			if( n % 5 == 0 ){
				System.out.println("Numbers divisible by 5 betweem "+n+", "+m+" is : "+ n);
			}
		}
	}
	
	void countDivisibleByThreeAndFive(int n, int m){
		for( ; n<=m; n++ ){
			if( n % 3 == 0 && n % 5 == 0){
				System.out.println("Numbers divisible by 3 and 5 betweem "+n+", "+m+" is : "+ n);
			}
		}
	}
	
	void countDivisibleBySevenOrThirteen(int n, int m){
		for( ; n<=m; n++ ){
			if( n % 7 == 0) {
				System.out.println("Numbers "+n+" is divisible by : 7");
			}if(n % 13 == 0){
				System.out.println("Numbers "+n+" is divisible by : 13");
			}
		}
	}
	
	void calculateSumWithinRange(int n, int m){
		int sum=0;
		for( int i = n; i<=m; i++ ){
			sum+=i;
		}
		System.out.println("Sum of Numbers between "+n+", "+m+" is : "+sum);
	}
	
	void differenceOfOddEvenWithinRange(int n, int m){
		int difference=0;
		for(  int i = n; i<=m; i++){
			if( i % 2 != 0 ){
				difference += i;
			}else if( i % 2 == 0 ){
				difference -= i;
			}
		}
		System.out.println("Difference Of Odd and Even numbers between "+n+", "+m+" is : "+difference);
	}
	
	void OddNumbersInreverseWithinrange(int n, int m){
		for( ; m>=n; m--){
			if( m % 2 != 0 ){
				System.out.println(m+", is Odd Number");
			}
		}
	}

	public static void main(String[] args){
		Assignment6ForLoop Assignment6ForLoop = new Assignment6ForLoop();
		Assignment6ForLoop.evenNumbers( 10, 15);
		System.out.println(" ");
		Assignment6ForLoop.countDivisibleByFive( 10, 30);
		System.out.println(" ");
		Assignment6ForLoop.countDivisibleByThreeAndFive( 5, 18 );
		System.out.println(" ");
		Assignment6ForLoop.countDivisibleBySevenOrThirteen( 5, 400 );
		System.out.println(" ");
		Assignment6ForLoop.calculateSumWithinRange( 1, 5 );
		System.out.println(" ");
		Assignment6ForLoop.differenceOfOddEvenWithinRange( 3, 9 );
		System.out.println(" ");
		Assignment6ForLoop.OddNumbersInreverseWithinrange( 10, 20 );
	}

}		 