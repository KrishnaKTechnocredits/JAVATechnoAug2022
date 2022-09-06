package shrutiArora;
public class ProgrammingTest2 {
void findRequiredNumbers(int targetNum) {
		int count = 0;
		int sum = 0;
		int num = 1 ;
		while(sum<targetNum) {
			sum = sum + num ;
			num++;
			count++;
		}
		System.out.println("Required Minimum numbers whose sum is nearby: " + targetNum + " : " + count);
	}
	public static void main(String[] args) {
		ProgrammingTest2 programmingTest2 = new ProgrammingTest2();
		System.out.println("*****************************************************Programming Test2******************************");
		programmingTest2.findRequiredNumbers(55);
		programmingTest2.findRequiredNumbers(17);
	}
}