/*
 Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output :  Ma1he4sh -> 5
         A9vni -> 9
         P1uj3a5 -> 9
         Harshal -> 0
         A4d4itty -> 8
         Rahul -> 0
 */
package hindaviIngle;
public class TreeProgramFromMastercard {
	
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
		TreeProgramFromMastercard prg=new TreeProgramFromMastercard();
		int [] num= {3,5,11,9,10,13};
		System.out.println("No of visible trees : "+prg.getMaxNumber(num)+"\n");
		int [] num1= {3,7,5};
		System.out.println("No of visible trees : "+prg.getMaxNumber(num1));
		}
	}


