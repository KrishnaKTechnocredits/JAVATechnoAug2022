/*
 * Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c
 */
package hindaviIngle;

public class Test3_MiddleCharOfMaxLength {

	String getMaxLength(String[] strArr) {
		int maxLength=strArr[0].length();
		String maxString=strArr[0];
		for (int index = 1; index < strArr.length; index++) {
		if(maxLength<strArr[index].length()) {
			maxLength=strArr[index].length();
			maxString=strArr[index];
		}
		}
		return maxString;
	}
	
	char middleCharOfString(String name) {
		char ch=' ';
		//char[] returnCharArray = new char[strArr.length];
		for (int index = 0; index < name.length(); index++) {
			int index1 = 0;
			int len = name.length();
			if (len % 2 == 0) {
				index1 = len / 2 - 1;
			} else {
				index1 = len / 2;
			}
			ch= name.charAt(index1);
			//System.out.println(strArr[index] + "--->" + strArr[index].charAt(index1));
		}
		return ch;
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Test3_MiddleCharOfMaxLength mc=new Test3_MiddleCharOfMaxLength();
	String[] s={"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
	String s1=mc.getMaxLength(s);
	System.out.println("Max length of String is : "+mc.getMaxLength(s)+"\n");
	char ch =mc.middleCharOfString(s1);
    System.out.println("Middle char of max Length String  is : "+ch );		
		
	}
	//mc.middleCharOfArrya(s)
	
		
	}
