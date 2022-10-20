package shraddhaRekhate.Assignment23;
//Program 2: Write a method to print all the words having atleast one digit.
//
//String input = "Good mor9ning fr3iends t2hi2s is technocredits";
//output : mor9ning
//         fr3iends
//         t2hi2s	

public class WordHAvingAtleastOneDigit {
	
	void wordHavingDigit(String w) {
		for(int i=0;i<w.length();i++) {
			char ch=w.charAt(i);
    		if(Character.isDigit(ch)) {
    			System.out.println(w);
    			break;
    		}
		}
	}
	
    void printWordHavingAtleastOneDigit(String input) {
    	String[] arr=input.split(" ");
    	for(int index=0;index<arr.length;index++) {
    		  wordHavingDigit(arr[index]);
    		}
    }
    
	public static void main(String[] args) {
		WordHAvingAtleastOneDigit  wordHAvingAtleastOneDigit=new WordHAvingAtleastOneDigit();
		System.out.println("Words having atleast one digits from the given string are: ");
		wordHAvingAtleastOneDigit.printWordHavingAtleastOneDigit("Good mor9ning fr3iends t2hi2s is technocredits");
	}

}
