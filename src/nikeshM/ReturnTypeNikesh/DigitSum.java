package nikeshM.ReturnTypeNikesh;

public class DigitSum {
	
	int getDigitSum(String name) {
		int length = name.length();
		int ans = 0;
		for (int index = 0; index <length; index++) {
				char ch = name.charAt(index);
				if (Character.isDigit(ch)) {
					ans = ans + Character.getNumericValue(ch);
					System.out.println("No Of Sum Are" + ans);
				}
				
		}
		return ans;
	}

	public static void main(String[] args) {
		DigitSum sum1 = new DigitSum();
		sum1.getDigitSum("ni1k3e4shr6");
	}
}
