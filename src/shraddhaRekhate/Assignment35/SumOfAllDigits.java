package shraddhaRekhate.Assignment35;
//Program 2: return sum of all the digits from given String.
//input : i have 15 years and 3 months of experience.
//output : 9
//Hint : Using Exception handling
public class SumOfAllDigits {
	int sumOfAllDigits(String str) {
		int sum=0;
		String[] str1=str.split(" ");
		
		for(int index=0;index<str1.length;index++) {
			for(int j=0;j<str1[index].length();j++) {
				try {
					char ch=str1[index].charAt(j);
					int num=Integer.parseInt(Character.toString(ch));
	            	sum=sum+num;
	            }catch(NumberFormatException nf) {
	            	
	            }
			}
			
		}
				return sum;
	}

	public static void main(String[] args) {
		String str="i have 15 years and 3 months of experience.";
		SumOfAllDigits sumOfAllDigits=new SumOfAllDigits();
		System.out.println(sumOfAllDigits.sumOfAllDigits(str));
	}

}
