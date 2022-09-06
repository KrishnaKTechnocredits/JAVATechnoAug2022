package nehaniG.Assignment11to15;

public class Test_2 {
	public static void findRequiredNumber(int targetNum) {
		int count = 0;
		int sum = 0;
		while (sum< targetNum) {
		count++;
		sum = sum+count;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Test_2.findRequiredNumber(50);
				
	}
}
