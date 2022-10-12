package vibhaS.Assignment;

public class Assignment35 {

	// return sum of all the number from given String
	int getsumOfDigit(String[] str) {
		int sum = 0;
		for (int index = 0; index < str.length; index++) {
			try {
				int num = Integer.parseInt(str[index]);
				sum = sum + num;
			} catch (NumberFormatException ne) {

			}
		}
		return sum;
	}

	// return sum of all the digit from given String
	int getSumOfAllDigit(String arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				try {
					int num = Integer.parseInt(String.valueOf(ch));
					sum = sum + num;
				} catch (NumberFormatException ne) {

				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		String str = "I have 15 years and 3 months of experiance";
		String[] arr = str.split(" ");
		int ans = assignment35.getsumOfDigit(arr);
		System.out.println("sum is =>" + ans);
		System.out.println("");
		int ans1 = assignment35.getSumOfAllDigit(arr);
		System.out.println("sum of all digit is =>" + ans1);
	}
}
