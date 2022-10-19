package shraddhaRekhate.Assignment36;
//Program 4 :
//Return count of digits from given String without using isDigit method of Character class..
//
//input : te1chno2cre4di6ts 
//output : 4

public class ReturnCountOfDigits {
 int returnCount(String str) {
	 int count=0;
	 //char[] ch=str.toCharArray();
	 for(int index=0;index<str.length();index++) {
		 char ch=str.charAt(index);
		 if(ch>=48 &&ch<=57) {
			 count++;
		 }
	 }
	  return count;
 }
 
 public static void main(String[] args) {
	 ReturnCountOfDigits returnCountOfDigits=new ReturnCountOfDigits();
	 System.out.println("output:"+returnCountOfDigits.returnCount("te1chno2cre4di6ts"));
}
}
