/*********
Assignment - 25 : 20th Sep'2022

Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 

*******************/

package mohiniA.StringArrayAssignments;

public class RepetedWordsAssignment25 {
	
	void RepetedWords(String str) {
	       String[] arr=str.split(" ");
	       for(int index=0;index<arr.length;index++){
	    	   int count=1;
		       for(int j=1;j<arr.length;j++) {
		    	   if(arr[index].equalsIgnoreCase(arr[j]) && arr[index]!=arr[j]) {
		    		   count++;
		    		   arr[j]="";
		        }
		       }
		       if(count>1) {
	    		   System.out.println(arr[index]);
	    	   }
			 }
	       
		}
		public static void main(String[] args) {
			RepetedWordsAssignment25 obj=new RepetedWordsAssignment25();
			String str="Maulik Puja Hindavi Shubham Puja Hindavi";
			System.out.println("\nRepeated words in the given string ["+str+"] are:\n");
			obj.RepetedWords(str);
		}


}
