package sagarY.whileLoop;

class WhileEx2 {
	int count = 0;
	int sum = 1;
	int targetNum;

	void findRequiredNumbers(int targetNum) {
		while (sum < targetNum) {
			for (int index = 1; index < targetNum; index++) {
				if (sum < targetNum) {
					sum = sum + index;
					count++;
				}
			}
			System.out.print("Count of sum values is: "+count);
		}

	}

	public static void main(String[] args) {
		new WhileEx2().findRequiredNumbers(50);
	}
}