package manjiri.arrayEx;

public class ArrayEx1_Client {
	public static void main(String[] args) {
		ArrayEx1 arrayEx1 = new ArrayEx1();
		int[] input = {11,13,17,22,44};
		System.out.println("Sum of Non Prime numbers in an array is: " + arrayEx1.getSumOfNonPrimeNumbersInArray(input));
		
		int[] input2 = {11,35,17,105,44};
		System.out.println("Sum of Non Prime numbers and number divisible by 5 and 7 in an array is: " + arrayEx1.getSumOfNonPrimeAndDivisible5And7NumbersInArray(input2));
		
		int[] input3 = {10,11,15,6};
		System.out.println("Sum of Even numbers in an array is: " + arrayEx1.getSumOfEvenNumbersInArray(input3));
		System.out.println("Difference of sum of Even numbers and sum of odd numbers in an array is: " + arrayEx1.getDifferneceOfEvenAndOddNumbers(input3));
	}
}
