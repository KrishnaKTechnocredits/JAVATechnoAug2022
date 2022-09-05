
package mohiniA.Loop;

public class TestDivide{

		void divisibleby3and7(int num1 ,int num2){
				int count=0;
				for (;num1<= num2;num2++)
				{
					if(num1%3==0 && num1%7==0)
					{
							count++;
							System.out.println("Number" + num1 + "is divisible by 3 and 7");
					}
					if (count==3)
						break;					
				}
			}

		public static void main(String[] args){
			
			TestDivide test = new TestDivide();
			test.divisibleby3and7(1,50);			
		}
}