package gauravSahu.Array;

import java.util.Arrays;

public class ArrayWork {
	
	int[] getinteger(String[] name) {
		int[] result = new int[name.length];
		
		for(int index=0;index<name.length;index++) {
			result[index]= getintegersum(name[index]);
		}
	return result;	
	}
	
	int getintegersum(String name) {
	int count = 0;
	int sum = 0;
	 for(int index=0;index<name.length();index++) {
		int ch= name.charAt(index);
		if(Character.isDigit(ch)) {
			sum = sum + Character.getNumericValue(ch);
			count++;
		} 
	 }return count;
	}
	
	public static void main(String[] args) {
		ArrayWork a1 = new ArrayWork();
		String[] name = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		int[] output = a1.getinteger(name);
		System.out.println(Arrays.toString(output));
	}
}
