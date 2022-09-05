//find how many numbers are required to have given sum

package harshadaJagtap.LoopExapmples;

public class Required_Numbers {

		int sum=0;
		int a=1;
		int count=0;
		void findRequiredNumber(int targetNum) {
			while(sum<targetNum) {
				sum=sum+a;
				a++;
				if(sum!=targetNum)
					count++;
			}
			System.out.println(count);
		}
		
		public static void main(String[] args) {
			new Required_Numbers().findRequiredNumber(17);
		}
	}