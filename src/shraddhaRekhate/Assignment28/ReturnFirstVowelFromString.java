package shraddhaRekhate.Assignment28;
//Program 2 : [10 mins]
//Return first vowel from given String.
//
//input : technocredits
//outout : e
public class ReturnFirstVowelFromString {
  char returnFirstVowel(String str) {
	  char ch='b';
	  String str1=str.toLowerCase();
	  for(int index=0;index<str1.length();index++) {
			char ch2=str1.charAt(index);
	      switch(ch2) {
			case 'a':
				return ch2;
			case 'e':
				return ch2;
			case 'i':
				return ch2;
			case 'o':
				return ch2;
			case 'u':
				return ch2;
	      }
	    }
	  return ch;
  }

		public static void main(String[] args) {
			ReturnFirstVowelFromString returnFirstVowelFromString=new ReturnFirstVowelFromString();
			System.out.println(returnFirstVowelFromString.returnFirstVowel("technocredits"));
		}
}	
