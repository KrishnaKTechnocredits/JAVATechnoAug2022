package avni.returnTypeExample;
/*Program - 1. Write a program to print unique character of each name in given string array.*/
public class UniChar {
		
		void printUniqueCharOfStr(String[] arr) {
			System.out.println("1 : Unique character of each name in given string array : " );
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.println("Name is \"" + arr[i] + "\" : " );
				for(int j = 0; j < arr[i].length() ; j++) {
					char ch=arr[i].charAt(j);
					if(arr[i].indexOf(ch)  == arr[i].lastIndexOf(ch)) {
						System.out.println(ch);
					}
				}
			}
			System.out.println("**\n\n");
		}
	/*
	 * Program - 2. Write a program to print 1st unique character of each name in given string array
	 */
		void printFirstUniqueCharOfStr(String[] arr) {
			System.out.println("2 : First unique character of each name in given string array : " );
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.print("Name is \"" + arr[i] + "\" : " );
				for(int j = 0; j < arr[i].length() ; j++) {
					char ch =arr[i].charAt(j);
					if(arr[i].indexOf(ch)  == arr[i].lastIndexOf(ch)) {
						System.out.println(ch);
						break;
					}

				}
			}
		}
		public static void main(String[] args) {
			UniChar unique=new UniChar();
			String[] arr = {"Maulik", "Kanani", "avani"};
			unique.printUniqueCharOfStr(arr);
			String[] arr1 = {"Maulik", "KananiK", "avani"};
			unique.printFirstUniqueCharOfStr(arr1);
		}
	}
