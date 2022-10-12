/*
 Program : [15 mins]
Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1
 */

package swapnilMaheshwari.SwitchCasePrograms;

public class CountOfEachVowelsInString {
	int aCount=0;
	int eCount=0;
	int iCount=0;
	int oCount=0;
	int uCount=0;
	void getCountOfEachVowelsInString(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			switch(ch) {
			case 'A':
			case 'a':
				aCount++;
				break;
			case 'E':
			case 'e':
				eCount++;
				break;
			case 'I':
			case 'i':
				iCount++;
				break;
			case 'O':
			case 'o':
				oCount++;
				break;
			case 'U':
			case 'u':
				uCount++;
				break;
			default:
				break;
	}
			
}
		if (aCount>0) 
			System.out.println('a' +"->"+aCount);
		if (eCount>0)
			System.out.println('e' +"->"+eCount);
		if (iCount>0)
			System.out.println('i' +"->"+iCount);
		if (oCount>0) 
			System.out.println('o' +"->"+oCount);
		if (uCount>0) 
			System.out.println('u' +"->"+uCount);

}
	public static void main(String[] args) {
		String input="Technocredits";
		new CountOfEachVowelsInString().getCountOfEachVowelsInString(input);
	}

}
