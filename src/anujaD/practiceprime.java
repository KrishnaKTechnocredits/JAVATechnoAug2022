package anujaD;

class practiceprime{
	
	void m1(int num){
		boolean flag = true;
		if (num>0){
		for(int index=2;index<=num/2;index++){
			if(num%index==0){
				System.out.println(num+  "  is not a prime number");
				flag= false;
				break;
				}
			}
		if(flag == true){
			System.out.println(num+  "  is a prime number");
			}
		}
		else{
			 System.out.println(num+  "  is a Invalid number");
		}
	}
			public static void main(String[] args){
				practiceprime prime1 = new practiceprime();
				prime1.m1(15);
				prime1.m1(-50);
				prime1.m1(17);
				prime1.m1(19);
				prime1.m1(-108);
			}
}