/*
 Assignment - 38 : 14th Oct'2022
Program 1 : Replace all Deepak with Shivani.
input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 
Hint : use set, indexOf, contains
Program 2: Increase student marks by 10 if marks is less than 35.
input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]
Program 3 : Return list of Middle character from given name if length of the name is more than 6 characters.
input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']
Program 4 : Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.
input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"] 
 */

package hemanshi;
import java.util.ArrayList;
import java.util.Arrays;


public class Assignment_38 {
	
	void replaceName(ArrayList<String> listOfNames) {
		     while(listOfNames.contains("Deepak")) {
		    	 int index = listOfNames.indexOf("Deepak");
		    	 listOfNames.set(index, "Shivani");
		     }
		     System.out.println("Output : "+listOfNames);
	}
	
	void increaseMarks(ArrayList<Integer> marks) {
		for(int num: marks) {
			if(num<35) {
				int index = marks.indexOf(num);// to extract index of that num
				num = num + 10;// to increase value of num by 10
				marks.set(index, num); //to set the changed value of num at current index
			}
		}
		System.out.println("Output : "+ marks);
	}

	ArrayList<Character> getMiddleChar(ArrayList<String> listOfNames){
		   char ch = ' ';
		   ArrayList<Character> middleChar = new ArrayList<Character>();
		   for(String name : listOfNames) {
			   int length = name.length();
			   if(length>6) {
			   if(length%2==0) {
				   ch = name.charAt((length/2)-1);
			   }
			   else { //if length is odd
                         ch = name.charAt(length/2);       
			   }
			   middleChar.add(ch);
	      }
      }
	return middleChar;
}

 boolean isNameStartVowel(String name) {
	 boolean flag = false;
	 char ch = name.charAt(0);
	 if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {// to check vowel
			flag = true;
		}
		return flag;
	}
 
 boolean isNameHas1UpperCase(String name) {
		int count = 0;
		boolean flag = false;
		for(int index=0; index<name.length(); index++) {
			char ch =  name.charAt(index);
			if(Character.isUpperCase(ch)) {//to check name has upper case then increase count
				count++; 
			}
		}
		if(count==1) {
			flag = true; //if count is exactly 1 then flag is true
		}
		return flag;
	}

	ArrayList<String> getRequiredName(ArrayList<String> listOfNames) {
		ArrayList<String> output = new ArrayList<String> ();
		for(String name : listOfNames) {
			if(isNameStartVowel(name) && isNameHasDigit(name) && isNameHas1UpperCase(name))  {
				output.add(name); //if name satisfies all above condition  then add name in output ArrayList
			}
		}
		return output;
	}
	
 private boolean isNameHasDigit(String name) {
		// TODO Auto-generated method stub
		return false;
	}

public static void main(String[] args) {
		Assignment_38 assignment_38 = new Assignment_38();

		System.out.println("#________________#______________________#");
		System.out.println("Program 1 : Replace all Deepak with Shivani.");
		String[] input1 = {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		ArrayList<String> listOfNames = new ArrayList<String> (Arrays.asList(input1));
		System.out.println("Input : "+listOfNames);
		assignment_38.replaceName(listOfNames);
		System.out.println("");

		System.out.println("#________________#______________________#");
		System.out.println("Program 2: Increse student marks by 10 if marks is less than 35.");
	    Integer [] input2 = {23,55,34,88,58,81};
	    ArrayList<Integer> marks = new ArrayList<Integer> (Arrays.asList(input2));
	    assignment_38.increaseMarks(marks);
		System.out.println("");

		System.out.println("#________________#______________________#");
		System.out.println("Program 3 : Return list of Middle character from given name if length of the name is more than 6 characters.");
		String[] input3 = {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		ArrayList<String> names = new ArrayList<String> (Arrays.asList(input3));
		System.out.println("Input : " + names);
		System.out.println("Output : " + assignment_38.getMiddleChar(names));
		System.out.println("");


		System.out.println("#________________#______________________#");
		System.out.println("Program 4 : Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.");
		String[] input4 = {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"};
		ArrayList<String> listOfNames2 = new ArrayList<String> (Arrays.asList(input4));
		System.out.println("Input : " + listOfNames2);
		System.out.println("Output : " + assignment_38.getRequiredName(listOfNames2));
		System.out.println("");
	}

}
