package nehaniG.Assignment11to15;

public class Test_2 {
	
  void findRequiredNumber(int targetNum) {
		int count = 0;
		int sum = 0;
		while (sum< targetNum) {
		count++;
		sum = sum+count;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Test_2 test_2 = new Test_2();
		test_2.findRequiredNumber(50);
		test_2.findRequiredNumber(17);
	}
}
