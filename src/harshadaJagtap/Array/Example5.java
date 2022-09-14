//5) Write a method to print middle character of all array elements.
//input : {"Ashish","Aditty","Manjiri","Ankita"}
//output : Ashish -> h
//         Aditty -> i
//		 Manjiri -> j
//		 Ankita -> k


package harshadaJagtap.Array;

public class Example5 {
	
	static int a;
	
	static char getMiddlechar(String name) {
		 if(name.length()%2==0)
			 a=name.length()/2-1;
		 else
			 a=name.length()/2;
		 
		 return name.charAt(a);
	}
	
	void inpuString(String[] name) {
		char ch='a';
		
		for(int index=0;index<name.length;index++) {
			ch=getMiddlechar(name[index]);	
			System.out.println(name[index]+"->"+ch);	
		}
	}
	
	public static void main(String[] args) {
		Example5 example5=new Example5();		
		String[] arr= {"Ashish","Aditty","Manjiri","Ankita"};
		example5.inpuString(arr);
	}
}
