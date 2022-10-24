package rohanNaik.Assignments;

public class Assignment35b {

	int getSum(String input) {
		int sum = 0;

		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {

			try {// 15
				int orignalNum = Integer.parseInt(arr[index]);
				int processNum = orignalNum;
				while (processNum > 0) {
					int num = processNum % 10;
					sum = sum + num;
					processNum = processNum / 10;
				}
			} catch (NumberFormatException nfe) {

			}
		}

		return sum;
	}

	public static void main(String[] args) {
		String input = "i have 15 years and 3 months of experience";
		Assignment35b obj = new Assignment35b();
		int sum = obj.getSum(input);
		System.out.println(sum);
	}

}
