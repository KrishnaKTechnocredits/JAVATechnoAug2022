package gauravSahu.assignments;

public class ArrayTest4 {
	
	int getintegersum(String name) {
		int sum = 0;
		
		for(int index=0;index<name.length();index++) {
			int ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}	
		}
	return sum;
	}
	
	int[] getinteger(String[] name) {
		int[] output = new int[name.length];
		
		for(int index=0; index<name.length;index++) {
			output[index]=getintegersum(name [index]);
		}
		return output;
	}
	
	void display(String[] name) {
		int[] result = getinteger(name);
		
		for(int index=0;index<name.length;index++) {
			System.out.println(name[index] + "   "  +result[index]);
		}
	}
	
	public static void main(String[] args) {
		ArrayTest4 a1 = new ArrayTest4();
		String[] name = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		a1.display(name);
	}

}


/*Test 4 - 11th Sep'2022

Expected time : 15 mins
Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0

Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2*/