package vinod.Assignment;

public class Assignment28B {
	
	char getFirstVowels(String name) {
		for (int index =0; index<name.length(); index++) {
			char ch = name.charAt(index);
			switch (ch) {
			case 'a':{
				return ch;
			}
			case 'e':{
				return ch;
			}
			case 'i':{
				return ch;
			}
			case 'o':{
				return ch;
			}
			case 'u':{
				return ch;
			}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Assignment28B assignment28B = new Assignment28B();
		String input = "technocredits";
		char ch = assignment28B.getFirstVowels(input);
		System.out.println("First vowels of giving string" +input+ "is" +">>>>>>"+ ch);
	}

}
