
/**Assignment - 19 : 9th Sep'2022

1) Write a method to return sum of all numbers in given array.
input : {10,11,15}
output : 36

2) Write a method to return sum of all prime numbers from given array.
input : {11,14,17,22,44}
output : 28
Hint : (11+17 = 28)

3) Write a method to return max number from array.
input : {11,4,55,23,43}
output : 55

4) Write a method to return min number from array.
input : {11,4,55,23,43}
output : 4

5) Write a method to print middle character of all array elements.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> h
         Aditty -> i
		 Manjiri -> j
		 Ankita -> k
—--------------------------------------------------------------
**/

package mohiniA.StringArray.Assign17_18_19;

public class ArrayOpration19 {

	int sumArrayElement(int[] num) {
		int sum = 0;
		System.out.println("Array");
		for (int index = 0; index < num.length; index++) {
			sum += num[index];
			System.out.println("["+num[index]+"]");
		}
		return sum;
	}
	
	int sumPrimeArray(int[] num) {
		int sum = 0;
		System.out.println("Array");
		for (int index = 0; index < num.length; index++) {
			boolean flag = true;
			System.out.println("["+num[index]+"]");
			for (int x = 2; x < num[index] / 2; x++) {
				if (num[index] % x == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				sum += num[index];
		}
		return sum;
	}

	int maxArrayElement(int[] num) {
		int flag = num[0];
		System.out.println("Array");
		for (int index = 0; index < num.length; index++) {
			System.out.println("["+num[index]+"]");
			if (flag <= num[index])
				flag = num[index];
		}
		return flag;
	}

	int minArrayElement(int[] num) {
		int flag = num[0];
		System.out.println("Array");
		for (int index = 0; index < num.length; index++) {
			System.out.println("["+num[index]+"]");
			if (flag >= num[index])
				flag = num[index];
		}
		return flag;
	}

	void displayMidCharOfStringElemntsOfArray(String[] str) {
		int x = 0;
		System.out.println("Array");
		for (int index = 0; index < str.length; index++) {
			if (str[index].length() % 2 == 0)
				x = 1;
			else
				x = 0;
			System.out.println("[" + str[index] + "]    : " + str[index].charAt((str[index].length() / 2) - x));
		}

	}

	public static void main(String[] args) {
		int[] num = { 10, 11, 15 };
		int[] num1 = { 11, 14, 17, 22, 44 };
		int[] num2 = { 11, 4, 55, 23, 43 };
		int[] num3 = { 11, 4, 55, 23, 43 };
		String[] str = { "Ashish", "Aditty", "Manjiri", "Ankita" };

		System.out.println("SUM is : " + new ArrayOpration19().sumArrayElement(num));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("SUM of Prime numbers is : " + new ArrayOpration19().sumPrimeArray(num1));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("MAX is : " + new ArrayOpration19().maxArrayElement(num2));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("MIN is : " + new ArrayOpration19().minArrayElement(num3));
		System.out.println("----------------------------------------------------------------------");
		new ArrayOpration19().displayMidCharOfStringElemntsOfArray(str);
		System.out.println("----------------------------------------------------------------------");

	}

}
