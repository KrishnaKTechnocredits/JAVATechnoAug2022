package aditiIngle;

public class Assign_17_StringOperations {

	String getReverseName(String str) {
		String rev = "";
		for(int index=str.length()-1; index>=0; index--) {
			rev += str.charAt(index);
		}
		return rev;
	}
	
	String getEvenCharacters(String str){
		String even = "";
		for(int index=0; index<str.length();index++) {
			if(index%2!=0) {
				even +=str.charAt(index);
			}
		}
		return even;
	}
	
	String getReverseEvenCharacters(String str) {
		String revEven = "";
		String even = getEvenCharacters(str);
		revEven = getReverseName(even);
		return revEven;
		
	}
	
	int getDigitsCount(String str) {
		int count =0;
		for (int index=0; index<str.length()-1; index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)){
				count++;
			}
		}		
		return count;
	}
	
	int getDigitsSum(String str) {
		int sum=0;
	  	for(int index=0; index<str.length()-1;index++) {
	  		char ch = str.charAt(index);
	  		if(Character.isDigit(ch)) {
	  			int num = Character.getNumericValue(ch);
	  			sum+=num;
	  		}
	  	}
		return sum;
	}
	public static void main(String[] args) {
	
		String str = "Maulik";
		Assign_17_StringOperations assign_17_StringOperations = new Assign_17_StringOperations();
		String str1= assign_17_StringOperations.getReverseName(str);
		System.out.println(str+" Reverse name is "+str1);
		
		String str2= "technocredits";
		String str3= assign_17_StringOperations.getEvenCharacters(str2);
		System.out.println(str2+" Even position characters are "+str3);
		
		String str4 = assign_17_StringOperations.getReverseEvenCharacters(str2);
		System.out.println(str2+ " Even position characters reverse is "+ str4);
		
		String str5 = "Te8chno3cred7it9s";
		int digits = assign_17_StringOperations.getDigitsCount(str5);
		System.out.println(str5+" digits count is "+digits);
		
		int sum=assign_17_StringOperations.getDigitsSum(str5);
		System.out.println(str5+" Sum of all digits is "+sum);
	}
	
}
