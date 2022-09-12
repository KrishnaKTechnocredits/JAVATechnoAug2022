package swapnilMaheshwari.ArrayPrograms;

public class MiddleCharInArray {

	char midCharArr (String str) {
		int ind=0;
		int length=str.length();
		for (int index=0; index<length;index++) {
			if (str.length()%2==0) {
				ind=length/2-1;
			}
			else 
			ind=length/2;
			
		}
		return str.charAt(ind);
	}
	
	void printMiddleCharacterFromArray (String[] name) {
		for (int index=0; index<name.length;index++) {
			char ch=midCharArr(name[index]);
			System.out.println(name[index]+" Middle Character -> "+ch);
		}
	}
	 public static void main(String[] args) {
		 String[] arr= { "Swapnil","Kapil","Prashant","Technocredits"};
		 MiddleCharInArray middleCharInArray = new MiddleCharInArray();
		 middleCharInArray.printMiddleCharacterFromArray(arr);
	}
}
