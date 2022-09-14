
/****
 * Test 4 - 11th Sep'2022

Expected time : 15 mins
Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0

Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4              
 * ***/

package mohiniA;
import java.util.Arrays;

public class ArrayOprationTest4 {

	int[] sumOfDigitinString(String[] name) {
		int[] Outsum = new int[name.length];
		for (int index = 0; index < name.length; index++) {
			String str = name[index];
			int sum = 0;
			for (int x = 0; x < str.length(); x++) {
				if (Character.isDigit(str.charAt(x)))
				sum += Character.getNumericValue(str.charAt(x));
			}
			Outsum[index] = sum;
		}
		return Outsum;
	}
	
	int countVisibleTree(int[] num) {
		int count=0;
		int temp=0;
		for(int i=0;i<num.length;i++) {
			
			if(num[i]>temp) {
				count++;
				temp=num[i];
			} 
			
		}
		return count;
	}
	

	public static void main(String[] args) {

		String[] str = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		 int[] tree={3,7,5};
		 int[] tree1={3,5,11,9,10,13};
		int[] outsum;

		outsum = new ArrayOprationTest4().sumOfDigitinString(str);
		for (int index = 0; index < str.length; index++)
			System.out.println("[" + str[index] + "]  --> [" + outsum[index] + "]");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Given array of height of trees: " + Arrays.toString(tree));
		System.out.println("Visible Tree count out of array " +new ArrayOprationTest4().countVisibleTree(tree));
		System.out.println("Given array of height of trees: " + Arrays.toString(tree1));
		System.out.println("Visible Tree count out of array " +new ArrayOprationTest4().countVisibleTree(tree1));

	}
}
