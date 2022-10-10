/*Program 3 : 
WAP to print ascii value of A->Z.

output : A -> 65
         B -> 66
		 .
		 .
		 Z -> 90*/
package gauravSahu;

public class Assignment36C {
	
	void getAsciiValue() {
		for(int i= 65 ; i<=90;i++) {
			char ch = (char)i;
			System.out.println(ch + "-->" + i);
		}	
	}

	public static void main(String[] args) {
		Assignment36C a36 = new Assignment36C();
		a36.getAsciiValue();
	}
}
