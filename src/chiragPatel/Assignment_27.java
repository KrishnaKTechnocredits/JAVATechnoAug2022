package chiragPatel;

import java.util.Arrays;

public class Assignment_27 {

		void printUniqueChar(String[] input) {
			System.out.println("Given string array is: " + Arrays.toString(input));
			for (String name : input) {
				System.out.println("Unique characher from '" + name + "' as below");
				for (int index = 0; index < name.length(); index++) {
					if (name.indexOf(name.charAt(index)) == name.lastIndexOf(name.charAt(index))) {
						System.out.println(name.charAt(index));
					}
				}
				System.out.println("**********************");
			}
		}
		void printFirstUniqueChar(String[] input) {
			System.out.println("\nGiven string array is: " + Arrays.toString(input));
			for (String name : input) {
				System.out.println("First unique character from '" + name + "' is:");
				for (int index = 0; index < name.length(); index++) {
					if (name.indexOf(name.charAt(index)) == name.lastIndexOf(name.charAt(index))) {
						System.out.println(name.charAt(index));
						break;
					}
				}
				System.out.println("**********************");
			}
		}

		public static void main(String[] args) {
			String[] arr1 = { "Maulik", "Kanani", "Mahesh", "Kanani" };
			String[] arr2 = {"Maulik", "KananiK", "akanksha"};
			Assignment_27 assignment27 = new Assignment_27();
			assignment27.printUniqueChar(arr1);
			assignment27.printFirstUniqueChar(arr2);
		}
	}

