package priyankaD.tests;

public class Test3_2 {
	//Program 2: (40 mins)
	//Write a method to return middle character of each elements from given array.
	//input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
	//output : Mahesh -> h
	          //Avni -> v
	          //Puja -> u
	          //Harshal -> s
	          //Aditty -> i
	          //Rahul -> h
		 char[] getMiddleCharacterInArrayString(String[] input1){
	    	 char[] output=new char[input1.length];
	    	 int length=0;
	    	 for( int index = 0;index<input1.length;index++) {
	    		 int arrIndex=0;
	    		 length=input1[index].length();
	    		 if(length%2==0) {
	    			 arrIndex=length/2-1;
	    		 }else
	    			 arrIndex=length/2;
	    		 output[index]=input1[index].charAt(arrIndex);
	    	 }
			return output;
		 }
		 public static void main(String[] args) {
	      	  Test3_2 test3_2_OnArray=new Test3_2();  
	      	String[] input1= {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
	       	char[] ch=test3_2_OnArray.getMiddleCharacterInArrayString(input1);
	       	for(int index=0;index<ch.length;index++) {
	       	System.out.println(input1[index]+"-->"+ch[index]); 	  
		 }
	 }
}
