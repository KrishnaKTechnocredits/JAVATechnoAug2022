package technocredits.collectionsdemo.advance;

public class Example1 {

	// Sagar // Sagar
	int m1(String str1, String str2) {
		int len = str1.length() >= str2.length() ? 
					str2.length() : str1.length();
		
		for(int index=0;index<len;index++) {
			int ascii1 = str1.charAt(index);
			int ascii2 = str2.charAt(index);
			
			if(ascii1 != ascii2)
				return ascii1 - ascii2;
		}
		if(str1.length() != str2.length()) {
			return str1.length() - str2.length();
		}
		return 0;
	}

	public static void main(String[] args) {
		Example1 ex1 = new Example1();
		int diff = ex1.m1("Saroj", "Sarojabc");
		System.out.println(diff); // -3
		diff = ex1.m1("Sarojabc", "Saroj"); 
		System.out.println(diff);//3
		diff = ex1.m1("Saroj", "Saroj"); 
		System.out.println(diff);//0
		diff = ex1.m1("Sagar", "Saroj"); 
		System.out.println(diff);//-11
		diff = ex1.m1("Saroj","Sagar"); 
		System.out.println(diff);//11
	}
}
