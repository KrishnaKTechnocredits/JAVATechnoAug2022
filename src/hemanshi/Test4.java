/*
 * Test 4 - 11th Sep'2022
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
output : 2
input : {3,5,11,9,10,13}
output : 4
 */

package hemanshi;

public class Test4 {
	
//program-1
	int getDigitSum(String name) {
		int sum = 0;
		for(int j = 0; j < name.length(); j++) {
			if(Character.isDigit(name.charAt(j))) {
				int num = Character.getNumericValue(name.charAt(j));
				sum += num;
			}
		}
		return sum;
	}
	void getSumOfDigitInString(String[] name) {
		int count = 0;
		for(int index = 0; index < name.length; index++) {
			String currentName = name[index];
			System.out.println(currentName + "---" + getDigitSum(currentName));
			count++;
			}
		}
		
//program-2
	int checkTreesVisible(int[] treesHight){
		int counttreeVisible = 0;
		int maxHeight = 0;
		int lastMaxHeight = 0;
		for(int index = 0; index < treesHight.length; index++) {
			if(treesHight[index] > maxHeight) {
				maxHeight = treesHight[index];
				counttreeVisible++;
			}
		}
		return counttreeVisible;
	}

		public static void main(String[] args) {
			Test4 test4 =  new Test4();
			
			System.out.println("The sum of all the digits present in each elements from given array.");
			String[] names = {"He4mu","Dra9sh3ti","Sw5eta","P2ri1ya","A4ng4le","Himss"};
			test4.getSumOfDigitInString(names);
			
			System.out.println("Return count of visible trees .");
			int[] trees= {3,7,5};
			System.out.println(test4.checkTreesVisible(trees));
			int[] trees2= {3,5,11,9,10,13};
			System.out.println(test4.checkTreesVisible(trees2));

  }
}
		


	
