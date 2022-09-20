//get the vowel count from given array of String

package harshadaJagtap.Array;

import saroj.stringPrograms.NameLength;

public class Example11 {
	
	int getCountofvowels(String input) {
		int count=0;
		char ch='\0';
		input= input.toLowerCase();
		for(int index=0;index<input.length();index++) {
			ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}	
		}
			return count;
		} 
	
	void inputString(String[] name) {
		for(int index=0;index<name.length;index++) {
			int vowelCount=getCountofvowels(name[index]);
			System.out.println(name[index]+"->"+vowelCount);
		}
		
	}
	
	
	public static void main(String[] args) {
		Example11 example11=new Example11();	
		String[] arr= {"Ashish","Aditty","Manjiri","Ankita"};
		example11.inputString(arr);
	}

}
