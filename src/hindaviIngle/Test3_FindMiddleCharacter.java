
/*
 * Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h
 */
package hindaviIngle;

public class Test3_FindMiddleCharacter {
	char[] middleCharOfArrya(String[] strArr) {
		char[] returnCharArray = new char[strArr.length];
		for (int index = 0; index < strArr.length; index++) {
			int index1 = 0;
			int len = strArr[index].length();
			if (len % 2 == 0) {
				index1 = len / 2 - 1;
			} else {
				index1 = len / 2;
			}
			returnCharArray[index] = strArr[index].charAt(index1);
			//System.out.println(strArr[index] + "--->" + strArr[index].charAt(index1));
		}
		return returnCharArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3_FindMiddleCharacter middleCharcter=new Test3_FindMiddleCharacter();
		String[] strArr={"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		char[] myArr = middleCharcter.middleCharOfArrya(strArr);
		//System.out.println(myArr);
		for(int index = 0; index < myArr.length; index++) {
			System.out.println(strArr[index]+" -------> "+myArr[index]);
		}
		
	}

}
