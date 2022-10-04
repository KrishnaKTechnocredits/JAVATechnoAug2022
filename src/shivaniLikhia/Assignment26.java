package shivaniLikhia;

public class Assignment26 {

	void getFrequencyOfEachCharacter(String str){
		System.out.println("The occurence of each element in a gven String is : ");
		while(str.length()>0){
			char ch = str.charAt(0);
			int originalLength = str.length();
			str = str.replace(String.valueOf(ch),"");
			int newLength = str.length();
			System.out.println(ch + " --> " +(originalLength - newLength));
		}
		
	}
	
	public static void main(String[] args){
		
		new Assignment26().getFrequencyOfEachCharacter("technocreditst");
	}
	
}
