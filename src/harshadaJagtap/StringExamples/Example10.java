//3) Find frequency of given character from given String. 
//String str = "TechnoTtcredits";
//char targetChar = 't';
//output : 4

package harshadaJagtap.StringExamples;

public class Example10 {
	
	int getCountofTargetChar(String input, char targetChar) {
		int count=0;
		input= input.toLowerCase();
		targetChar= Character.toLowerCase(targetChar);
		
		for(int index=0; index<input.length();index++) {
			char ch= input.charAt(index);
			if(ch==targetChar)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Example10 example10=new Example10();
		int frequency=example10.getCountofTargetChar("TechnoTtcredits",'T');
		System.out.println(frequency);
	}
	
	}
