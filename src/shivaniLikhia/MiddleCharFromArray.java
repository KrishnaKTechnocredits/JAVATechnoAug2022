/*Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
            Avni -> v
             Puja -> u
            Harshal -> s
             Aditty -> i
             Rahul -> h*/

package shivaniLikhia;

public class MiddleCharFromArray {

	char[] getMiddleCharFromArray(String[] arr) {
		char[] output = new char[arr.length];
		char ch;
		for(int index=0;index<arr.length;index++) {
			String name = arr[index];
			if(name.length()%2==0) {
				ch = name.charAt(name.length()/2-1);
			}
			else {
				ch = name.charAt(name.length()/2);
			}
			output[index] = ch;
		}
		return output;
	}
	
	public static void main(String[] args) {
		MiddleCharFromArray middleCharFromArray = new MiddleCharFromArray();
		String[] input = {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		char[] output = middleCharFromArray.getMiddleCharFromArray(input);
		
		for(int index=0;index<input.length;index++) {
			System.out.println(input[index] + "-->" + output[index]);
		}
	}
}
