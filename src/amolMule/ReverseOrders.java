// Reverse order from 50, numbwe dicisble by 9
package amolMule;
class ReverseOrders{
	
	void reverse(int num){
		int count=0;
		for(int index=num;index>0;index--){
			if(index%9==0){
				System.out.println("Numbers divisible by 9 are -> " 	+index);
				count++;
			}
		}
		System.out.println("Total results are "+count);
	}
	public static void main(String args[])
	{
		ReverseOrders reverseorder= new ReverseOrders();
		reverseorder.reverse(50);
	}
}