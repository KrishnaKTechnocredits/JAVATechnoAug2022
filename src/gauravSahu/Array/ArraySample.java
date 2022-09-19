package gauravSahu.Array;

import java.util.Arrays;

public class ArraySample {

	int getmax(int[] name){
		int maxlength = name[0];
		int count = 1 ;
		
		for(int index=0;index<name.length;index++) {
			if(maxlength<name[index]) {
				maxlength = name[index];
				count++;
			}	
		}return count;
	}
	
	public static void main(String[] args) {
		ArraySample a1 = new ArraySample();
		int[] name = {3,5,11,9,10,13};
		int[] name2 = {3,7,5};
		int result = a1.getmax(name);
		System.out.println( Arrays.toString(name) + "   " + result);
		int result2 = a1.getmax(name2);
		System.out.println( Arrays.toString(name2) + "   " + result2);
	}
}
