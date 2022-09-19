package vibhaS.Assignment;

public class Assignment23 {

	String getmaxlengthName(String str) {
		String[] arr = str.split(" ");
		int maxlength = arr[0].length();
		String maxname = " ";
		for (int index = 1; index < arr.length; index++) {
			if (maxlength < arr[index].length()) {

				maxname = arr[index];
			}
		}
		return maxname;
	}

	boolean isDigitPresentInString(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	void getDigitString(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			boolean ans = isDigitPresentInString(arr[index]);
			if (ans == true) {
				System.out.println(arr[index]);
			}
		}
	}
	
	int isUpperCount(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}

	void getMaxUppserCaseString(String str) {
		int maxstringcount = 0;
		String maxstringname = " ";
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int maxstringcount1 = isUpperCount(arr[index]);
			if (maxstringcount < maxstringcount1) {
				maxstringcount = maxstringcount1;
				maxstringname = arr[index];
			}
		}
		System.out.println(maxstringname);
	}

	int getDigitUpperCount(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) || Character.isUpperCase(ch)) {
				count = count + 1;
				;
				break;
			}
		}
		return count;
	}

	void getNoDigitNoCount(String str) {
		String noDigitUpper = " ";
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int count = getDigitUpperCount(arr[index]);
			if (count == 0) {
				noDigitUpper = arr[index];
			}
		}
		System.out.println(noDigitUpper);
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		String str = "Good morning friends this is technocredits";
		String ans = assignment23.getmaxlengthName(str);
		System.out.println(ans);
		System.out.println("");
		String str1 = "Good mor9ning fr3iends t2hi2s is technocredits";
		assignment23.getDigitString(str1);
		System.out.println("");
		String str2 = "Good Mor9niNg FR3ienDs t2hi2s istEchnocredits";
		assignment23.getMaxUppserCaseString(str2);
		System.out.println("");
		String str3 = "Good Mor9niNg techno FR3ienDs t2hi2s istEchnocredits";
		assignment23.getNoDigitNoCount(str3);
	}
}
