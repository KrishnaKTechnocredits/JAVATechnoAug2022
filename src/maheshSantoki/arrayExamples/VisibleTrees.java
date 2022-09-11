package maheshSantoki.arrayExamples;

public class VisibleTrees {
	/* Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]
	 * input : {3,7,5} output : 2
	 * input : {3,5,11,9,10,13} output : 4*/
	int countOfTrees(int[] tree) {
		int maxTree=0;
		int count=0;
		for(int i=0;i<tree.length;i++) {
			if(maxTree<tree[i]) {
				maxTree=tree[i];
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		VisibleTrees  visibletrees=new VisibleTrees();
		int[] input1={3,7,5};
		int ans1=visibletrees.countOfTrees(input1);
		 System.out.println("Visible trees are : "+ans1);
		 int[] input2 ={3,5,11,9,10,13} ;
		 int ans2=visibletrees.countOfTrees(input2);
		 System.out.println("Visible trees are : "+ans2);
	}
}
