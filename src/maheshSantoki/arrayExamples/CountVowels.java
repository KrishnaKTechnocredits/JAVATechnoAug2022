/*Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3*/
package maheshSantoki.arrayExamples;

public class CountVowels {
	int countVowels(String name) {
		int c=0;
		for(int index=0;index<name.length();index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u' || name.charAt(index) == 'A'
					|| name.charAt(index) == 'E' || name.charAt(index) == 'I' || name.charAt(index) == 'O' 
					|| name.charAt(index) == 'U') {
				c++;
			}
		}
		return c;
	}
	void printCount(String[] name) {
		System.out.println("Vowels in given names : ");
		for(int index=0;index<name.length;index++) {
			int count=countVowels(name[index]);
			System.out.println(" -> "+name[index]+" :- "+count);
			}
		
	}
	public static void main(String[] args) {
		CountVowels countvowels=new CountVowels();
		
		String input[] = {"Ashish","Aditty","Manjiri","Ankita"};
		countvowels.printCount(input);
		}
}
