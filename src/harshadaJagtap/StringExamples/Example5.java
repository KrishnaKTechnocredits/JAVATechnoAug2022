//Program 3 : Write a method to return even position characters from given String in reverse.
//input : technocredits
//output : tdrohe

package harshadaJagtap.StringExamples;

public class Example5 {
	
	String getReverseString(String name) {
		String str="";
		for(int index=name.length()-1;index>=0;index--) {
			str=str+name.charAt(index);
		}
		return str;
	}
	
	String getEvenChar(String name) {
		String str="";
		int lenght=name.length();
		for(int index=0;index<lenght;index++) {
		if(index%2!=0)
			str=str+name.charAt(index);
		}
		return str;
	}
	
	public static void main(String[] args) {
		Example5 example5=new Example5();
		String evenChar=example5.getEvenChar("technocredits");
		String reverseString=example5.getReverseString(evenChar);
		System.out.println(reverseString);
	}
}
