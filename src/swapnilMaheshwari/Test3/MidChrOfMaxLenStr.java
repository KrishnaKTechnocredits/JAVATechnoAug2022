/*
Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c

*/

package swapnilMaheshwari.Test3;

public class MidChrOfMaxLenStr {

	char geMaxLenChrOfStr(String[] str) {
		String maxLengthName = str[0];
		int maxLength = 0;
		int ind = 0;
		for (int index = 0; index < str.length; index++) {

			if (maxLengthName.length() < str[index].length()) {
				maxLength = str[index].length();
				maxLengthName = str[index];

			}
		}

		if (maxLength % 2 == 0) {
			ind = maxLength / 2 - 1;
		}

		else
			ind = maxLength / 2;

		return maxLengthName.charAt(ind);
	}

	public static void main(String[] args) {
		String[] strArr = { "Swpnil", "Ashish", "Technocredits", "Nilesh" };
		MidChrOfMaxLenStr midChrOfMaxLenStr = new MidChrOfMaxLenStr();
		char c = midChrOfMaxLenStr.geMaxLenChrOfStr(strArr);
		System.out.println(c);
	}

}
