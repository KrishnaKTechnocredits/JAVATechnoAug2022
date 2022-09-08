package vibhaS;

public class Assignment16 {
	
	int getLengthOfString(String str) {
		int count=0;
		for(int index=0;index<str.length();index++){
			count++;
		}
		return count;
	}
	
	char getCharOfString(String str) {
		int index;
		if(str.length()%2==0){
			index=str.length()/2-1;
		}else{
			index=str.length()/2;
		}
		return str.charAt(index);
	}
	
	public static void main(String[] args) {
		Assignment16 assignment16=new Assignment16();
		int ans=assignment16.getLengthOfString("TechnoCredits");
		System.out.println("ansLength Of String is => "+ans);
		System.out.println("");
		char ans1=assignment16.getCharOfString("Maulik");
		System.out.println("Middle char of Maulik is  => "+ans1);
		char ans2=assignment16.getCharOfString("TechnoCredits");
		System.out.println("Middle char Of TechnoCredits is => "+ans2);
	}
}
