package deepakBorse.Assignments;

/*

Assignment - 25 : 20th Sep'2022

Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 

Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati */
class Assignment25 {

	// Program 1: Print all the repeated word in given string.
	void printRepeat(String input) {

		String[] inputsplit = input.split(" ");
		System.out.println("Duplicate words from string '"+input+"': ");
		for (int i = 0; i < inputsplit.length; i++) {
			for (int j = i + 1; j < inputsplit.length; j++) {

				if (inputsplit[i].equals(inputsplit[j])) {

					System.out.println(inputsplit[i]);
					break;

				}
			}
		}

	}

	// Program 2: Print all the non repeated word in given string.
	void printNoRepeat(String input) {
		
		boolean repflag;
		System.out.println("Non repeated words from the string '"+input+"': ");
		String[] inputsplit = input.split(" ");
		for (int i = 0; i < inputsplit.length; i++) {
			repflag=true;
			for (int j = 0; j < inputsplit.length; j++) {

				if (inputsplit[i].equals(inputsplit[j])&&i!=j) {
					repflag=false;
				}
				
			}			
			if(repflag==true) {
				System.out.println(inputsplit[i]);
			}
		}
		
	}

	public static void main(String[] arg) {

		Assignment25 Assignment = new Assignment25();

		String input = ("Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati");

		Assignment.printRepeat(input);
		Assignment.printNoRepeat(input);

		// System.out.println(output);
	}
}