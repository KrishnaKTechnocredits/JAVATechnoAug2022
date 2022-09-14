package gauravSahu;

public class StringReturn {

	int getnameLength(String name) {
		return name.length();
	}

	char getmiddlechar(String name) {
		System.out.println("Given String is " + name);
		int length = name.length();
		int index = 0;
		if(length%2==0) {
			index=length/2-1;
		}else {
			index=length/2;
		}return name.charAt(index);
	}

	public static void main(String[] args) {
		StringReturn s1 = new StringReturn();
		int lengthofstring = s1.getnameLength("Gaurav");
		System.out.println(lengthofstring);
		char name1=s1.getmiddlechar("Gaurav");
		System.out.println("Middle character is " + name1);
		char name2= s1.getmiddlechar("Technocredits");
		System.out.println("Middle character is " + name2);
	}
}
