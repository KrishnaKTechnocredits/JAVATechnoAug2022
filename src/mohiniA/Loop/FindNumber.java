package mohiniA.Loop;

public class FindNumber {

	void findRequiredNumbers(int targetNum) {
		int count = 0;
		int sum = 0;
		

		while (sum < targetNum) {

			if (sum > sum + count)
				break;
			count++;
			sum += count;
			
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		FindNumber num = new FindNumber();
		num.findRequiredNumbers(50);
		num.findRequiredNumbers(17);
	}

}
