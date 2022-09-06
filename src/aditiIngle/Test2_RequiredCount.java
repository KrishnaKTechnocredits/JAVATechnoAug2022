package aditiIngle;
class Test2_RequiredCount{
int sum =0;
void findRequiredNumber(int target){
	int count=0;
	int num=1;
	while(sum<=target){
		sum=sum+num;
		count++;
		num++;
	}
	System.out.println(count);
}
	public static void main(String[] args){
		Test2_RequiredCount test2 = new Test2_RequiredCount();
		test2.findRequiredNumber(50);
		Test2_RequiredCount test = new Test2_RequiredCount();
		test.findRequiredNumber(17);
	}
}