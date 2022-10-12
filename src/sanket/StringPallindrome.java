/*Assignment - 31 : 29th Sep'2022

Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom


Program 2 :
Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam*/

package sanket;

import java.util.Arrays;

public class StringPallindrome {
    // method return flag to check whether string is pallindrome or not
    boolean isStringPallindrome(String str) {
        boolean flag = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                System.out.println(str + " not a pallindrome.");
                break;
            }
        }
        if (flag == true)
            System.out.println(str + " a pallindrome");
        return flag;
    }

    // method return flag to check whether string is pallindrome or not
    boolean isStringPallindrome2(String str) {
        boolean flag = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
            }
        }
        return flag;
    }

    // method return flag to check whether string is pallindrome or not from an
    // array
    void findStringIsPallindromeInArray(String[] arr) {
        for (int index = 0; index < arr.length; index++) {
            if (isStringPallindrome2(arr[index])) {
                System.out.println(arr[index]);
            }
        }
    }

    public static void main(String[] args) {
        String input1 = "radar";
        String input2 = "aabcbaa";
        String input3 = "abcabc";
        System.out.println("***Program 1 Solution***");
        new StringPallindrome().isStringPallindrome(input1);
        new StringPallindrome().isStringPallindrome(input2);
        new StringPallindrome().isStringPallindrome(input3);

        System.out.println("\n");

        String[] arr = {"radar", "techhpet", "madam", "maulikkilum"};
        System.out.println("***Program 2 Solution***");
        System.out.println("The pallindrome strings from array "
            + Arrays.toString(arr) + " are : ");
        new StringPallindrome().findStringIsPallindromeInArray(arr);
    }
}
