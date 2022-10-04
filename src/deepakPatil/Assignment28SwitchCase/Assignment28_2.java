/*Assignment - 28 : 25th Sep'2022
Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

Program 4: [15 mins]
Print count of each vowels in a given String Array using switch case.

input : {"technocredits", "swati", "aashvi"}
output : vowel count in technocredits:
		 e -> 2
         o -> 1
		 i -> 1
		 vowel count in swati:
		 a -> 1
         i -> 1
		 vowel count in aashvi:
		 a -> 2
         i -> 1
*/

package deepakPatil.Assignment28SwitchCase;

import java.util.Arrays;

public class Assignment28_2{
	
	void getCountOfEachVowel(String str){
		String lowerCaseStr=str.toLowerCase();
		
		int countA=0;
		int countE=0;
		int countI=0;
		int countO=0;
		int countU=0;
		
		for(int index=0; index<lowerCaseStr.length();index++){
			char ch=lowerCaseStr.charAt(index);
			
			switch(ch) {
				case 'a':
					countA++;
					break;
				case 'e':
					countE++;
					break;
				case 'i':
					countI++;
					break;
				case 'o':
					countO++;
					break;
				case 'u':
					countU++;
					break;
			}
		}
		
		System.out.println("Vowels count from String '"+str+"' is as below:");
		if(countA>0)
			System.out.println("a --> "+countA);
		if(countE>0)
			System.out.println("e --> "+countE);
		if(countI>0)
			System.out.println("i --> "+countI);
		if(countO>0)
			System.out.println("o --> "+countO);
		if(countU>0)
			System.out.println("u --> "+countU);
		System.out.println("----------------------------------------------------------");
	}
	
	void getCountOfEachVowelFromArray(String[]arr){
		
		for(int index=0;index<arr.length;index++){
			getCountOfEachVowel(arr[index]);
		}
	}
	
	public static void main(String[]args){
		Assignment28_2 assignment28_2 = new Assignment28_2();
		String str="TechnOcredits";
		assignment28_2.getCountOfEachVowel(str);
		
		String[]arr={"technocredits", "swati", "aashvi"};
		System.out.println("\nGiven input array is "+Arrays.toString(arr));
		assignment28_2.getCountOfEachVowelFromArray(arr);

	}
	
}