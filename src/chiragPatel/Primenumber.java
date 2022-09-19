package chiragPatel;
class Primenumber{
	
	void prime(int num){
		boolean flag =  true;
		
		if (num>0){
			for (int index = 3; index<num/3;index++){
				if(num%index==0){
					flag = false;
					System.out.println(num + " It is not a Prime number");
					break;
				}
			}if(flag == true){
			System.out.println(num + " It is a Prime number");
			}
		}else{
			System.out.println(num + " is an invalid number");
		}
	}
	public static void main(String[] args){
		Primenumber primenumber =  new Primenumber();
		primenumber.prime(15);
		primenumber.prime(17);
		primenumber.prime(-29);
	}

}