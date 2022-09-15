package rohini.StringProg;

public class StringLength {

	int getNameLength(String name) {
		int length = name.length();
		return length;
	}
	char getMiddleCharacter(String name) {
		int length = getNameLength(name);
		char ch = 0;
		int index = 0;
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else
			index = length / 2;
		ch = name.charAt(index);
		return ch;
	}
	public static void main(String[] args) {
		StringLength obj=new StringLength();
		String name1="Rohini";
		int len=obj.getNameLength(name1);
		System.out.println("Length of "+name1+" is "+len);
		System.out.println("Middle character in name "+name1+" is- "+obj.getMiddleCharacter(name1));
		System.out.println("*********************************************");
		String name2="Technocredits";
		int len2=obj.getNameLength(name2);
		System.out.println("Length of "+name2+" is "+len2);
		System.out.println("Middle character in name "+name2+" is- "+obj.getMiddleCharacter(name2));
	}
}
