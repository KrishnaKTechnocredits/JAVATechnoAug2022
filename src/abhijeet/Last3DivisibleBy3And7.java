package abhijeet;

class Last3DivisibleBy3And7{
	
	void printLast3DivisibleBy3And7(int startIndex,int endIndex){
		int count=0;
		System.out.println("The last 3 numbers divisible by 3 and 7 from  range "+startIndex+" to "+endIndex+" are as follow");
		for(int index=endIndex;endIndex>=10;index--){
			if(index%3==0&&index%7==0){
				count++;
				System.out.println(index);
			if (count==3)
				break;
			}
		}
	}
	
	public static void main(String[]args){
		new Last3DivisibleBy3And7().printLast3DivisibleBy3And7(10,200);
	}
}