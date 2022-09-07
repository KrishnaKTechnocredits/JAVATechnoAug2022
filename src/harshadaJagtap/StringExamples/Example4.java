//Program 2 : Write a method to return even position characters from given String. 
//input : technocredits
//output : ehordt

package harshadaJagtap.return_type;

public class Example4 {
	
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
		Example4 example4=new Example4();
		String x=example4.getEvenChar("technocredits");
		System.out.print(x);
	}

}
