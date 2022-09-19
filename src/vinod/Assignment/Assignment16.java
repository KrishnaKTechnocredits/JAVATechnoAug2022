package vinod.Assignment;

public class Assignment16 {
	int getStringLength(String str) {
		int strLength = str.length();
		return strLength;
	}
	char getStringChar(String str) {
	int strIndex = 0;
	int strLength = getStringLength(str);
	
	if(strLength%2==0)
		strIndex = strLength/2-1;
		else
			strIndex = strLength/2;
	return str.charAt(strIndex);
	}
	
	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		System.out.println("Programe to find string length and middle character");
		
		String inputString = "Vinod";
		char result = assignment16.getStringChar(inputString);
		System.out.println("Length: "+ assignment16.getStringLength(inputString));
		System.out.println("Middle character: "+result);
		
				
	}

}
