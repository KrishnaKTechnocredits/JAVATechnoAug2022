package chiragPatel;

public class Assignment_16 {
	int getNameLength(String name) {
			return name.length();
		}
		
		char getMiddleChar(String name) {
			int index = 0;
			int length = name.length();
			if(length % 2 == 0) {
				index = length / 2-1;
			}else {
				index = length / 2;
			}
			return name.charAt(index);
		}
		
		public static void main(String[] args) {
			Assignment_16 assignment16 = new Assignment_16();
			int nameLength = assignment16.getNameLength("Chirag");
			System.out.println("Name Length is :" + nameLength);
			
			char middleChar = assignment16.getMiddleChar("Technocredit");
			System.out.println("Middle charater is :" + middleChar);
			
		}
	}


