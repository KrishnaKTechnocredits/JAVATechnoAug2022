//count number of vowels in given String

package harshadaJagtap.Array;

public class Example10 {
	int count=0;
	
	int getCountofvowels(String input) {
		char ch='\0';
		for(int index=0;index<input.length();index++) {
			ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}	
		}
			return count;
		} 
	
		public static void main(String[] args) {
			Example10 example10=new Example10();
			example10.getCountofvowels("maulik");
			System.out.println(example10.count);
		}
	}
