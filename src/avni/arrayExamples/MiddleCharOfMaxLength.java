/*return middle char of max length from given array.
 * input {krishna , maulik , aashvi , technocredits , harsh} output :c .*/ 
package avni.arrayExamples;

public class MiddleCharOfMaxLength {

	char getMiddleChar(String str) {
		if(str.length() % 2 != 0)
			return str.charAt(str.length()/2);
		else 
			return str.charAt(str.length()/2 -1);
	}
	
	void printMiddleChar(String[] name) {
		String maxName = " ";
		for (int i = 0; i< name.length; i++) {
			if(maxName.length()<name[i].length())
				maxName = name[i];
	    }
		char ch = getMiddleChar(maxName);
		System.out.println("----" + maxName + " middle character:" + ch);
	}
	
	char[] printMiddleCharOfNames(String[] name) {
		int length = name.length;
		char[] midchar = new char[length];
		for (int i = 0 ; i< length ; i++) {
			midchar[i] = getMiddleChar(name[i]);
		}
		return midchar ;
		}
	
	public static void main (String[] args) {
		MiddleCharOfMaxLength midcharr = new MiddleCharOfMaxLength();
		
		String[] str = {"Krishna" , "Maulik" , "Aashvi" , "Technocredits" , "harsh"};
		midcharr.printMiddleChar(str);
		
		String[] names = {"Mahesh" ,"Avani" ,"puja" , "Harshal" , "Aditty" , "Rahul"};
		char[] ch =  midcharr.printMiddleCharOfNames(names);
		for(int i = 0 ; i<ch.length; i++) {
			System.out.println("----" + names[i] + "----" + ch[i]);
		}
	}
}

