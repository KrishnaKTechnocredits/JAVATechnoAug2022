package nikeshM.ReturnTypeNikesh;

public class EvenReturn {
	int getEvenNumber (String str) {
		int length = str.length();
		int range = 2;
		boolean isFlag = true;
		for(int index = 2; index-1<length ; index++) {
			
			if (index%range==0) {
				isFlag = false;
			System.out.print(str.charAt(index));
			}
			else if(isFlag) {
				System.out.println("");
			}
		}
		return length;
	}	
	
	public static void main(String [] args) {
		EvenReturn eve = new EvenReturn();
		 eve.getEvenNumber("Nikeshmargaje");
		
	}
}
