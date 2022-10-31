/*
 Assignment 40 : 16th Oct'2022
Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2
Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]
Hint : removeAll
Program 3 : Return a reverse String [Method : inplace reverse].
Program 4 : Return a reverse String [Use : StringBuilder].
Program 5 : WAP to find frequence of each character using Map.
input : technocredits
output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
          r --> 1
		  c --> 2
          s --> 1
          t --> 2
          ..... so on		  
Program 6 : WAP to find frequence of each word in a given String using Map.
input : "Hi Hello Techno Techno Hi"
output : Hi -> 2
         Hello -> 1
		 Techno -> 2
Program 7 : WAP to find frequence of each word in a given String using Map.
input : {10,2,5,2,3,3,3,10,11,8,8,8};
output : 2 -> 2
         3 -> 3
         5 -> 1
         8 -> 3
         10 -> 2
         11 -> 1  
 
 */

package hemanshi;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Set;

public class Assignment_40 {

	//Program 1 : Find frequency of each number using array and single while loop.
	
     void printFreq(Integer[] numArray) {
    	 ArrayList<Integer> listOfNums = new ArrayList<Integer>(Arrays.asList(numArray));
    	 int beforeSize=0, afterSize=0, num=0;
    	 ArrayList<Integer> removeList = new ArrayList<Integer>();
    	 
    	 while(listOfNums.size()>0){ //iterate till the size of input list is 0
 	 		num = listOfNums.get(0); //get the 1st num from the list
 	 		beforeSize =  listOfNums.size(); // calculate the size before removal
 	 		removeList.add(num); // add the 1st num in remove list
 	 		listOfNums.removeAll(removeList); // remove all nums common in input list and removelist
 	 		afterSize = listOfNums.size(); // calculate size after removal
 	 		System.out.println(num + " --> " + (beforeSize - afterSize));	//diff betn before and after size is the freq of num
 	 		removeList.clear();
    	 }
     }
    	 
    	 void printMissing(Integer[] numArray, int start, int end) {//program2
    			ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(numArray));
    			ArrayList<Integer> missingNum = new ArrayList<Integer>();

    			for(int num=start; num<=end; num++) { //iterate in the given range
    				missingNum.add(num); //add all nums in given range
    				/*//using contains
    				 if(!input.contains(num)){ //if input list doesnt contain the num then add in the missngNum list
    					missingNum.add(num);
    				}*/
    			}
	
	     }
    	 

     String printReverseStringImplace(String input) { //program3
	 for(int i =0,j=input.length()-1; i<j ;i++,j-- ) {
		char ch1 = input.charAt(i);
		char ch2 = input.charAt(j);

		if(i==0) {
			input = ch2 + input.substring(i+1,j) + ch1;
		}
		else {
			input = input.substring(0,i) + ch2 + input.substring(i+1,j) + ch1 + input.substring(j+1);
		     }
	     }
	   return input;
   }

    String printReverseStringBuilder(String word) { //program4
	return new StringBuilder(word).reverse().toString();
   }

       void printFreqCharMap(String name) { //program5
	   Map<Character,Integer> mapOfFreq = new HashMap<Character,Integer>();//doesnt maintains insertion order

	    for(int index=0; index<name.length(); index++) { //traverse through all chars in string
		Character ch = name.charAt(index); //get char at current index
		if(mapOfFreq.containsKey(ch)) { // if map already  contains char in key then replace count with prev freq+1 (.get(ch)+1)
			mapOfFreq.put(ch, mapOfFreq.get(ch)+1);
		}
		else {
			mapOfFreq.put(ch, 1); // if map doesnt  already contains char in key then add char in map with freq =1
		}
	}

	//to print output in given format
	Set<Character> setOfKeys = mapOfFreq.keySet(); // create set of keys
	for(Character ch : setOfKeys) { //iterate through all chars in set
	 	System.out.println(ch + " --> " + mapOfFreq.get(ch));	// print current char and its freq from map
	  }
    } 

    void printFreqWordMap(String sentence) {//program6
	String[] input = sentence.split(" "); //Split the string in array of words
	String word = "";
	Map<String,Integer> mapOfFreq = new LinkedHashMap<String,Integer>(); //maintains insertion order

	for(int index=0; index<input.length; index++) { //traverse through all words in string array
		word = input[index]; //get word at current index
		if(mapOfFreq.containsKey(word)) {  // if map already contains word in key then replace count with prev freq+1 (.get(word)+1)
			mapOfFreq.put(word, mapOfFreq.get(word)+1); 
		}
		else {
			mapOfFreq.put(word, 1); // if map doesnt already contains word in key then add word in map with freq =1
		}
	}

	//to print output in given format
	Set<String> setOfKeys = mapOfFreq.keySet(); // create set of keys
	for(String wordKey : setOfKeys) {  //iterate through all words in set
		System.out.println(wordKey + " --> " + mapOfFreq.get(wordKey)); // print current word and its freq from map
	    }
    }

    void printFreqNumMap(Integer[] numArray) { //program7
	Map<Integer,Integer> mapOfFreq = new TreeMap<Integer,Integer>(); //maintains natural/ascending order
	int num = 0;

	for(int index=0; index<numArray.length; index++) { //traverse through all nums in num array
		num =  numArray[index]; //get num at current index
		if(mapOfFreq.containsKey(num)) {// if map already contains word in key then replace count with prev freq+1 (.get(num)+1)
			mapOfFreq.put(num, mapOfFreq.get(num)+1);
		}
		else {
			mapOfFreq.put(num, 1);// if map doesnt already contains num in key then add num in map with freq =1
		}
	}

	//to print output in given format
	  Set<Integer> setOfKeys= mapOfFreq.keySet(); // create set of keys
	  for(int key : setOfKeys) {  //iterate through all words in set
		System.out.println(key + " --> " + mapOfFreq.get(key)); // print current word and its freq from map
	    }
    }

