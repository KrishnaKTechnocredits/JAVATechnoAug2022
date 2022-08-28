package pankajBhatt;

//count the numbers divisible by 3 & 7 between 1-100 
class NumbersDivisible{
	void countDivisible(int n, int m){
		int count = 0;
		for(; n<=m; n++){
			if( n % 3 == 0 && n % 7 == 0){
				count++;
			}
		}
		System.out.println("Count of numbers divisible by 3 & 7 betweem "+n+", "+m+" is : "+count);
	}
	
	public static void main(String[] args){
		NumbersDivisible numbersDivisible = new NumbersDivisible();
		numbersDivisible.countDivisible(1,100);
	}
}