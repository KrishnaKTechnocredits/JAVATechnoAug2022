package mohiniA.Loop;

public class FindNumber {

	void findRequiredNumbers(int targetNum) {
		int count = 0;
		int sum = 0;
		int index = 1;

		while (sum < targetNum) {

			if (sum > sum + index)
				break;
			count++;
			sum += index;
			index++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		FindNumber num = new FindNumber();
		num.findRequiredNumbers(50);
		num.findRequiredNumbers(17);
	}

}
