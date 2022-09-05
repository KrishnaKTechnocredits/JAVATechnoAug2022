package aditiIngle;
class Assignment_10_Divby3and7{
	void divBy3and7(int startIndex,int endIndex){
		int count =0;
		System.out.println("Last 3 numbers divisible by 3 and 7 are:");
		for (int index=endIndex; index>=startIndex; index--){
			if(index%3==0 && index%7==0){
				System.out.println(index);
				count++;
			}
			if (count==3){
				break;
			}
		}
	}
	public static void main(String[] args){
		Assignment_10_Divby3and7 assignment_10_Divby3and7 = new Assignment_10_Divby3and7();
		assignment_10_Divby3and7.divBy3and7(10,200);
	}
}