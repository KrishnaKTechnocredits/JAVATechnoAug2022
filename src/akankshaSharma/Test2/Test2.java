package akankshaSharma.Test2;

class Test2 {
	void findRequiredNumber(int targetNum) {
		int count = 0;
		int i = 1;
		int sum = 0;

		while (sum < targetNum) {
			sum += i;
			count++;
			i++;
		}
		System.out.println("count of numbers:" + count);
	}

	public static void main(String[] args) {
		Test2 test = new Test2();
		test.findRequiredNumber(50);
	}
}
