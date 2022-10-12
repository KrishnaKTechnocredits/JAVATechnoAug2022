package nikitaPhase;
import java.util.Arrays;

public class Assignment_31_2 {
	
	void printPalindrom(String[] str){
		
		for(String str1 : str) {			
			
			String reversString="";
			
			for(int j=str1.length()-1;j>=0;j--) {
				reversString=reversString+str1.charAt(j);
			}			
			
			if(str1.equals(reversString)) {
				System.out.println(str1 +" is a palindrome");
				reversString="";
			}	
		}
	}

	public static void main(String[] args) {
		Assignment_31_2 check_str_palindrome = new Assignment_31_2();
		
		String[] input = { "radar", "techhpet", "madam", "maulikkilum" };
		
		System.out.println("Input: " +Arrays.deepToString(input));
		
		check_str_palindrome.printPalindrom(input);
	}
}