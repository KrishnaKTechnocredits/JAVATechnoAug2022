package nikeshM.ArrayProgram;

public class PrintSecondHighestNo {
	int getSecondHighNo(int[] num) {
		int maxNo = num[0];
		int sMaxNo = num[0];
		for (int index = 0; index < num.length; index++) {

			if (maxNo <= num[index]) {
				maxNo = num[index];
			} else if (sMaxNo <= num[index]) {
				sMaxNo = num[index];
			}
		}
		System.out.print("Print Second Max No " + sMaxNo);
		return sMaxNo;
	}

	public static void main(String[] args) {
		int [] num = {10,99,33,44,89,76};
		new PrintSecondHighestNo().getSecondHighNo(num);

	}
}
