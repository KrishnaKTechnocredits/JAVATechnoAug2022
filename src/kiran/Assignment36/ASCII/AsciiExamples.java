package kiran.Assignment36.ASCII;


public class AsciiExamples {
	/*Program 2 : 
		WAP to return ascii of given character.
	*/
    void characterToAscii(char ch)
	{
	  int ascii = ch;
	  System.out.println("character "+ch+" ascii value -> "+ascii);
	}
    
    /*Program 5 : 
		Return character holding given Ascii value.

		input : 69
		output : E
     * */
   void asciiToCharacter(int ascii)
   	{
   	  char ch = (char)ascii;
   	  System.out.println("Ascii"+ascii+" to char -> "+ch);
   	}
   /*Program 1 : 
		WAP to return String by encrypting all characters from given string by its next character.
    */
   void encryptStrToNextchar(String str) {
	   System.out.println("input string: "+str);
	   char ch;
	   String output="";
	   for(int i=0;i<str.length();i++) {
		   ch=str.charAt(i);
		   if(ch =='z'){
				output = output + 'a';
			}
		   else if((ch>='a' && ch<='z')){   //if((ch>=97 && ch<=122))
			   ch++;
			   output=output+ch;
			}			
		}
		System.out.println("output: "+output);
   }
   /*Program 7 : 
	WAP to return String by encrypting all characters from given string by its next character.

	input : aPd%3zZ
	output : bQe%3aA
    * */
   void encryptAllStrCharToNextchar(String str) {
	   System.out.println("input string: "+str);
	   char ch;
	   String output="";
	   for(int i=0;i<str.length();i++) {
		   ch=str.charAt(i);
		   if(ch =='Z'){
				output = output + 'A';
			}else if(ch =='z'){
				output = output + 'a';
			}else{
				if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){ //if((ch>='A' && ch<='Z')) ||(ch>='a' && ch<='z'))
					ch++;
				}
			   output=output+ch;
			}			
		}
		System.out.println("output: "+output);
   }
   
   /*Program 4 :
	Return count of digits from given String without using isDigit method of Character class.
	input : te1chno2cre4di6ts 
	output : 4
    */
   
   void countDigitFromString(String str) {
	   System.out.println("input string: "+str);
	   int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9') {
		
				count++;
			}
		}
		System.out.println("count of digit in string: "+count);
   }
   
	public static void main(String[] args) {
		AsciiExamples obj=new AsciiExamples();
		obj.characterToAscii('C');
		obj.asciiToCharacter(69);
		obj.encryptStrToNextchar("apdz");
		
		/*Program 3 : 
			WAP to print ascii value of A->Z.

			output : A -> 65
         			B -> 66
		 			.
		 			.
		 			Z -> 90
		 * */
		for(char ch1 ='A';ch1<='Z';ch1++ ) { //for(char ch1 =65;ch1<=90;ch1++ )
			int ascii=ch1;
			System.out.println(ch1+" -> "+ascii);
	 	}
		
		obj.countDigitFromString("te1chno2cre4di6ts");
		
		/*Program 6 : 
			Print all characters having ascii value 91 ot 96.

			output : 	91 -> [
         				92 -> \
         				93 -> ]	
		 * */
		//System.out.println();
		for(int i=91;i<=96;i++) {
			obj.asciiToCharacter(i);
		}
		
		//System.out.println();
		obj.encryptAllStrCharToNextchar("aPd%3zZ");
	}
}

