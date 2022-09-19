/*Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name
// int getNameLength(String name)


//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c*/

package rashmiG.StringProgramsAssignments;

class StringOperations {

	String name;

	void setName(String name) {
		this.name = name;
	}

	int getNameLength(String name) {
		return name.length();
	}

	char getMiddleChar(String name) {
		int length = getNameLength(name);
		int index = 0;
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		return name.charAt(index);
	}

	public static void main(String[] args) {
		StringOperations stringOperations = new StringOperations();
		StringOperations stringOperations1 = new StringOperations();
		stringOperations.setName("Maulik");
		stringOperations1.setName("Technocredits");
		// char ch = stringOperations.getMiddleChar(stringOperations.name);
		// System.out.println("Middle character in name "+stringOperations.name+" is
		// "+ch);
		// ch= stringOperations1.getMiddleChar(stringOperations1.name);
		// System.out.println("Middle character in name "+stringOperations1.name+" is
		// "+ch);
		System.out.println("Middle character in name " + stringOperations.name + " is "
				+ stringOperations.getMiddleChar(stringOperations.name));
		System.out.println("Middle character in name " + stringOperations1.name + " is "
				+ stringOperations1.getMiddleChar(stringOperations1.name));
	}
}
