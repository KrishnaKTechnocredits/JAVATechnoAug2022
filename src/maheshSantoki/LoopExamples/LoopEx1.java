//Assignment 7
//Mahesh Santoki
package maheshSantoki.LoopExamples;
class LoopEx1{
	//print all even numbers
	void evenNumber(int start,int end){
		System.out.println("1.Even Numbers:");
		for(int i=start;i<=end;i++){
			if(i%2 ==0)
			System.out.println("   " + i);
		}
	}
	//Divisible numbers
	void divisible1(int start,int end){
		System.out.println("2.This numbers are divisible by 5 : ");
		for(int i=start;i<=end;i++){
			if(i%5 == 0)
				System.out.println("   "+ i);
		}
	}
	void divisible2(int start,int end){
		System.out.println("3.This numbers are divisible by 3 and 5 :");
		for(int i=start;i<=end;i++){
			if(i%3==0 && i%5==0)
				System.out.println("  " + i);
		}
	}
	void divisible3(int start,int end){
		System.out.println("4.This numbers are divisible by 7 or 13 :");
		for(int i=start;i<=end;i++)
			if(i%7==0 || i%13==0)
				System.out.println("   "+ i);
	}
	//sum of given series numbers
	void sumNumbers(int start,int end){
		int sum=0;
		System.out.println("5.Sum of given numbers :");
		for(int i=start;i<=end;i++){
			sum = sum + i;
		}
		System.out.println("   "+ sum);
	}
	//difference between odd and evenNumber
	void difference(int start,int end){
		int sumofeven=0;
		int sumofodd=0;
		int dif=0;
		System.out.println("6.Differnce between odd and even numbers :");
		for(int i=start;i<=end;i++){
			if(i%2!=0)
				sumofodd=sumofodd+i;
			else
				sumofeven=sumofeven+i;			 
		}
		dif=sumofodd-sumofeven;
		System.out.println("   "+ dif);
	}
	//odd numbers in revrse order;
	void reverse(int start,int end){
		System.out.println("7.Odd numbers in reverse order: ");
		for(int i=end;i>=start;i--){
			if(i%2!=0)
				System.out.println("   "+ i);
		}
	}

	
	public static void main(String[] a){
		LoopEx1 loopex1 = new LoopEx1();
		loopex1.evenNumber(10,15);
		loopex1.divisible1(10,30);
		loopex1.divisible2(5,18);
		loopex1.divisible3(5,40);
		loopex1.sumNumbers(1,5);
		loopex1.difference(3,9);
		loopex1.reverse(10,20);
	}
}