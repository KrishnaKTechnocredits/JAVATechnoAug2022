package kiran;

public class StringTest1 {
		int getNameLength(String str){
		return(str.length());
	}
	
	char getMidChar(String str){
		int len=str.length();
		char midchar;
		if(len%2!=0) {
			midchar=str.charAt(len/2);
			return midchar;
		}
		else
		{
			midchar=str.charAt((len/2)+1); 
			return midchar;
		}
	}

	public static void main(String[] args) {
		StringTest1 obj=new StringTest1();
		int lenght=obj.getNameLength("kiran");
		System.out.println("Length of sting is : "+lenght);
		
		char ch=obj.getMidChar("kashish");
		System.out.println("mid char is : "+ch);	
	}

}
