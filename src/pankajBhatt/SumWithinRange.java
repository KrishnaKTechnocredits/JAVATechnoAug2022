package pankajBhatt;

//Sum of numbers between the given range
class SumWithinRange{
	void calculateSum(int n, int m){
		int sum=0;
		for(; n<=m; n++){
			sum+=n;
		}
		System.out.println("Sum of Numbers between "+n+", "+m+" is : "+sum);
	}
	
	public static void main(String[] args){
		SumWithinRange sumWithinRange = new SumWithinRange();
		sumWithinRange.calculateSum(10,20);
	}
}