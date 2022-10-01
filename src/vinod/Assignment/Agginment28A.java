package vinod.Assignment;

public class Agginment28A {
	
	int getVowels(String name) {
		String name2 = name.toLowerCase();
		int count = 0;
		for (int index =0; index<name.length(); index++) {
			char ch = name2.charAt(index);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Agginment28A agginment28A = new Agginment28A();
		String input = "Technocredits";
		int count = agginment28A.getVowels(input);
		System.out.println("No. of Vowels in "+input+ "-----"+count);
		
	}

}
