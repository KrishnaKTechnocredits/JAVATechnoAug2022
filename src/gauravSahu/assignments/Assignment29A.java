package gauravSahu.assignments;

import java.util.Arrays;

public class Assignment29A {
	
	
	int[] getInt(int[] num) {
		int numpositive = 0;
		int[] num2 = new int[num.length];
		for(int index=0; index<num.length;index++) {
			if(num[index]!=0) {
				num2[numpositive] = num[index];
				numpositive++; 
			}
		}return num2;
	}
	
	public static void main(String[] args) {
		Assignment29A a29 = new Assignment29A();
		int[] arr = { 10, 0, 0, 3, 4, 5, 0, 9 };
		int[] num = a29.getInt(arr);
		System.out.println("Input array : " + Arrays.toString(arr));
		System.out.println("Output array : " + Arrays.toString(num));
	}

}
