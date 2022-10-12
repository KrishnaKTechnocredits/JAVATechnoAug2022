package nikitaPhase;


public class Assignment_26_TejasP {
	
	void charFrequency(String str) {
		
		//iterate the loop until string length becomes 1:
		while (str.length() >=1) {
			char ch = str.charAt(0);
			
			// convert above char into below string for replacement method:
			String str1 = Character.toString(ch); 
			int originalLength = str.length();
			str = str.replace(str1, "");
			
			/*initialized newLength integer to capture string length after
			string replacement*/
			int newLength = str.length();
			
			System.out.println(" "+str1 + "--" + (originalLength - newLength));
		}

	}
	public static void main(String[] args) {
		
		System.out.println("Assignment - 26 : 21st Sep'2022\r\n"
				+ "find out frequency of each character from \ngiven input using single while loop.\r\n"
				+ "\nString str = \"technocreditst\"\n");
		
		Assignment_26_TejasP charFrequency = new Assignment_26_TejasP();
		
		charFrequency.charFrequency("technocreditst");
	}
}

