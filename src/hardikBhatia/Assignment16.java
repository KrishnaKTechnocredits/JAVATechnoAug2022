package hardikBhatia;

public class Assignment16 {
	int getNameLength(String name) {
		return name.length();
	}
	
	char getMiddleChar(String name) {
		int index = 0;
		int length = name.length();
		if(length % 2 == 0) {
			index = length / 2 - 1;
		}else {
			index = length / 2;
		}
		return name.charAt(index);
	}
	
	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		int nameLength = assignment16.getNameLength("Hardik");
		System.out.println("Name Length is :" + nameLength);
		
		char middleChar = assignment16.getMiddleChar("Hardik");
		System.out.println("Name's middle charater is :" + middleChar);
		
	}
}
