package shraddhaRekhate.Assignment28;
//Program 4: [15 mins]
//Print count of each vowels in a given String Array using switch case.
//
//input : {"technocredits", "swati", "aashvi"}
//output : vowel count in technocredits:
//		 e -> 2
//         o -> 1
//		 i -> 1
//		 vowel count in swati:
//		 a -> 1
//         i -> 1
//		 vowel count in aashvi:
//		 a -> 2
//         i -> 1
//

public class COuntOfEachVowelInGivenStringArraySwitchCase {
	   int count1=0;
	   int count2=0;
	   int count3=0;
	   int count4=0;
	   int count5=0;
   void countOfEachVowelsInGivenString(String str) {
	   String str1=str.toLowerCase();
	   for(int index=0;index<str1.length();index++) {
		   char ch=str1.charAt(index);
		   switch(ch) {
	        case 'A':
			case 'a':
				count1++;
				break;
			case 'E':
			case 'e':
				count2++;
				break;
			case 'I':
			case 'i':
				count3++;
				break;
			case 'O':
			case 'o':
				count4++;
				break;
			case 'U':
			case 'u':
				count5++;
				break;
		   }
		 }
	   if(count1>0) {
		   System.out.println("a->"+count1);
		   count1=0;
	   }
	   if(count2>0) {
		   System.out.println("e->"+count2);
		   count2=0;
	   }
	   if(count3>0) {
		   System.out.println("i->"+count3);
		   count3=0;
	   }
	   if(count4>0) {
		   System.out.println("o->"+count4);
		   count4=0;
	   }
	   if(count5>0) {
		   System.out.println("u->"+count5);
		   count5=0;
	   }
	   
   }
   
   void countOfEachVowelsInGivenStringArray(String[] arr) {
	   for(int index=0;index<arr.length;index++) {
		   System.out.println("vowel count in"+" "+arr[index]);
		  this.countOfEachVowelsInGivenString(arr[index]); 
	   }
   }
   public static void main(String[] args) {
	   COuntOfEachVowelInGivenStringArraySwitchCase countOfEachVowelInGIvenStringArray=new COuntOfEachVowelInGivenStringArraySwitchCase();
	   String strArray[]={"technocredits", "swati", "aashvi"};
	   countOfEachVowelInGIvenStringArray.countOfEachVowelsInGivenStringArray(strArray);
	}
}
