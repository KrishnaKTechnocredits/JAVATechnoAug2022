/*
 * Test - 3 : 10th Sep'2022

Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c

Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output :      Mahesh -> h
              Avni -> v
              Puja -> u
              Harshal -> s
              Aditty -> i
              Rahul -> h
 */
package deepakBorse.Assignments;

public class Test3_midcharMaxlen {

	char maxchaMaxlen(String[] namearry) {
		int maxlen = namearry[0].length();
		String maxlenname = namearry[0];
		int index1 = 0;

		for (int i = 1; i < namearry.length; i++) {
			if (maxlen < namearry[i].length()) {
				maxlenname = namearry[i];
			}
		}
		System.out.println("String which having maximum length from array: " + maxlenname);
		if (maxlenname.length() % 2 == 0) {
			index1 = maxlenname.length() / 2 - 1;
		} else {
			index1 = maxlenname.length() / 2;
		}
		char ch = maxlenname.charAt(index1);
		return ch;

	}

	char[] getMiddleCharFromName(String[] inputarray) {
		char[] ch = new char[inputarray.length];
		int j;
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i].length() % 2 == 0) {
				j = inputarray[i].length() / 2 - 1;
			} else {
				j = inputarray[i].length() / 2;
			}
			ch[i] = inputarray[i].charAt(j);
			// System.out.println(inputarray[i]+"->"+ch[i]);
		}
		return ch;
	}

	public static void main(String[] args) {
		Test3_midcharMaxlen Test3_midcharMaxlen = new Test3_midcharMaxlen();
		
		String[] namearry = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		char midchar = Test3_midcharMaxlen.maxchaMaxlen(namearry);
		System.out.println("Middle charater of max length string :" + midchar);

		String[] namearray = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char[] midallstr = Test3_midcharMaxlen.getMiddleCharFromName(namearray);
		System.out.println("Middle character of below strings is as follows: ");
		for (int i = 0; i < namearray.length; i++) {
			System.out.println(namearray[i] + " -> " + midallstr[i]);
		}

	}

}
