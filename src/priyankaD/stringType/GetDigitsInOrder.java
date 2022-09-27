package priyankaD.stringType;
//Assignment 18_1
//1) Write a program to rearrange String in given format. 
//String str = "te2cH4no";
//output : "24tecHno";

public class GetDigitsInOrder {
    String getDigitsInOrder(String str) {
    	String getDigit="";
    	String getLetter="";
    	String output="";
    	int index=0;
    	for(;index<str.length();index++) {
    	char ch=str.charAt(index);
    	if(Character.isDigit(ch)) {
    		getDigit=getDigit+ch;
    	}else if(Character.isLetter(ch)){
    		getLetter=getLetter+ch;
    	}
    }
    	output=getDigit+getLetter;
    	return output;
    }
    public static void main(String[]args) {
    	String output=new GetDigitsInOrder().getDigitsInOrder("te2cH4no");
    	System.out.println(output);
    }
}
