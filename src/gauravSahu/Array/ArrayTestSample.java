
package gauravSahu.Array;

import java.util.Arrays;

public class ArrayTestSample {

	int[] getinteger(String[] name) {
		int[] output= new int[name.length];
		
		for(int index=0;index<name.length;index++) {
			output[index] = getintegersum(name[index]);
		}return output;
	}
	
	int getintegersum(String name){
		int sum = 0;
		for(int index=0;index<name.length();index++) {
			int ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}return sum;
	}
	
	void display(String [] name) {
		int[] result = getinteger(name);
		
		System.out.println(Arrays.toString(name)+Arrays.toString(result));	
	}
	
	public static void main(String[] args) {
		ArrayTestSample a1 = new ArrayTestSample();
		String[] name = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		a1.display(name);
	}
}

	
