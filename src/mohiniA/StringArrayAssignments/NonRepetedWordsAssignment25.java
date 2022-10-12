
/******Assignment - 25 : 20th Sep'2022 *******************/ 
/*****Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati 

*********/


package mohiniA.StringArrayAssignments;

public class NonRepetedWordsAssignment25 {
	
	void NonRepetedWords(String str) {
	       String[] arr=str.split(" ");
	       for(int index=0;index<arr.length;index++){
	    	   int count=1;
		       for(int j=1;j<arr.length;j++) {
		    	   if(arr[index].equalsIgnoreCase(arr[j]) && arr[index]!=arr[j]) {
		    		   count++;
		    		   arr[j]="";
		        }
		       }
		       if(count==1) {
	    		   System.out.println(arr[index]);
	    	   }
			 }
	       
		}

	public static void main(String[] args) {
		NonRepetedWordsAssignment25 obj2=new NonRepetedWordsAssignment25();
		String str="Maulik Puja Hindavi Shubham Puja Hindavi";
		System.out.println("\nNon-Repeated words in the given string ["+str+"] are:\n");
		obj2.NonRepetedWords(str);

	}

}
