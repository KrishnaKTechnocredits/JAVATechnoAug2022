package chaitanyaMankar.Assignment25;


public class Assignment25 {

	void printRepeatedWords(String input){
		String[]inputStr=input.split(" ");
		
		for(int index=0; index<inputStr.length;index++){
			for(int innerIndex=index+1; innerIndex<inputStr.length;innerIndex++){
				if(inputStr[index].equals(inputStr[innerIndex])){
					System.out.println(inputStr[index]);
					break;
				}
			}
		}
	}
	
	void printNonRepeatedWords(String input){
		String[]inputStr=input.split(" ");
		
		for(int index=0; index<inputStr.length; index++){
			boolean flag=true;
			for(int innerIndex=0; innerIndex<inputStr.length; innerIndex++){
				if(inputStr[index].equals(inputStr[innerIndex]) && index!=innerIndex ){
					flag=false;
				}
			}
			if(flag)
				System.out.println(inputStr[index]);
		}
	}
	
	public static void main(String[]args){
		Assignment25 assignment25 = new Assignment25();
		String input="Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		System.out.println("Given input string is:"+input);
		
		System.out.println("\nDuplicated words from given string are as below");
		assignment25.printRepeatedWords(input);
		
		System.out.println("\nNot duplicated words from given string are as below");
		assignment25.printNonRepeatedWords(input);

	}

}
