//Middle character of each element.
//{"Mahesh", "Avni","Puja","Aditty","Rahul"}

package shridharKumbhar.Assignment11_20;

import java.util.Arrays;

public class Test_3_P2 {
	
	char getMiddleCh(String name) {
		
		char ch ;
		
		if (name.length() % 2 ==0) {
			ch = name.charAt(name.length()/2 - 1);
		}else
			ch = name.charAt(name.length()/2 );
		
		return ch;
	}
	
	void printValue(String[] arr) {
		
		for (int index=0;arr.length>index; index++) {
			char ch = getMiddleCh(arr[index]);
			System.out.println(arr[index] + " -> " + ch);
		}
	}
	
	public static void main(String[] args) {
		String[] input = {"Mahesh", "Avni","Puja","Aditty","Rahul"};
		Test_3_P2 test = new Test_3_P2();
		System.out.println("Middle character of each element");
		System.out.println(Arrays.toString(input));
		System.out.println("");
		test.printValue(input);
	}
}
