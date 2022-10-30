package priyankaD.assignments_31_40;

public class Assignment_36 {
/*Program 1 : 
 WAP to return String by encrypting all characters from given string by its next character.
 input : apdz
 output : bqea*/
		String returnStringByItsNextCharacter(String str) {
			String out="";
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(ch=='z') {
					out=out+'a';
					}
				else {
					out=out+(char)(ch+1);
				}
		      }return out;
		}
/*Program 2 : 
  WAP to return ascii of given character.
  input : C ;output : 67*/
/*Program 3 : 
  WAP to print ascii value of A->Z*/
	      void printAscii(char ch) {
	    	  int ascii= ch;
	    	  System.out.println(ch+"--->"+ascii);
	      }
/*Program 4 :
  Return count of digits from given String without using isDigit method of Character class..
  input : te1chno2cre4di6ts 
  output : 4*/
	      int countOfDigitsFromGivenString(String input1) {
	    	  int count=0;
	    	  for(int i=0;i<input1.length();i++) {
	    		  char ch=input1.charAt(i);
	    		  if(ch>=48 && ch<=57) {
	    			  count++;
	    			  }
	    	  }return count;
	      }
/* Program 5 :Return character holding given Ascii value.
 input : 69
 output : E
 Program 6 : Print all characters having ascii value 91 ot 96.*/
	        void printCharactersOfGivenAsciiValues(int ascii) {
	        	char ch=(char)(ascii);
	        	System.out.println(ascii+"-->"+ch);
	        }  
/*Program 7 : 
  WAP to return String by encrypting all characters from given string by its next character.
  input : aPd%3zZ
  output : bQe%3aA*/
	        String returnStringByEncryptingAllCharactersByItNextCharacter(String input) {
	        	String output="";
	        	for(int i=0;i<input.length();i++) {
	        		char ch=input.charAt(i);
					if(ch =='Z'){
	              	  output =output+ 'A';
	              	}else if(ch =='z'){
	              	  output=output + 'a';
	              	}else if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<=64)){
	              	   output=output+(char)(ch+1);
	              	  }
	              	else
	              		output=output+ch;
	              	}return output;
		}
	     public static void main(String[] args) {
	      Assignment_36 assignment= new Assignment_36();
	      System.out.println("*Program 1-(returnStringByItsNextCharacter)----------");
	      String str2=assignment.returnStringByItsNextCharacter("apdz");
	      System.out.println("apdz"+"-->"+str2);
	      
	      System.out.println("*Program 2-(return ascii of given character)---------");
	      assignment.printAscii('C');
	      
	      System.out.println("*Program 3-(print ascii value of A->Z)----------");
	      for(char ch='A';ch<='Z';ch++) {
	      assignment.printAscii(ch); }
	      
	      System.out.println("*Program 4-(countOfDigitsFromGivenString)---------");
	      int out=assignment.countOfDigitsFromGivenString("te1chno2cre4di6ts");
	      System.out.println("te1chno2cre4di6ts"+"-->"+out);
	      
	      System.out.println("*Program 5-(Return character holding given Ascii value)-------------");
	      assignment.printCharactersOfGivenAsciiValues(69);
	      
	      System.out.println("*Program 6-(printCharactersOfGivenAsciiValues)-----------");
	       for(int j=91;j<=96;j++) {
	       assignment.printCharactersOfGivenAsciiValues(j); }
	       
	       System.out.println("*Program 7-(return String by encrypting all characters from given string by its next character)----------");
	       String ans=assignment.returnStringByEncryptingAllCharactersByItNextCharacter("aPd%3zZ");
	    	System.out.println("aPd%3zZ"+"-->"+ans);
	      }
}
