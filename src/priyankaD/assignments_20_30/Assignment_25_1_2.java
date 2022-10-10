package priyankaD.assignments_20_30;
import java.util.Arrays;
public class Assignment_25_1_2 {
	//Program 1: Print all the repeated word in given string.
		//String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		//output : Hindavi 
		        // Shubham
		void printRepeatedWordsInString(String input) {
			String[] words=input.split(" ");
			System.out.println("Input String->"+Arrays.toString(words));
			for(int index=0;index<words.length;index++) {
				for(int j=index+1;j<words.length;j++) {
					if((words[index].equals(words[j])) && index!=j) {
						System.out.println(words[index]);	
				}
			}
		}
	}
		//Program 2: Print all the non repeated word in given string.
		//String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
		//output : Maulik 
		         //Puja
		         //Titiksha
		         //Swat
		void printNonRepeatedWordsInString(String input) {
			String[] words=input.split(" ");
			for(int index=0;index<words.length;index++) {
				boolean flag=true;
				for(int j=1;j<words.length;j++) {
					if((words[index].equals(words[j])) && index!=j) { 
					flag=false;
					break;
					}
				}if(flag) 
				    System.out.println(words[index]);
		    }
		}
		public static void main(String[] args) {
			Assignment_25_1_2 assignment=new Assignment_25_1_2();
			assignment.printRepeatedWordsInString("Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati");
			System.out.println("----------------------------------------------------");
			assignment.printNonRepeatedWordsInString("Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati");
		}
}
