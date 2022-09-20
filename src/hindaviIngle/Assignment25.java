/*
 * Assignment - 25 : 20th Sep'2022

Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 

Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati 
 */
package hindaviIngle;

public class Assignment25 {
	
	void getDuplicateString(String name) {
		name=name.toUpperCase();
		String[] inputArry=name.split(" ");
		for(int i=0;i<inputArry.length;i++) {
			for(int j=i+1;j<inputArry.length;j++) {
			if(inputArry[i].equals(inputArry[j])) {
				System.out.println(inputArry[i]);
				break;
				}
			}	
		}
	}
		
	void getNonRepeatedWord(String name) {
		name=name.toUpperCase();
		String[] input = name.split(" ");
		for (int i = 0; i < input.length; i++) {
			boolean flag = true;
			for (int j = 0; j < input.length; j++) {
				if (input[i].equals(input[j]) && i != j)
					flag = false;
			}
			if (flag) {
				System.out.println(input[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment25 assignment25=new Assignment25();
		String input= "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		System.out.println("Repeted String: \n");
		assignment25.getDuplicateString(input);
		System.out.println("=========================");
		System.out.println("Non repeted String:\n");
		assignment25.getNonRepeatedWord(input);

	}

}
