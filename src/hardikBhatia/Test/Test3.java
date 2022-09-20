package hardikBhatia.Test;

public class Test3 {
	
	char getMiddleCharOfString(String name) {
		int middleCharIndex = 0;
		int length = name.length();
		if(length % 2 == 0) {
			middleCharIndex = length / 2 - 1;
		}else {
			middleCharIndex = length / 2;
		}
		return name.charAt(middleCharIndex);
	}
	
	// Pro : 1 Return middle character of max length String from given array.
	char getCharaterOfLogestString(String[] names) {
		int maxLength = 0;
		String longestedName = "";
		for(int index = 1; index < names.length;index++) {
			int currentNameLength = names[index].length();
			if(maxLength < currentNameLength) {
				maxLength = currentNameLength;
				longestedName = names[index];
			}
		}
		return getMiddleCharOfString(longestedName);
	}
	
	public static void main(String[] args) {
		Test3 test3 = new Test3();
		String[] names = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		System.out.println(test3.getCharaterOfLogestString(names)); 
		
		// Pro : 2 Write a method to return middle character of each elements from given array.
		String[] nameList = {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		for(int index = 0; index < nameList.length; index++) {
			System.out.println(nameList[index] + "-->" + test3.getMiddleCharOfString(nameList[index]));
		}
	}

}
