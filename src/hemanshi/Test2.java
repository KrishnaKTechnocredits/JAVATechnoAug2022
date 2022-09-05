package hemanshi;


public class Test2 {
	void findRequiredNumber(int targetNum) {
		int sum = 0;
		int index = 0;
		while (sum <= targetNum) {
			index++;
			sum = sum + index;
		}
		System.out.println(+index);
	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.findRequiredNumber(50);
		test2.findRequiredNumber(17);
	}

}
