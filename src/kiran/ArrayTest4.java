package kiran;

/*Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0*/
import java.util.Arrays;

public class ArrayTest4 {
	
	void getSumOfArrayDigits(String[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"  "+getDigitCount(arr[i]));	
		}
	}
	
	int getDigitCount(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				//System.out.println("digit is"+str.charAt(i));
				sum=sum+Character.getNumericValue(str.charAt(i));
			}
		}return sum;
	}
	
	/*Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

			input : {3,7,5}
			output : 2

			input : {3,5,11,9,10,13}
			output : 4*/
	
	int getVisibleTreecount(int[] arr){
		int count=0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		ArrayTest4 obj=new ArrayTest4();
		//System.out.println(obj.getDigitCount("kir4ran5"));
		String[] a1=new String[] {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		System.out.println(Arrays.toString(a1));
		obj.getSumOfArrayDigits(a1);
		
		int[] a2=new int[] {3,5,11,9,10,13};
		System.out.println("\n"+Arrays.toString(a2));
		System.out.println("Visible tree count is : "+obj.getVisibleTreecount(a2));
	}

}
