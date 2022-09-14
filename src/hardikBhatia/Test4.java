package hardikBhatia;

public class Test4 {
	//Program 1 : Write a method to return sum of all the digits present in each elements from given
	int getSumOfDigit(String name) {
		int sum = 0;
		for(int j = 0; j < name.length(); j++) {
			if(Character.isDigit(name.charAt(j))) {
				int numeric = Character.getNumericValue(name.charAt(j));
				sum += numeric;
			}
		}
		return sum;
	}
	void getSumOfDigitInString(String[] name) {
		int count = 0;
		for(int index = 0; index < name.length; index++) {
			String currentName = name[index];
			System.out.println(currentName + "---" + getSumOfDigit(currentName));
			count++;
		}
	}
	// Program 2 : Return count of visible trees. 11minit
	int checkHowMuchTreesVisible(int[] treesHight){
		int countOftreeVisible = 0;
		int maxHeight = 0;
		int lastMaxHeight = 0;
		for(int index = 0; index < treesHight.length; index++) {
			if(treesHight[index] > maxHeight) {
				maxHeight = treesHight[index];
				countOftreeVisible++;
			}
		}
		return countOftreeVisible;
	}

	public static void main(String[] args) {
		Test4 test4 =  new Test4();
		
		int[] trees= {3,7,5};
		System.out.println(test4.checkHowMuchTreesVisible(trees));
		int[] trees2= {3,5,11,9,10,13};
		System.out.println(test4.checkHowMuchTreesVisible(trees2));
		
		String[] names = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		test4.getSumOfDigitInString(names);
		
	}

}
