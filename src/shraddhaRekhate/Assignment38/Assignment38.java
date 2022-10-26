package shraddhaRekhate.Assignment38;
//Program 1 : 
//Replace all Deepak with Shivani.
//
//input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
//output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 
//
//Hint : use set, indexOf, contains

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38 {
    void replace(ArrayList<String> listOfNames) {
    	while(listOfNames.contains("Deepak")) {
    		int index=listOfNames.indexOf("Deepak");
    		listOfNames.set(index, "Shivani");
    	}
    	System.out.println(listOfNames);
    }
  //Program 2: 
  //Increse student marks by 10 if marks is less than 35.
  //
  //input : [23,55,34,88,58,81]
  //output : [33,55,44,88,58,81]
  void increaseStudentsMasrksBy10(ArrayList<Integer> listOfMarks) {
	  for(int num: listOfMarks) {
		  if(num<35) {
		  int index=listOfMarks.indexOf(num);
		  num=num+10;
		  listOfMarks.set(index, num);
		  }
	  }
	  System.out.println(listOfMarks);
  }
//  Program 3 : 
//	  Return list of Middle character from given name if length of the name is more than 6 characters.
//
//	  input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
//	  output : ['j','n']
  void listOfMiddleChar(ArrayList<String> listOfNames) {
	  char ch=' ';
	  ArrayList<Character> listOfMiddleChar=new ArrayList<Character>();
	  for(String name :listOfNames) {
		  int lenght=name.length();
		  if(lenght>6) {
			  if(lenght%2==0) {
				  ch=name.charAt(lenght/2-1);
			  }else {
				  ch=name.charAt(lenght/2);
			  }
			  listOfMiddleChar.add(ch);
		  }
	  }
	  System.out.println(listOfMiddleChar);
  }
//  Program 4 : 
//	  Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.
//
//	  input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
//	  output : ["Aa3shvi", "i5Sha4n"]
  
  boolean startWithVowel(String name) {
	  char ch= ' ';
	  boolean flag=false;
	  ch=name.charAt(0);
	  if(ch=='A' || ch=='a' || ch=='E'||ch=='e'||ch=='I'||ch=='i'|| ch=='O'||ch=='o'||ch=='U'||ch=='u') {
		  return true;
	  }
	  return flag;
  }
  
  boolean isExactlyOneUpperCase(String name) {
	  boolean flag=false;
	  int count=0;
	  for(int index=0;index<name.length();index++) {
		  char ch=name.charAt(index);
		  if(Character.isUpperCase(ch)) {
			  count++;
		  }
	  }
	  if(count==1) {
		  return true;
	  }
	 return flag;
  }
  
  boolean atleastOneDigit(String name) {
	  boolean flag=false;
	  int count=0;
	  for(int index=0;index<name.length();index++) {
		  char ch=name.charAt(index);
		  if(Character.isDigit(ch)) {
			  count++;
		  }
	  }
	  if(count>=0) {
		  return true;
	  }
	  return flag;
  }
  
  void vowelOneDigitOndeUpperCase(ArrayList<String> listOfName) {
	  ArrayList<String> output=new ArrayList<String>();
	  for(String name:listOfName) {
	   if(startWithVowel(name) && isExactlyOneUpperCase(name) && atleastOneDigit(name)){
		  output.add(name);
	    }
	  }
	  System.out.println(output);
	}

    public static void main(String[] args) {
    	Assignment38 a38=new Assignment38();
    	String[] input= {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
    	ArrayList<String> listOfNames=new ArrayList<String>(Arrays.asList(input));
    	a38.replace(listOfNames);
    	
    	Integer[] input1= {23,55,34,88,58,81};
    	ArrayList<Integer> listOfMarks=new ArrayList<Integer>(Arrays.asList(input1));
    	a38.increaseStudentsMasrksBy10(listOfMarks);
    	
    	 String[] input2 = {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
    	 ArrayList<String> listOfMiddleChar=new ArrayList<String>(Arrays.asList(input2));
    	 a38.listOfMiddleChar(listOfMiddleChar);
    	 
    	 String[] input3 = {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"};
    	 ArrayList<String> list=new ArrayList<String>(Arrays.asList(input3));
    	 a38.vowelOneDigitOndeUpperCase(list);
	}
}
