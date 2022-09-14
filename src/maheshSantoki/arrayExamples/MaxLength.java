/*Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits*/
package maheshSantoki.arrayExamples;

public class MaxLength {
		
	String maxLength(String[] name) {
		int maxLen=name[0].length();
		String maxString=name[0];
		for(int i=0;i<name.length;i++) {
			if(name[i].length() > maxLen)
			{
				maxString=name[i];
			}
		}
		return maxString;
		}
	public static void main(String[] args) {
		MaxLength maxlength=new MaxLength();
		String input[]= {"Ashish","Aditty","Manjiri","Ankita","Credits"};
		System.out.println("Maximum length : "+maxlength.maxLength(input));
	}
}
