package aishwaryaBirajdar;


class Even{
	int sum=0;
	void evenDisplay(int num){
		System.out.println("Even Number :");
		for(int i=0; i<=num; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	void oddDisplay(int num){
		System.out.println("Odd Number :");
		for(int i=0; i<=20; i++){
			if(i%2==1){
				System.out.println(i);
			}
		}
	}
	void sumDisplay(int startnum, int endnum){
		System.out.println("Sum of number between "+startnum+" to "+endnum+" : ");
		for(int i=startnum; i<=endnum; i++){
			sum = sum + i;
		}
		System.out.println(sum);
	}
	void displayNineTable(){
		System.out.println("Nine Table in Decreasing Order: ");
		for(int num=100; num>0;num--){
			if(num%9==0){
				System.out.println(num);
			}
		}
	}
	public static void main(String[] args){
		Even even = new Even();
		even.evenDisplay(13);
		System.out.println(" ");
		even.oddDisplay(20);
		System.out.println(" ");
		even.sumDisplay(1, 27);
		System.out.println(" ");
		even.displayNineTable();
	}
}