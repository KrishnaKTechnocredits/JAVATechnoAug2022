package gauravSahu;

public class Array1 {

	String[] arr2 = { "Gaurav", "Garvis", "Grand", "Scala" };

	int sum(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			sum = sum + num[index];
		}
		return sum;
	}

	boolean isprime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
		}
		return flag;
	}

	int sumofprime(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			boolean flag = isprime(num[index]);
			if (flag) {
				System.out.println("Prime number of given array is " + num[index]);
				sum = sum + num[index];
			}
		}
		return sum;
	}
	
	int max(int[] num) {
		int max=num[0];
		for(int index=0;index<num.length;index++) {
			if(max<num[index]) {
				max = num[index];
			}
		}return max;
	}
	
	int min(int[] num) {
		int min=num[0];
		for(int index=0;index<num.length;index++) {
			if(min>num[index]) {
				min = num[index];
			}
		}return min;
	}
	
	char getMidddleChar(String name) {
		int length = name.length();
		int index = 0;
		if (index % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		// char ch = name.charAt(index);
		return name.charAt(index);
	}
	
	void getMiddle(String[] name) {
		for(int index=0;index<name.length;index++) {
			char ch = getMidddleChar(name[index]);
			System.out.println("Middle character of " + name[index] + " => " + ch);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int addition = new Array1().sum(arr);
		System.out.println(addition);
		int[] arr2 = { 11, 14, 17, 22, 44 };
		int sumofprime = new Array1().sumofprime(arr2);
		System.out.println("Sum of prime number is " + sumofprime);
		int[] arr3 =  {11,4,55,23,43};
		int max = new Array1().max(arr3);
		System.out.println("Maximum number of given array is " + max);
		int min = new Array1().min(arr3);
		System.out.println("Min number of given array is " + min);
		String[] name = {"Ashish","Aditty","Manjiri","Ankita"};
		new Array1().getMiddle(name);
		
	}
}

//in array length is a property of an array but in String length() is a method.
//arr[index] this is also a property
//sop(arr); It will print memory address (arr.length)
//sop(arr[0]); It is an integer 
//
