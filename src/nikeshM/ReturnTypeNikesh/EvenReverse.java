package nikeshM.ReturnTypeNikesh;

public class EvenReverse {
	int getEvenNumber(String str) {
		int length = str.length();
		int range = 2;
		boolean isFlag = true;
		for (int index = 13; index>=0; index--) {

			if (index % range == 0) {
				isFlag = false;
				System.out.print(str.charAt(index));
			} else if (isFlag) {
				System.out.println("");
			}
		}
		return length;
	}

	public static void main(String[] args) {
		EvenReverse eve = new EvenReverse();
		 eve.getEvenNumber("Nikeshmargaje");
	
}
}
