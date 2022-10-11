package shraddhaRekhate.Assignment20;

import java.util.Arrays;

//Time required:
//6. Write a method to count vowels of each name in given array.
//input : {"Ashish","Aditty","Manjiri","Ankita"}
//output : Ashish -> 2
//         Aditty -> 2
//		 Manjiri -> 3
//		 Ankita -> 3

public class COuntVowelsOfEachNameInGIvenArray  {
	int countOfVowelsInGivenString(String str) {
		   int count=0;
     	   for(int index=0;index<str.length();index++) {
     		   String str2=str.toLowerCase();
			   char ch=str2.charAt(index);
			   if(ch=='a' || ch=='e' || ch=='i' ||  ch=='o' || ch=='u') {
					 count++;
			   }
		   }
		   return count;
	   }
	
    int[] countVowelsOfEachNameInGivenArray(String[] arr) {
	  int[] output=new int[arr.length];
	  System.out.println(Arrays.toString(arr));
	  for(int index=0;index<arr.length;index++) {
		  output[index]=countOfVowelsInGivenString(arr[index]);
	  }
	  return  output;
    }
    
    void display(String[] arr,int[] output) {
	   for(int index=0; index<arr.length; index++) {
		   System.out.println(arr[index]+"->"+" "+output[index]);
	   }
   }
    
   public static void main(String[] args) {
	  COuntVowelsOfEachNameInGIvenArray obj3=new COuntVowelsOfEachNameInGIvenArray();
	  String[] arr={"Ashish","Aditty","Manjiri","Ankita"};
      //System.out.println(obj3.countVowelsOfEachNameInGivenArray(arr));
      int[] output=obj3.countVowelsOfEachNameInGivenArray(arr);
      obj3.display(arr, output);
  }
}
  
