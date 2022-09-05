//count numbers divisible be 3 and 7 btwn 1-100
package harshadaJagtap.LoopExapmples;
class Loop3{
	void m1(){
		int count=0;
		for(int index=1;index<=100;index++){
			if(index%3==0 && index%7==0){
				System.out.println(index);
				count++;
			}
		}
		System.out.println("numbers divisible by 3 & 7 between 1-100 are "+ count);
	}
	
	public static void main(String[]args){
		Loop3 loop3=new Loop3();
		loop3.m1();
	}
}