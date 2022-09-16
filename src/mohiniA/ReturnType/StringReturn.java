/******Assignment - 16 :06092022*******/

/*****To print the length and Middle character of given string*****/

package mohiniA.ReturnType;

public class StringReturn {
	
	static String nm;
	
	int getStringLength(String name) {
		int length = name.length();
		return (length);		
			
	}
	
	
	
	public static void main(String[] args) {
		
		int ln=new StringReturn().getStringLength("Mohini");
		System.out.println("Length os name Mohini is :" +ln);
		
		/******************Another way to print same using Static********************/
		
		nm="Mohini";
		System.out.println("Length os name "+nm+" is :" +nm.length());
		
		/***********Return Middle Character of the given String *************************/
		
		nm="Technocredits";
		int x;
		if(nm.length()%2==0)
			x=1;
		else
			x=0;
		System.out.println("Middle letter of "+nm+" is :" + nm.charAt(nm.length()/2-x));
		
		/*************************/
		
		
		
	}

}
