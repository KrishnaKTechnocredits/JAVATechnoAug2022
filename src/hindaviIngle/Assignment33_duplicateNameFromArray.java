/*
 * program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc
 */
package hindaviIngle;

public class Assignment33_duplicateNameFromArray {

	void duplicateString(String[] strArry) {
		for(int i=0;i<strArry.length;i++) {
			if(!strArry[i].equals("")) {
			int count=0;
			String str1=strArry[i].toLowerCase();
			for(int j=i+1;j<strArry.length;j++) {
			String str2=strArry[j].toLowerCase();
				if(str1.equals(str2)&&i!=j) {
					count++;
					strArry[j]="";				
				}
			}
			if(count>0) {
				System.out.println(strArry[i]);
			}			
		}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment33_duplicateNameFromArray a33=new Assignment33_duplicateNameFromArray();
		String[] strArry={"Hi","HELLO","Techno","Globant","ptc","Ptc","Hello"};
		a33.duplicateString(strArry);
	}

}
