// find second largest number form given arrays
package avni.returnTypeExample;

public class SecondLargestNumber {

	int largestNumber(int[] num) {
		int temp = 0;
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				temp = max;
				max = num[i];
			} 
			else if (num[i] > temp)
				temp = num[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		SecondLargestNumber n = new SecondLargestNumber();
		int[] number = { 10, 12, 14, 15, 16 };
		int op = n.largestNumber(number);
		System.out.println(op);
	}

}
