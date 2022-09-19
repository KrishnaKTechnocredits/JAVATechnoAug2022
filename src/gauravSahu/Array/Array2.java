package gauravSahu.Array;

import java.util.Arrays;

public class Array2 {
	
	static void element(String[] name, int[] name2) {
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(name2));
	}
	
	public static void main(String[] args) {
		String[] arr2 = { "Gaurav", "Garvis", "Grand", "Scala" };
		int[] arr1 = { 11, 14, 17, 22, 44 };
		Array2.element(arr2, arr1 );
	}

}
