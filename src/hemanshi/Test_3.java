/*Test - 3 : 10th Sep'2022
Program 1 : (20 mins)
Return middle character of max length String from given array. 
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c
Program 2: (40 mins)
Write a method to return middle character of each elements from given array. 
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h Avni -> v Harshal -> s Aditty -> i Rahul -> h
2nd problem : char[] getMiddleCharFromName(String[] arr){ }
char[] ch = new char[arr.length];
sop(input[0] + "->" + output[0])
sop(input[index] + "->" + output[index])*/


package hemanshi;

public class Test_3 {
	
	char getMiddleChar(String input) {
		char ch =' ';
		int length = input.length();
		if (length%2==0) {
			ch = input.charAt((length/2)-1);
		}
		else {
			ch = input.charAt(length/2);
		}
		return ch;
	}

	char getMaxLengthStringChar(String[] name) {
		int maxLength = name[0].length();
		int nameIndex = 0;
		char middleChar=' ';
		for(int index=0; index<name.length; index++) {
			if(maxLength<name[index].length()) {
				maxLength=name[index].length();
				nameIndex = index;
			}
		}
		middleChar = getMiddleChar(name[nameIndex]);
		return middleChar;
	}	

	char[] getMiddleCharFromName(String[] input) {
		char[] middleChar= new char[input.length];
		for(int index=0; index<input.length; index++) {
			middleChar[index] = getMiddleChar(input[index]);
		}
		return middleChar;
	}

	void printInfo(String[] input) {
		System.out.println("Middle character of max length String from given array is : "+getMaxLengthStringChar(input));
		System.out.println("Middle character of each elements from given array are :");
		char[] ch = getMiddleCharFromName(input); 
		for(int index=0; index<input.length; index++) {
			System.out.println(input[index]+ " -> " + ch[index]);
		}
	}

	public static void main(String[] args) {
		Test_3 test3 = new Test_3();
		String[] input = {"Mahesh","Avni","Puja","Technocredits","Harshal","Aditty","Rahul"};
		test3.printInfo(input);
	}
	

}
