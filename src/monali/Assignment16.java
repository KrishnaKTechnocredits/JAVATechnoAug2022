package monali;

public class Assignment16 {
	

		int getNameLength(String name) {
			int length = name.length();
			return length;
		}

		char getMiddleChar(String name) {
			char letter;
			int len = getNameLength(name);
			if(len%2==0) {
				letter = name.charAt((len/2)-1);
				return letter;
			}
			else {
				letter = name.charAt(len/2);
				return letter;
			}

		}

		void printInfo(String name) {
			char letter = getMiddleChar(name);
			System.out.println("Middle character in name "+ name +" is : "+ letter);
		}	


		public static void main(String[] args) {
			Assignment16 assignment16 = new Assignment16();
			assignment16.printInfo("Maulik");
		assignment16.printInfo("Technocredits");
		}

}
