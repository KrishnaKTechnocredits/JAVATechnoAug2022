//Assignment_17
package priyankaD.stringType;
//Program 1 : Write a method to return reverse name
//input : Maulik
//output : kiluaM
public class ReverseOrderName {
     String reverseName(String name) {
    	 String reverseName="";
    	 for(int index=name.length()-1;index>=0;index--) {
    		 reverseName=reverseName+name.charAt(index);
    	 }
    	 return reverseName;
     }
//Program 2 : Write a method to return even position characters from given String. 
//input : technocredits
//output : ehordt
     String evenReturn(String name) {
    	 String evenName="";
    	 for(int index=0;index<=name.length()-1;index++) {
    		 if(index%2!=0)
    			 evenName=evenName+name.charAt(index);
    	 }
    	 return evenName;
     }
//Program 3 : Write a method to return even position characters from given String in reverse.
//input : technocredits
//output : tdrohe    
     String reverseEven(String name) {
     	String reverseEven="";
     	for(int index=name.length()-1;index>=0;index--) {
     		if(index%2!=0)
     			reverseEven=reverseEven+name.charAt(index);
     	}
     	return reverseEven;
     }
 //Program 4 : Write a method to return count of digits in a given string.
 //input : "Te8chno3cred7it9s"
 //output : 4   
     int getDigitCount(String name) {
 		int count=0;
 		for(int index=0;index<=name.length()-1;index++) { 
 			if(Character.isDigit(name.charAt(index))) {
 				count++;
 			}
 		}
 		return count;
 	}
 //program 5:Program 5 : Write a method to return sum of digits in a given string.
 //input : "Te8chno3cred7it9s"
 // output : 27   
     int getDigitSum(String name) {
 		int Sum=0;
 		
 		for(int index=0;index<=name.length()-1;index++) { 
 			char ch = name.charAt(index);
 			if(Character.isDigit(ch)) {
 				int num = Character.getNumericValue(ch);
 				Sum = Sum + num;
 			}
 		}
 		return Sum;
 	}
     
     public static void main(String[]args) {
    	 new ReverseOrderName().reverseName("Maulik");
    	 System.out.println(new ReverseOrderName().reverseName("Maulik"));
    	 
    	 new ReverseOrderName().evenReturn("Technocredits");
    	 System.out.println(new ReverseOrderName().evenReturn("Technocredits"));
    	 
    	 new ReverseOrderName().reverseEven("Technocredits");
    	 System.out.println(new ReverseOrderName().reverseEven("Technocredits"));
    	 
    	 new ReverseOrderName().getDigitCount("Te8chno3cred7it9s");
    	 System.out.println(new ReverseOrderName().getDigitCount("Te8chno3cred7it9s"));
    	 
    	 new ReverseOrderName().getDigitSum("Te8chno3cred7it9s");
    	 System.out.println(new ReverseOrderName().getDigitSum("Te8chno3cred7it9s"));
     }
}
