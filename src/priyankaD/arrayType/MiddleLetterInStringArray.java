package priyankaD.arrayType;
//_Assignment_19_5 Write a method to print middle character of all array elements.
//input : {"Ashish","Aditty","Manjiri","Ankita"}
//output : Ashish -> h
//Aditty -> i
//Manjiri -> j
//Ankita -> k
public class MiddleLetterInStringArray {
     char middleLetter(String input) {
    	 int length=input.length();
    	 int index=0;
    	 if(length%2==0) {
    		 index=length/2-1;
    	 }else {
    		 index=length/2;
    	 }
    		 return input.charAt(index);
     }
     void getMiddleChar(String[] arr) {
    	 for(int index=0;index<arr.length;index++) {
    		 char ch=middleLetter(arr[index]);
    		 System.out.println(arr[index]+"--->"+ch);
    	 }
     }
     public static void main(String[]args) {
    	 String[] arr={"Ashish","Aditty","Manjiri","Ankita"};
    	 new MiddleLetterInStringArray().getMiddleChar(arr);
     }
}
