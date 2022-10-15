package shraddhaRekhate.Assignment23;
//Program 4: Write a method to print all the words having no digits and uppercase.
//String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
//output : techno
//         is
public class NoDidgitUpper {
	boolean isUpperCase(String w) {
		boolean flag=false;
		for(int index=0;index<w.length();index++) {
			char ch=w.charAt(index);
			if(Character.isUpperCase(ch)) {
				flag=true;
				break;
			}
		}
		if(flag==false) {
			return flag;
		}else {
		return flag;
	}
	}
	
	boolean isDigit(String w) {
		boolean flag=false;
		for(int index=0;index<w.length();index++) {
			char ch=w.charAt(index);
			if(Character.isDigit(ch)) {
				flag=true;
				break;
			}
		}
		if(flag==false) {
			return flag;
		}else {
		return flag;
		}
	}
	
	void printAllWordsWithNoDigitsAndUpperCase(String str) {
		String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		String[] inputArray=input.split(" ");
		for(int index=0;index<inputArray.length;index++) {
			boolean isDigitflag=isDigit(inputArray[index]);
			boolean isUpperflag=isUpperCase( inputArray[index]);
			if(isDigitflag==false && isUpperflag==false) {
				System.out.println(inputArray[index]);
			}
		}
	}
	

	public static void main(String[] args) {
		NoDidgitUpper noDidgitUpper=new NoDidgitUpper();
		String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		noDidgitUpper.printAllWordsWithNoDigitsAndUpperCase(input);

	}

}
