//Assignment-27 : 23rd Sep'2022

package komalShrivastava;

public class UniqueCharacter {
	
	//method to print unique character of each name in given string array
	//Note: Set isfirstUniqueFlag as true to get first unique character
	//		Set isfirstUniqueFlag as false to get all unique characters
	
	static void printUniqueCharacter(String[] arrInput, boolean isfirstUniqueFlag) {
		for(int i=0; i<arrInput.length; i++) {
			if(!isfirstUniqueFlag)
				System.out.println("Unique Character in " + arrInput[i]);
			else
				System.out.println("First Unique Character in " + arrInput[i]);
			for(int j=0; j<arrInput[i].length(); j++) {
				char ch = arrInput[i].charAt(j);
				if(arrInput[i].indexOf(ch) == arrInput[i].lastIndexOf(ch)) {
					System.out.println(ch);
					if(isfirstUniqueFlag)
						break;
				}		
			}
		}	
	}	

	public static void main(String[] args) {
		String[] arrName = {"MaulikM", "KananiK","Mahesh", "AakankshA"};
		
		// print all unique characters
		printUniqueCharacter(arrName, false);
		System.out.println("----------------------------------------");
		
		// print first unique character
		printUniqueCharacter(arrName, true);
	}
}