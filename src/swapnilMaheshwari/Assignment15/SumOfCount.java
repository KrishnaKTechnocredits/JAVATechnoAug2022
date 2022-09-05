package swapnilMaheshwari.Assignment15;

public class SumOfCount {
	int sum = 0;

	int count = 0;

	void requiredNumber(int targetnumber) {
		int i = 1;
		while (sum < targetnumber) {
			sum = sum + i;
			count++;
			i++;
		}
		System.out.println("first " +count+ " Number is used to reach the sum of " +targetnumber);
	}

	public static void main(String[] args) {
		SumOfCount sumOfCount = new SumOfCount();
		sumOfCount.requiredNumber(30);
	}

}
