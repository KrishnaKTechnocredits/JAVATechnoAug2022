package manjiri.Test;

public class Test4_Client {

	public static void main(String[] args) {
		Test4 test4 = new Test4();
		String[] stringArray = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		int[] result = test4.getSumOfDigitsInArray(stringArray);
		for(int index = 0; index < stringArray.length; index++) {
			System.out.println(stringArray[index] +" "+"-> "+ result[index]);
		}		
	}
}
