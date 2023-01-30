/*{1,0,0,2,0};
output : 3

{0,0,2,0,0,1,0,2};
output : 2

{0,0,1,0,0,0,0}
output : 0*/

package gauravSahu.Practice;

public class Practice5 {

	public static void main(String[] args) {
		Practice5 p5 = new Practice5();
		int[] arr = { 0, 0, 2, 0, 0, 1, 0, 2 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				int count = 0;
				while (arr[i] != 0) {
					count++;
				}
				System.out.println(count);
			}
		}
	}

}
