package vibhaS;

public class Assignment17 {
	
	void getReverseString(String str) {
		String name="";
		for(int index=str.length()-1;index>0;index--) {
			char ch=str.charAt(index);
			name=name+ch;
			
		}
		System.out.print("String in reverse "+name);
	}
	
	String getEvenPosition(String str){
		String name="";
		for(int index=1;index<str.length();index=index+2){
			char ch=str.charAt(index);
			name=name+ch;
		}
		return name;
	}
	
	String getReverseEvenPosition(String str){
		String name1="";
		for(int index=str.length()-2;index>=1;index=index-2){
			char ch=str.charAt(index);
             name1=name1+ch;
		}
		return name1;
	}
	
	int getDigitCount(String str){
		int count=0;
				for(int index=0;index<=str.length()-1;index++){
					char ch=str.charAt(index);
					if(Character.isDigit(ch)){
						count++;
						}	
				}
			return count;
			}
	
	void getSumOfDigitCount(String str){
		int sum=0;
		for(int index=0;index<str.length();index++){
			char ch=str.charAt(index);
			if(Character.isDigit(ch)){
				sum=sum+Character.getNumericValue(ch);
			}
		}
		System.out.println("sum of digit in string is => "+sum);
	}
	
	public static void main(String[] args){
		new Assignment17().getReverseString("Technocredits");
		System.out.println("");
		String ans1=new Assignment17().getEvenPosition("Technocredits");
		System.out.println("Even Position String is => "+ans1);
		String ans2	=new Assignment17().getReverseEvenPosition("Technocredits");
		System.out.println("Reverse Even Position String is => "+ans2);
	 	int ans3=new Assignment17().getDigitCount("Te8chno3cred7it9s");
	 	System.out.println("number of digit in string is => "+ans3);
	 	new Assignment17().getSumOfDigitCount("Te8chno3cred7it9s");
	}
	
}
