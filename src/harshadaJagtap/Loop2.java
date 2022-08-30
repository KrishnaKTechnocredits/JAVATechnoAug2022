//count numbers divisible by 3 from 1-20
package harshadaJagtap;
class Loop2{
	void m1(){
		int count=0;
		for(int index=1; index<=20; index++){
			if (index%3==0){
				System.out.println(index);
				count++;
			}
		}
		System.out.println("Numbers divisible by 3 between 1 to 20 are "+ count);
	}
	public static void main(String[]args){
		Loop2 loop2=new Loop2();
		loop2.m1();
	}
}