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

package sanket;

public class StringOperationsAdvance {

  //a program to rearrange String in given format -  AllDigitAllCharacter

  String allDigitAllCharacter(String str) {

    String allDigit = "";
    String allLetter = "";
    String sumAllDigitAllLetter = "";

    for (int index = 0; index < str.length(); index++) {
      char ch = str.charAt(index);
      if (Character.isDigit(ch)) {
        allDigit = allDigit + ch;
      } else if (Character.isLetter(ch)) {
        allLetter = allLetter + ch;
      }
      sumAllDigitAllLetter = allDigit + allLetter;
    }
    return sumAllDigitAllLetter;
  }

  //a program to rearrange String in given format - Uppercase letters + digits + LowerCase letter

  String allDigitAllUpperLowerCharacter(String str) {

    String allUpperLetter = "";
    String allDigit = "";
    String allLowerLetter = "";
    String sumAllUpperLetterAllDigitAllLowerLetter = "";

    for (int index = 0; index < str.length(); index++) {
      char ch = str.charAt(index);

      if (Character.isUpperCase(ch)) {
        allUpperLetter = allUpperLetter + ch;
      } else if (Character.isDigit(ch)) {
        allDigit = allDigit + ch;
      } else if (Character.isLowerCase(ch))
        allLowerLetter = allLowerLetter + ch;

      sumAllUpperLetterAllDigitAllLowerLetter = allUpperLetter + allDigit + allLowerLetter;
    }
    return sumAllUpperLetterAllDigitAllLowerLetter;
  }

  // frequency of given character from given String

  int getCountOfTargetChar(String str, char targetChar) {

    str = str.toLowerCase();
    targetChar = Character.toLowerCase(targetChar);
    int count = 0;
    for (int index = 0; index < str.length(); index++) {
      char ch = str.charAt(index);
      if (ch == targetChar) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {

    StringOperationsAdvance stringOperationsAdvance = new StringOperationsAdvance();

    String sumAllDigitAllLetter = stringOperationsAdvance.allDigitAllCharacter("te2cH4no");
    System.out.println("The DigitLetter style for string 'te2cH4no' is : " + sumAllDigitAllLetter);

    String sumAllUpperLetterAllDigitAllLowerLetter = stringOperationsAdvance.allDigitAllUpperLowerCharacter("t8EcHNo5Cred3iTs");
    System.out.println("The UpperCaseDigitLowerCase style for string 't8EcHNo5Cred3iTs' is : " + sumAllUpperLetterAllDigitAllLowerLetter);

    int getCountOfTargetChar = stringOperationsAdvance.getCountOfTargetChar("TechnoTtcredits", 't');
    System.out.println("The the freqency of 't'in string 'TechnoTtcredits' is : " + getCountOfTargetChar);
  }
}