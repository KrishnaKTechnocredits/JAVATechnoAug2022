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
		System.out.println("Sum of numbers required to get " + targetSum + " is : " + count);
	}
	
	
	public static void main(String[] args) {
		numbersRequiredForSum(10);
	}
}
