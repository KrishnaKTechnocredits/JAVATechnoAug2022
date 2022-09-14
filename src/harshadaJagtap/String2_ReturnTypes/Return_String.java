// 1. write a method to return length of the given name
// int getNameLength(String name)

package harshadaJagtap.String2_ReturnTypes;

public class Return_String {
	int a;
	int getNameLenght(String name) {
		a=name.length();
		return a;
	}
	
	public static void main(String[] args) {
		Return_String return_String=new Return_String();
		return_String.getNameLenght("Harshada");
		System.out.println("lenght of given name is "+ return_String.a);
	}
	
}
