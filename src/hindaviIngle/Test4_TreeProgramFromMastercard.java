/*
 * Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4

 */
package hindaviIngle;
public class Test4_TreeProgramFromMastercard {
	
	int getMaxNumber(int[] num) {
		int maxNum=num[0];
		//num[0]=3;
		System.out.println(num[0]);
		int totalCount=1;
		//int index;
		for (int index=1;index<=num.length-1;index++) {
			if(maxNum<num[index]) {
				maxNum=num[index];
				System.out.println(maxNum);
				totalCount++;
			}
		}
		return totalCount;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4_TreeProgramFromMastercard prg=new Test4_TreeProgramFromMastercard();
		int [] num= {3,5,11,9,10,13};
		System.out.println("No of visible trees : "+prg.getMaxNumber(num)+"\n");
		int [] num1= {3,7,5};
		System.out.println("No of visible trees : "+prg.getMaxNumber(num1));
		}
	}


