package gauravSahu;

public class String18Assign {

	String output(String name) {
		String name1="";
		String name2="";
		for(int index=0; index<name.length();index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				name1 = name1 + ch;
			}else if(Character.isLetter(ch)) {
				name2 = name2+ ch;
			}
		}return name1 + name2;	
	}
	
	String concate(String name) {
		String name1="";
		String name2="";
		String name3="";
		for(int index=0;index<name.length();index++) {
			char ch = name.charAt(index);
			if(Character.isUpperCase(ch)) {
				name1 = name1 + ch;
			}else if(Character.isLowerCase(ch)) {
				name2 = name2 + ch;
			}else if(Character.isDigit(ch)) {
				name3 = name3 + ch;
			}
		}return name1 + name2 + name3;
	}
	
	int countchar(String name, char reqchar) {
		int count = 0 ;
		name = name.toLowerCase();
		reqchar = Character.toLowerCase(reqchar);
		for(int index=0;index<name.length();index++) {
			char ch = name.charAt(index);
			if(ch == 't') {
				count++;
			}
		}return count;
	}
	
	
	public static void main(String[] args) {
		String18Assign s1 = new String18Assign();
		String name= s1.output("te2cH4no");
		System.out.println(name);
		System.out.println("");
		String name1= s1.concate("t8EcHNo5Cred3iTs");
		System.out.println(name1);
		System.out.println("");
		int count = s1.countchar( "TechnoTtcredits", 'T');
		System.out.println(count);
	}
}
