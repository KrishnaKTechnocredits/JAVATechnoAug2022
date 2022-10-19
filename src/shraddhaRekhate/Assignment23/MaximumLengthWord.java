package shraddhaRekhate.Assignment23;

//Program 1:
//Write a method to return maximum length word from given input.
//String input = "Good morning friends this is technocredits";
//output : technocredits

public class MaximumLengthWord {
	String input="Good morning friends this is technocredits";
	int max=0;
     String getMaxLengthWord(String input) {
    	 String[] arr=input.split(" ");
    	 String maxLengthWord="";
    	 for(int index=0;index<arr.length;index++) {
    		 if(arr[index].length()>max) {
    			 maxLengthWord=arr[index];
    		 }
    	 }
    	 return maxLengthWord;
     }
	
	public static void main(String[] args) {
		MaximumLengthWord maximumLengthWord=new MaximumLengthWord();
	    System.out.println("Maximun length string is:"+maximumLengthWord.getMaxLengthWord("Good morning friends this is technocredits"));
	}

}
