package deepakBorse.Practice;

import java.util.Arrays;

public class ArrayExample {

	void getinfostrg() {
		String[] name = { "Deepak", "Sapana", "Haaresh", "Harsheel" };
		System.out.println("Size of the Array :" + (name.length));
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
	
	void addArray(int[] arry) {
		int sum=0;
		//System.out.println("Size of the Array :" + (arry.length));
		for(int i=0;i<arry.length;i++){
			sum=sum+arry[i];
			
		}
		System.out.println("Sum of Array :"+sum);
		System.out.println(Arrays.toString(arry));
		maxArray(arry);
		
	}
	
	void maxArray(int[] arry) {
		int max=0;
		//System.out.println("Size of the Array :" + (arry.length));
		for(int i=0;i<arry.length;i++){
			if( max<arry[i]) {
				max=arry[i];
			}
			
		}
		System.out.println("Max no from Array :"+max);
	}

	public static void main(String[] args) {
		ArrayExample ArrayExample=new ArrayExample();
		ArrayExample.getinfostrg();
		
		int[] array= {10,20,28,18};
		ArrayExample.addArray(array);
		//ArrayExample.maxArray(array);
	}
}
