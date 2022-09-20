//A program to print odd places alphabet of your name in reverse order

package akankshaVyas.Interview;

public class Interview1 {

	String getReverseString(String str){
		String str1="";
		for(int index=str.length()-1;index>=0;index--) {
			str1 = str1+str.charAt(index);
		}return str1;
		
	}
	
	void getoddString(String str) {
		String str2= getReverseString(str);
		String str3="";
		for(int index=1; index <= str.length()-1;index=index+2) {
			str3= str3 + str2.charAt(index);
			
		}
		System.out.println("The reverse string with odd place is - " + str3);
	}

	public static void main(String[] args) {
		String name ="Akanksha";
		System.out.println("Given string is " + name + " and output reverse string is -\"" + new Interview1().getReverseString(name) + "\"");
		new Interview1().getoddString("Akanksha");
	}
}
