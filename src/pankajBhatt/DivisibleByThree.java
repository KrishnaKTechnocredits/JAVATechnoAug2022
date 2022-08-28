package pankajBhatt;

//count the numbers divisible by 3 between 1-20
class DivisibleByThree{
	void countDivisible(int n, int m){
		int count = 0;
		for(; n <= m; n++){
			if( n % 3 == 0 ){
				count++;
			}
		}
		System.out.println("Count of numbers divisible by 3 betweem "+n+", "+m+" is : "+count);
	}
	
	public static void main(String[] args){
		DivisibleByThree divisibleByThree = new DivisibleByThree();
		divisibleByThree.countDivisible(1,20);
	}
}