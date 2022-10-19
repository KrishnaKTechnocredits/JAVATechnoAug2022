package vinod.Assignment;

import java.util.Arrays;

public class Assignment32A {
	
	int cube ;
	void getArmNum(int num) {
		int tempNum= num;
		int remain = 0;
		while(num>0) {
			
			remain = num%10;
			num = num/10;
			cube = cube + (remain*remain*remain);
		}
		if(cube==tempNum) {
			System.out.println("It is an armstrong num : "+ tempNum);
		}else {
			System.out.println("It is not an armstrong num : "+ tempNum);
		}
	}
	
	public static void main(String[] args) {
		Assignment32A assignment32A = new Assignment32A();
		int[] arr = {153,123};
		System.out.println("Given array is : " + Arrays.toString(arr));
		for(int num : arr) {
			assignment32A.getArmNum(num);
		}
	}
}