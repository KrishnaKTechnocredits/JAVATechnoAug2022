package manjiri.StringEx.assignment31;

public class CheckPallindromWithoutReversingString {
	
	
	void CheckPallindromWithoutStringReverse(String input) {
		//Convert String to lowercase
		input = input.toLowerCase();
		boolean flag = true;
		
		//Check if char at first index and last index is same 
		//and go on gradually increasing/decreasing the index
		for (int index = 0, outIndex = input.length()-1; index < outIndex; index++, outIndex--) {
			if(input.charAt(index) != input.charAt(outIndex)) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println(input + " " + "is a Pallindrom");
		}
		else {
			System.out.println(input + " " + "is not a Pallindrom");
		}	
	}
	
	public static void main(String[] args) {
		CheckPallindromWithoutReversingString checkPallindrom = new CheckPallindromWithoutReversingString();
		checkPallindrom.CheckPallindromWithoutStringReverse("Radar");
		checkPallindrom.CheckPallindromWithoutStringReverse("aAbcbaa");
		checkPallindrom.CheckPallindromWithoutStringReverse("abcaBc");
	}

}
