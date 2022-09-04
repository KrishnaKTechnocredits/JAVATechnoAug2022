package komalShrivastava;

public class Test2 {

	static void numbersRequiredForSum(int targetSum) {
		int count = 0;
		int sum = 0;
		int num = 1;
		while(sum<targetSum) {
			sum = sum+num;
			count++;
			num++;
		}
		System.out.println("Count of numbers required to get sum of " + targetSum + " is : " + count);
	}
	
	public static void main(String[] args) {
		numbersRequiredForSum(10);
	}
}