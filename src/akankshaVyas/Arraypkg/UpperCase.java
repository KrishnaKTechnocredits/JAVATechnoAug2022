package akankshaVyas.Arraypkg;

public class UpperCase {
	int getUpperCaseWord(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
			count++;
	}
}
return count;
}

void printData(String str) {
String[] arr = str.split(" ");
int maxCount = 0;
String word="";
for (int index = 0; index < arr.length; index++) {
	int maxCountWord = getUpperCaseWord(arr[index]);
	if (maxCount < maxCountWord) {
		maxCount = maxCountWord;
		  word=arr[index];
	}
}
System.out.println("the word is - " + word);
}

public static void main(String[] args) {
new UpperCase().printData("Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits");
new UpperCase().printData("good mor9ning friens thi2s is technocredits");

}

}


