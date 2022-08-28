//print numbers divisible by 9 in reverse order from 1-100
package harshadaJagtap;
class Loop4{
	void divisibleBy9(){
		int count=0;
		for(int index=100;index>=1;index--){
			if(index%9==0){
				System.out.println(index);
				count++;
			}
		}
		System.out.println("Numbers divisible by 9 from 1 to 100 are "+ count);
	}

	public static void main(String[]args){
		Loop4 loop4=new Loop4();
		loop4.divisibleBy9();
	}
}