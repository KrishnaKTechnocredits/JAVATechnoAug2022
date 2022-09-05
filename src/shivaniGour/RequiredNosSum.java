package shivaniGour;

public class RequiredNosSum {

	void findRequiredNumbers(int targetNum) {
		int count = 0;
		int sum = 0;
		int index = 1;
		System.out.println("Count of numbers required to get sum as " + targetNum + " is: ");
		while (sum < targetNum) {
			sum = sum + index;
			count++;
			index++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new RequiredNosSum().findRequiredNumbers(50);
		new RequiredNosSum().findRequiredNumbers(17);
	}

}
