package swapnilMaheshwari.Collection.ArrayList.Assignment38;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOfStringUsingArrayList {

	boolean isSingleUpperCase(String word) {
		int count = 0;
		boolean flag = false;
		for (int j = 0; j < word.length(); j++) {
			char cha = word.charAt(j);
			if (Character.isUpperCase(cha))
				count++;
		}
		if (count == 1) {
			flag = true;
		}
		return flag;
	}

	ArrayList<String> arrayProcessData(String[] strArr) {
	ArrayList<String> listOfString = new ArrayList<String>();
		for (int index = 0; index < strArr.length; index++) {
			String str = strArr[index];
			char firstChar = str.charAt(0);
			boolean flag = false;
			boolean isDigitFlag = false;
			if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'
					|| firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O'
					|| firstChar == 'U') {
				for (int i = 0; i < str.length(); i++) {

					char ch = str.charAt(i);

					if (Character.isDigit(ch)) {
						isDigitFlag = true;
						break;
					}
				}
				if (isDigitFlag)
					flag = isSingleUpperCase(str);
			}
			if (flag) {
				listOfString.add(str);
			}
		}
		return listOfString;
	}

	public static void main(String[] args) {
		String[] input = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };
		ArrayList<String> listOfName = new ArrayList<String>();
		ListOfStringUsingArrayList listOfStringUsingArrayList = new ListOfStringUsingArrayList();
		for (int k = 0; k < input.length; k++) {
			listOfName = listOfStringUsingArrayList.arrayProcessData(input);
		}
		System.out.println(listOfName);
	}

}
