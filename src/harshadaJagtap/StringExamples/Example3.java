//Program 1 : Write a method to return reverse name
//input : Maulik
//output : kiluaM


package harshadaJagtap.return_type;

public class Example3 {
	
	String getReverseString(String name) {
		String str="";
		for(int index=name.length()-1;index>=0;index--) {
			str=str+name.charAt(index);
		}
		return str;
	}
	
	public static void main(String[] args) {
		Example3 example3=new Example3();
		String reversString=example3.getReverseString("Maulik");	
		System.out.println(reversString);
	}
	
}
