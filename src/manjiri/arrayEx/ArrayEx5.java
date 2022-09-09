/*Write a method to print middle character of all array elements.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> h
         Aditty -> i
         Manjiri -> j
         Ankita -> k*/

package manjiri.arrayEx;

public class ArrayEx5 {
	void printMiddleChar(String[] names) {
		char ch;
		for(int index = 0; index<names.length;index++) {
			ch = getMiddleChar(names[index]);	
			System.out.println(names[index]+" "+"contains middle character as "+ch);
		}	
	}
	
	char getMiddleChar(String name) {
		if(name.length() % 2 == 0) {
			return name.charAt(name.length()/2-1);
		}
		else {
			return name.charAt(name.length()/2);
		}		
	}
	
	public static void main(String[] args) {
		String[] stringArr = {"Ashish","Aditty","Manjiri","Ankita"};
		new ArrayEx5().printMiddleChar(stringArr);
	}
}
