package hindaviIngle;

public class StringOperation {

	String reverseString(String name) {
		String reverseStr="";
		for (int index = name.length() - 1; index >= 0; index--) {
			//System.out.print(name.charAt(index));
			reverseStr=reverseStr+name.charAt(index);
		}
		return reverseStr;
	}

	String evenPosition(String name) {
		int pos = 0;
		String evenPosStr="";
		for (int index = 0; index <= name.length() - 1; index++) {
			pos = index + 1;
			if (pos % 2 == 0) {
				evenPosStr=evenPosStr+name.charAt(index);
			}
		}
		return evenPosStr ;
	}
	
	String evenPosCharReverse(String name) {
//		String output=evenPosition(name);
//		output=reverseString(output);
//		return output;
		return reverseString(evenPosition(name));
		}
	
	
	int countDigit(String name) {
		int counter=0;
		for(int index = 0; index <= name.length() - 1; index++) {
			if(Character.isDigit(name.charAt(index))) {
				counter++;
			}
		}
		return counter;
	}
	
	int sumOfDigits(String name) {
		int sum=0;
		for(int index = 0; index <= name.length() - 1; index++) {
			if(Character.isDigit(name.charAt(index))) {
				sum+=Character.getNumericValue(name.charAt(index));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperation so = new StringOperation();
		String revstr=so.reverseString("Maulik");
		System.out.println("Reverse of 'Maulik' is: "+revstr+"\n");
		String evnPosStr =so.evenPosition("technocredits");
		System.out.println("Characters at even position of 'technocredits' are: "+evnPosStr +"\n");
		//System.out.println("Reverse Even: "+so.reverseString(sh));
		String op= so.evenPosCharReverse("technocredits");
		System.out.println("Reverse of Characters at even position of 'technocredits' are: "+op+"\n");
		int counter = so.countDigit("Te8chno3cred7it9s");
		System.out.println("Number of digits in 'Te8chno3cred7it9s' are: "+counter+"\n");
		int sum = so.sumOfDigits("Te8chno3cred7it9s");
		System.out.println("Sum of digits in 'Te8chno3cred7it9s' are: "+sum+"\n");
		

	}

}
