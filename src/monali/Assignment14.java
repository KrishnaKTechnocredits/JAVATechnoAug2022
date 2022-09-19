package monali;

public class Assignment14 {
	
	public void findTargetNum(int i) {
			int num=1;
			int count=0;
			int sum=0;
			while(sum<i) {
				sum = sum + num;
				count++;
				num++;
			}
			System.out.println("The number of sum of values closest to the Target Number given is : " +count);
				
			}

		public static void main(String[] args) {
			
			 new Assignment14().findTargetNum(50);
		}

	}



