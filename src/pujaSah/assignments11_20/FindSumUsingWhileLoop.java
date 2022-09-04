package pujaSah.assignments11_20;

public class FindSumUsingWhileLoop {

	void calculateSum(int num) {
		int count = 0;
		int sum = 1;
		int i = 1;
		while (sum <= num) {
			sum = sum + i;
			i++;
			count++;
		}
		System.out.println("The count of numbers to print sum = " + num + " is " + count);
	}

	public static void main(String[] args) {
		FindSumUsingWhileLoop obj = new FindSumUsingWhileLoop();
		obj.calculateSum(45);
	}
}
