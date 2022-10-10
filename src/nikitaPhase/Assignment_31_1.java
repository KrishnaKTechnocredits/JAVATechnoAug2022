package nikitaPhase;

public class Assignment_31_1 {
	
	boolean isPalidrome(String str){
		
		boolean flag=true;
		
		for(int i=0,j=str.length()-1;i<j;i++,j--){
			if(str.charAt(i)!=str.charAt(j))
				return false;
		}
		return flag;
	}
	
	void printPalindrom(String str){
		
		boolean flag = isPalidrome(str);
		
		if(flag){
			System.out.println("Output: " +str + " is palindrome\n");
		}
		else
			System.out.println("Output: " +str + " is not palindrome\n");
	}

	public static void main(String[] args){
		
		String str1="radar"; 
		String str2="aabcbaa"; 
		String str3="abcabc";		
		
		Assignment_31_1 check_palindrome = new Assignment_31_1();
		
		System.out.println("Input_1: "+str1);
		check_palindrome.printPalindrom(str1);
		
		System.out.println("Input_2: "+str2);
		check_palindrome.printPalindrom(str2);
		
		System.out.println("Input_3: "+str3);		
		check_palindrome.printPalindrom(str3);		
	}
}