public static void main(String[] args) {
	Assignment_40 assignment_40 = new Assignment_40();

 	System.out.println("*********************************");
 	System.out.println("Program 1 : Find frequency of each number using array and single while loop.");
 	Integer[] input1 = {3,5,33,3,55,3,11,11};
 	System.out.println("Input : " + Arrays.toString(input1));
 	System.out.println("Output : " );
 	assignment_40.printFreq(input1);
 	System.out.println("");

 	System.out.println("**********************************");
 	System.out.println("Program 2 : Find missing numbers from give array from 50 to 60.");
 	Integer[] input2 = {60,54,51,57};
 	System.out.println("Input : " + Arrays.toString(input2));
 	System.out.print("Output : " );
 	assignment_40.printMissing(input2,50,60);
 	System.out.println("");

 	System.out.println("**********************************");
 	System.out.println("Program 3 : Return a reverse String [Method : inplace reverse].");
 	String input3  = "technocredits";
 	System.out.println("Input : " + input3);
 	System.out.print("Output : " + assignment_40.printReverseStringImplace(input3));
 	System.out.println("");

 	System.out.println("**********************************");
 	System.out.println("Program 4 : Return a reverse String [Use : StringBuilder].");
 	String input4  = "technocredits";
 	System.out.println("Input : " + input4);
 	System.out.print("Output : " + assignment_40.printReverseStringBuilder(input4));
 	System.out.println("");

 	System.out.println("**********************************");
 	System.out.println("Program 5 : WAP to find frequency of each character using Map.");
 	String input5 = "technocredits";
 	System.out.println("Input : " + input5);
 	System.out.println("Output : " );
 	assignment_40.printFreqCharMap(input5);
 	System.out.println("");

 	System.out.println("**********************************");
 	System.out.println("Program 6 : WAP to find frequency of each word in a given String using Map.");
 	String input6 = "Hi Hello Techno Techno Hi";
 	System.out.println("Input : " + input6);
 	System.out.println("Output : " );
 	assignment_40.printFreqWordMap(input6);
 	System.out.println("");

	System.out.println("**********************************");
 	System.out.println("Program 7 : WAP to find frequency of each word in a given String using Map.");
 	Integer[] input7 = {10,2,5,2,3,3,3,10,11,8,8,8};
 	System.out.println("Input : " + Arrays.toString(input7));
 	System.out.println("Output : ");
 	assignment_40.printFreqNumMap(input7);
 	System.out.println("")	; 
   }
}