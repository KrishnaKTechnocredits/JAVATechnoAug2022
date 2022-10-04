/*findRequiredNumbers(50);

input : 50
output : 10

input : 17
output : 6

1+2+3+4+5+6+7+8+9+10 = 55*/

package smitaVetal;

public class SumOfNumbers {

	void sumOfReqNo(int targetno) {

		int count = 0;
		int sum = 0;
		int num1 = 1;
		while (sum <= targetno) {
			sum = sum + num1;
			num1++;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		SumOfNumbers S1 = new SumOfNumbers();
		S1.sumOfReqNo(50);
		S1.sumOfReqNo(17);
	}
}
