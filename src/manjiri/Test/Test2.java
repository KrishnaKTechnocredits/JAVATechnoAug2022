package manjiri.Test;

public class Test2 {
	void findRequiredNumbers(int targetNum) {
		int count = 0;
		int sum = 0;
		int num = 1;
			
		while(sum<targetNum) {
			sum = sum + num;
			num++;
			count++;
		}
		System.out.println(count);
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new Test2().findRequiredNumbers(50);
	}	
}
