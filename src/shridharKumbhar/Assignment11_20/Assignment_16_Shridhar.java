package shridharKumbhar.Assignment11_20;


public class Assignment_16_Shridhar {
	
	String name ="Maulik";
	
	int getLenghtOfString(){
		
		int lenght = name.length();
		int index =0;
		if (lenght % 2 ==0) {
			index = (lenght/2)-1;
			return index;
		}else {
			index = (lenght / 2) + 1;
			return index;
		}

	}
	
	char getMiddleChar( int num) {
		
		char character = name.charAt(num);
		
		return character;
	}
	
	public static void main(String[] args) {
		
		Assignment_16_Shridhar assignmen16 = new Assignment_16_Shridhar();
			assignmen16.name = "Maulik";
			int number = assignmen16.getLenghtOfString();
			char later = assignmen16.getMiddleChar(number);
			System.out.println("Middle character in " + assignmen16.name + " is "+ later);
			
			assignmen16.name = "Technocredit";
			number = assignmen16.getLenghtOfString();
			later = assignmen16.getMiddleChar(number);
			System.out.println("Middle character in " + assignmen16.name + " is "+ later);

	}
}

