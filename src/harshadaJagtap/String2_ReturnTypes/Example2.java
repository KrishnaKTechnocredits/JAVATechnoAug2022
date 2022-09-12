//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c

package harshadaJagtap.String2_ReturnTypes;

public class Example2 {
	int a;
	
	char getMiddlechar(String name) {
		 if(name.length()%2==0)
			 a=name.length()/2-1;
		 else
			 a=name.length()/2;
		 
		 return name.charAt(a);
	}
	
	public static void main(String[] args) {
		Example2 example2=new Example2();
		System.out.println(example2.getMiddlechar("Maulik"));
		System.out.println(example2.getMiddlechar("Technocredits"));
		System.out.println(example2.getMiddlechar("Harshada"));
	}
}
