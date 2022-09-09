package nikeshM.Return;

public class ReturnMethod {
	char getMiddleChar(String str) {
		int length = str.length ();
		int index =0;
		 if (length%2 ==0) {
			 length = length/2-1;
			 System.out.println( "Length is " + str.length());
			 System.out.println(str.charAt(2));
		 }
		 else {
			 index = length/2;
		 }
		 return str.charAt(index);
		
	}
	public static void main(String[] args) {
		ReturnMethod retn = new ReturnMethod();
		retn.getMiddleChar("nikesh");
		
		
	}
}
