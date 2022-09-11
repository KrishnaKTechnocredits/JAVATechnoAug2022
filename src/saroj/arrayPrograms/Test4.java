package saroj.arrayPrograms;

public class Test4 {

	int getAddNum(String name) {
		int sum = 0;
		char ch = ' ';
		for (int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	int[] getAllNumAdd(String[] name) {
		int[] add = new int[name.length];
		for (int index = 0; index < name.length; index++) {
			add[index] = getAddNum(name[index]);
		}
		return add;
	}

	int countOfVisibleTree(int[] height) {
		int max = 0;
		int count = 0;
		for (int index = 0; index < height.length; index++) {
			if (height[index] > max) {
				max = height[index];
				count++;
			}
		}
		System.out.println("Count of visible tree are: ");
		return count;
	}

	public static void main(String[] args) {
		Test4 test4 = new Test4();
		String[] name1 = { "sa1r4o5j", "sanni", "ab6h4a2y", "M8a5n0o23j" };
		int[] addArray = test4.getAllNumAdd(name1);
		for (int index = 0; index < addArray.length; index++) {
			System.out.println("In " + name1[index] + " addition of digits are: " + addArray[index]);
		}
		System.out.println("--------------------------------------------------");
		int[] height = { 3, 7, 5 };
		System.out.println(test4.countOfVisibleTree(height));
		int[] height1 = { 3, 5, 11, 9, 10, 13 };
		System.out.println(test4.countOfVisibleTree(height1));

	}
}
