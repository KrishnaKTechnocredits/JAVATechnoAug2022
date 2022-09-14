/*Assignment - 18 : 8th Sep'2022

1) Write a program to rearrange String in given format. 
String str = "te2cH4no";
output : "24tecHno";
Hint : AllDigitAllCharacter

2) Write a program to rearrange String in given format. 
Hint : Uppercase letters + digits + LowerCase letter
input = "t8EcHNo5Cred3iTs";
output : EHNCT853tcoredis 
// Character.isUpperCase(ch), Character.isLowerCase(ch)

3) Find frequency of given character from given String. 
String str = "TechnoTtcredits";
char targetChar = 't';
output : 4
*/
package rahulSaswadkar;

public class StringProgram3 {
	public static void main(String[] args) {
		StringProgram3 stringProgram3 = new StringProgram3();
		String str = "te2cH4no";
		String str1 = "t8EcHNo5Cred3iTs";
		String str2 = "TechnoTtcredits";
		char c = 't';

		System.out.println("Rearranged String of Name \'" + str + "\' is : " + stringProgram3.m1(str));

		System.out.println("\nRearranged String of Name \'" + str1 + "\' is : " + stringProgram3.m2(str1));
		
		System.out.println("\nOccurence of Character \'" + c + "\' in String of Name \'" + str2 + "\' is : " + stringProgram3.m3(str2,c));
	}
	
	String m1(String str) {
		String s1 = "", s2 = "";// output ="";
		for(int index = 0; index< str.length(); index++) {
			char temp = str.charAt(index);
			if(Character.isLetter(temp))
				s1 = s1 + temp;
			else if(Character.isDigit(temp))
				s2 = s2 + temp;
			//output = s2 + s1;
		}
		return s2 + s1;
	}
	
	String m2(String str) {
		String s1 = "", s2 = "", s3 = "";// output ="";
		for(int index = 0; index< str.length(); index++) {
			char temp = str.charAt(index);
			if(Character.isUpperCase(temp))
				s1 = s1 + temp;
			else if(Character.isDigit(temp))
				s2 = s2 + temp;
			else if(Character.isLowerCase(temp))
				s3 = s3 + temp;
			//output = s1 + s2 + s3;
		}
		return s1 + s2 + s3;
	}
	
	int m3(String str, char c) {
		//String s1 = "", s2 = "", s3 = "";
		String lowerCase = str.toLowerCase();
		int count = 0;
		for(int index = 0; index< lowerCase.length(); index++) {
			char temp = lowerCase.charAt(index);
			if(temp == c)
				count += 1;
			
		}
		return count;
	}

}
