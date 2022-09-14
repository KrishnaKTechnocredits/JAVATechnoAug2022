package manjiri;

public class ReturnTypeEx2 {
	int getNameLength(String name) {
		return name.length();
	}
	
	char getMiddleChar(String name) {
		int nameLength = getNameLength(name);
		if(nameLength % 2 == 0) {
			return name.charAt((nameLength/2)-1);
		}
		else {
			return name.charAt(nameLength/2);
		}
	}
	public static void main(String[] args) {
		ReturnTypeEx2 returnTypeEx2 = new ReturnTypeEx2();
		System.out.println(returnTypeEx2.getMiddleChar("Maulik"));
		char result =returnTypeEx2.getMiddleChar("Technocredits");
		System.out.println(result);
	}
}
