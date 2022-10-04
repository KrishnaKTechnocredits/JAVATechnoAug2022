/******Find out frequency of each character from given input using single while loop.****/
//input: String str = "technocreditst";
//output: t->3
//		e->2
//		c->2
//		h->1
//		n->1
//		o->1
//		r->1
//		d->1
//		i->1
/****************************************************************************************/

package manjiri.arrayEx;

public class ArrayEx15 {

	void getFrequencyOfCharacters(String input) {
		input = input.toLowerCase();	
		
		while (input.length()-1 > 0) {
			int originalLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(Character.toString(ch), "");
			int newLength = input.length();
			System.out.println(ch + "->" + (originalLength - newLength));
		}
	}

	public static void main(String[] args) {
		String str = "technocreditst";
		new ArrayEx15().getFrequencyOfCharacters(str);
	}
}
