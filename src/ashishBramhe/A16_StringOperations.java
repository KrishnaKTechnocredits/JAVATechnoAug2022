package ashishBramhe;

public class A16_StringOperations {

	int getNameLength(String name) {
		System.out.print("\n Length of name : " + name + " : ");
		return name.length();
	}
	
	char getMiddleCharacter(String name) {
		char middleChar = '\0';
		middleChar = name.charAt((name.length()/2) - 1);
		System.out.print("\n Middle Character in name : " + name + " : ");
		return middleChar;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A16_StringOperations stringOperations = new A16_StringOperations();
		System.out.println(stringOperations.getNameLength("StringOperations"));
		System.out.println(stringOperations.getMiddleCharacter("MAULIK"));
	}
}
