/*
Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati 
 */

package swapnilMaheshwari.StringPrograms.Assignment25;

public class NonRepetatedWord {
	
	void printNonRepetatedword (String input) {
		boolean flag=true;
		input=input.toLowerCase();
		String[] str=input.split(" ");
		for(int i=0; i<str.length;i++)
		{
			flag=true;
			for (int j=0;j<str.length;j++) {
				
				if (str[i].equals(str[j])&& i!=j)
				{
					flag=false;
					break;
				}

			}
			if (flag==true)
				System.out.println(str[i]);
			
		}
		
	}
	public static void main(String[] args) {
		String inp="Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
		new NonRepetatedWord().printNonRepetatedword(inp);
	}

}
