package shraddhaRekhate.Assignment20;
//Time Required:10minutes
//5. Return count of vowels in a given String.
//input : maulik
//output : 3


public class CountOfVowelsInString {
   int countOfVowelsInGivenString(String str) {
	   int count=0;
	   for(int index=0;index<str.length();index++) {
		   char ch=str.charAt(index);
			 if(ch=='a' || ch=='e' || ch=='i' ||  ch=='o' || ch=='u') {
				 count++;
		   }
	   }
	   return count;
   }
   public static void main(String[] args) {
	   CountOfVowelsInString obj= new CountOfVowelsInString();
	   System.out.println("maulik->"+obj.countOfVowelsInGivenString("maulik"));
   }
}
