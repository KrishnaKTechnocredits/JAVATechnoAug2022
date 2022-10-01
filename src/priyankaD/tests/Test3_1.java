package priyankaD.tests;

public class Test3_1 {
	//Program 1 : (20 mins)
	//Return middle character of max length String from given array.
	//input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
	//output : c
    String maxLengthWord(String[] input) {
	    	int length=input[0].length();
	    	String str="";
	    	for(int index=1;index<input.length;index++) {
	    		if(length<input[index].length()) {
	    			length=input[index].length();
	    			str=input[index];
	    		}
	    	}
	    	return str;
	    }
	    	char middleCharAtMaxLength(String max) {
	    		char ch=' ';
	    		for(int index=0;index<max.length();index++) {
	    		int sIndex=0;
	    		int length=max.length();
	    		if(length%2==0) {
	    			sIndex=length/2-1;
	    		}else {
	    			sIndex=length/2;
	    		}
	    		  ch=max.charAt(sIndex);
	    		  }
	    	return ch;
	    }
	    	 public static void main(String[] args) {
	       	  Test3_1 test3=new Test3_1();  
	       	String[] input={ "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
	       	String max=test3.maxLengthWord(input);
	       	System.out.println(max);
	   		char out=test3.middleCharAtMaxLength(max);
	       	System.out.println(out);
	       
	       }
}
