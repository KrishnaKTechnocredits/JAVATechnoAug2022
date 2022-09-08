/*Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name

//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c*/

package sanket;

public class StringOpReturnType {

  int getNameLength(String name) {

    int nameLength = name.length();
    System.out.println("The string is " + name + ".");
    return nameLength;
  }

  char getMiddleChar(String name) {
    int length = name.length();
    int index = 0;

    if (length % 2 == 0)
      index = name.length() / 2 - 1;
    else
      index = name.length() / 2;

    char ch = name.charAt(index);
    return ch;
  }

  public static void main(String[] args) {

    StringOpReturnType stringOpReturnType = new StringOpReturnType();
    int lenghtOfName = stringOpReturnType.getNameLength("Daksh");
    System.out.println("The length of the string is " + lenghtOfName + ".");
    char ch = stringOpReturnType.getMiddleChar("Daksh");
    System.out.println("The middle character of the string is " + ch + ".");
    
    System.out.println("\n");
    
    int lenghtOfName2 = stringOpReturnType.getNameLength("Aarush");
    System.out.println("The length of the string is " + lenghtOfName2 + ".");
    char ch2 = stringOpReturnType.getMiddleChar("Aarush");
    System.out.println("The middle character of the string is " + ch2 + ".");
  }
}