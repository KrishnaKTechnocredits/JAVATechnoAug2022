package gauravSahu;

class Prime{
	
	void check(int num){
		boolean flag = true;
		
		if(num>1){
			for(int a=2;a<=num/2;a++){
				if(num%a==0){
					flag = false;
					System.out.println(num + "Not Prime number");
					break;
				}
			}if(flag == true){
					System.out.println(num + "Prime number");
			}
		}else{
			System.out.println("Invalid number");
		}
	}
	
	public static void main(String [] a){
		Prime prime = new Prime();
		prime.check(15);
		prime.check(23);
		prime.check(15);
		prime.check(0);
	}	
}