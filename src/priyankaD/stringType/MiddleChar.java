//Assignment16
package priyankaD.stringType;
// return middle character from given name.
//Hint : char getMiddleChar(String name)

//input : Maulik
//output : Middle character in name Maulik is u

//input : Technocredits
//output : Middle character in name Technocredits is c

public class MiddleChar {
	char getMiddleChar(String name) {
		 int length=name.length();
		 int index=0;
		 if(length%2==0) 
		   index=length/2-1;
		 else
		   index=length/2;
			
		return name.charAt(index);
	}
      public static void main(String[]args) {
    	  char ch = new MiddleChar().getMiddleChar("Maulik");
    	   System.out.println(ch);

    	  char ch1=new MiddleChar().getMiddleChar("Technocredits");
    	   System.out.println(ch1);
    }
}
