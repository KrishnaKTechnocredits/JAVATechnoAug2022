package monikaDwivedi;
//techno2cr5edit7ts
/*sum of digits
 * length method for length
 * charAt() from string class 
 * 
 * */
//String is a non premitive datatype as well as String is a class
//Hence, String s = ""; s. -> can call all methods of String class.
// String str = new String("technocredits");
// String str = "technocredits";

public class InterviewQ1 {
	int digitSum = 0;
	int getDigitSum(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				
			}
		}
		return digitSum;
	}
}
