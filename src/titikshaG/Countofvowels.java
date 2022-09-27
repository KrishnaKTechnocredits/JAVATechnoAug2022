package titikshaG;

import java.util.Arrays;

//Program 1 : [10 mins - 13 mins]
//Return count of vowels in a given String using switch case.
public class Countofvowels {
	int totalNumberOfVowels(String name){
		int count=0;
		name=name.toLowerCase();{
		for(int index=0;index<name.length();index++){
			char ch=name.charAt(index);
			switch (ch) {
				case 'a': 
				case 'e':
				case 'i': 
				case 'o': 
				case 'u': 
			count++;}
		}
	}
	return count;}
	
//Program 2 : [10 mins]
//Return first vowel from given String
	char firstVowel(String name){
		name=name.toLowerCase();
		char ch=name.charAt(0);
		int count=0;
		for(int index=0;index<name.length();index++){
			ch=name.charAt(index);{
			switch (ch) {
				case 'a': 
				case 'e':
				case 'i': 
				case 'o': 
				case 'u': 
			count++;
			break;}
		}
		if(count==1)
			break;}
		return ch ;}

//Program 3:Print count of each vowels in a given String using switch case.
//input : technocredits
	void countOfEachVowel(String name){
		name=name.toLowerCase();
		int counta=0;
		int counte=0;
		int counti=0;
		int counto=0;
		int countu=0;
		for(int index=0;index<name.length();index++){
			char ch=name.charAt(index);
			switch (ch) {
				case 'a':{
					counta++;
					break;}
				case 'e':{
					counte++;
					break;}
				case 'i':{
					counti++;
					break;} 
				case 'o':{
					counto++;
					break;} 
				case 'u': {
					countu++;
					break;}
				default:{
					break;}
			}
		}
		if(counta > 0)
			{
			System.out.println("a"+"->"+counta);
			}
		if(counte > 0)
			{
			System.out.println("e"+"->"+counte);
			}
		if(counti > 0)
			{
			System.out.println("i"+"->"+counti);
			}
		if(counto > 0)
			{
			System.out.println("o"+"->"+counto);
			}
		if(countu > 0)
			{
			System.out.println("u"+"->"+countu);
			}
	}
//Program 4: [15 mins]
//Print count of each vowels in a given String Array using switch case.
//input : {"technocredits", "swati", "aashvi"}
//output : vowel count in technocredits:
	
	void printCountOfEachVowel(String[] arr) {
		for(int index=0;index<arr.length;index++)
			{
			System.out.println("Vowels in"+" "+arr[index]+" "+"is:");
			countOfEachVowel(arr[index]);
			}
	}
		
	public static void main(String[] args){
		Countofvowels countofvowels=new Countofvowels();
		String input="TechnOcredits";
		System.out.println("--------------------"+"Program 1"+"-----------------------");
		System.out.println("Input of program first is:"+input);
		System.out.println();
		System.out.println("Total number of vowels in string are:"+countofvowels.totalNumberOfVowels(input));
		System.out.println();
		
		System.out.println("--------------------"+"Program 2"+"-----------------------");
		System.out.println("Input of program first is:"+input);
		System.out.println("First vowel in string is:"+countofvowels.firstVowel(input));
		
		System.out.println("--------------------"+"Program 3"+"-----------------------");
		System.out.println("Input of program first is:"+input);
		System.out.println("Count of each chararcter is:");
		countofvowels.countOfEachVowel(input);
		System.out.println();
		
		System.out.println("--------------------"+"Program 4"+"-----------------------");
		String[] input2={"Technocredits", "Swati", "Aashvi"};
		System.out.println("Input array" + Arrays.toString(input2));
		System.out.println("Number of vowels in each string are:");
		countofvowels.printCountOfEachVowel(input2);
		}
}

			
			
			


