package shraddhaRekhate.Assignment19;

public class MiddleChar {
//	Write a method to print middle character of all array elements.
//	input : {"Ashish","Aditty","Manjiri","Ankita"}
//	output : Ashish -> h
//	         Aditty -> i
//			 Manjiri -> j
//			 Ankita -> k
  char getMiddleCharofAllArrayElements(String[] arr) {
	  char ch=' ';
	  System.out.println("Middle character in given array is:");
	  for(int index =0;index<arr.length;index++) {
		  for(int innerIndex=0;innerIndex<arr[index].length();innerIndex++) {
			      if(arr[index].length()%2==0) {
				  System.out.println(arr[index].charAt(arr[index].length()/2-1));
				  break;
				  }else {
					  System.out.println(arr[index].charAt(arr[index].length()/2));
					  break;
				  }
			      
		  }
	  }
	  return ch;
  }
  public static void main(String[] args) {
	  MiddleChar midChar=new MiddleChar();
	  String arr[]= {"Ashish","Aditty","Manjiri","Ankita"};
	  char ch=midChar.getMiddleCharofAllArrayElements(arr);
	  System.out.println(ch);
  }
  
}
