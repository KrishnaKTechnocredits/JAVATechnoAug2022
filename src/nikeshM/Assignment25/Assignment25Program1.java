package nikeshM.Assignment25;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

//Program 1: Print all the repeated word in given string.
//String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
//output : Hindavi 
//         Shubham 

//Program 2: Print all the non repeated word in given string.
//String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
//output : Maulik 
//         Puja
//         Titiksha
//         Swati 

public class Assignment25Program1 {
	void getRepetedWord(String input) {
		String[] name = input.split(" ");
		System.out.println("Duplicate String are  : \n " + Arrays.toString(name) + "\n");
		for (int index = 0; index < name.length; index++) {

			for (int i = 0; i < name.length; i++) {
				if ((name[index].equals(name[i])) && (index != i))
					System.out.println(name[i]);

			}

		}

	}

	void printNonRepetedWord(String input) {
		String[] name = input.split(" ");
		System.out.println("NonDuplicate String Are  : \n " + Arrays.toString(name) + "\n");
		for (int index = 0; index < name.length; index++) {
			boolean status = true;
			for (int i = 0; i < name.length; i++) {
				if ((name[index].equals(name[i])) && (index != i))
					status = false;

			}
			if (status)
				System.out.println(name[index]);
		}
	}

	public static void main(String[] args) {
		String input = ("Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati");
		Assignment25Program1 p1 = new Assignment25Program1();
		p1.getRepetedWord(input);
		p1.printNonRepetedWord(input);

	}
}
