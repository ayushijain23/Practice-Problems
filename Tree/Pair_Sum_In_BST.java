package Tree;

import java.util.ArrayList;

/*

*/

public class Pair_Sum_In_BST {

	Node root;
	
	private static ArrayList<Integer> treeToList(Node root, ArrayList<Integer> arr)
	{
		if(root == null)
		{
			return arr;
		}
		
		treeToList(root.left,arr);
		arr.add(root.data);
		treeToList(root.right,arr);
		
		return arr;
	}
	private static boolean isSum(Node root, int sum)
	{
		   ArrayList<Integer> arr = new ArrayList<>();
		   
		   arr = treeToList(root, arr);
		   
		   int end = arr.size()-1;
		   int start = 0;
		   
		   while( start < end )
		   {
			   if( arr.get(start) + arr.get(end) == sum)
			   {
				   return true;
			   }
			   
			   else if(arr.get(start) + arr.get(end) < sum)
			   {
				   start++;
			   }
			   else {
				   end--;
			   }
		   }
		return false;
	}
	public static void main(String[] args) {
	Pair_Sum_In_BST tree = new Pair_Sum_In_BST();
		    tree.root = new Node(20); 
	        tree.root.left = new Node(8); 
	        tree.root.right = new Node(22); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(12); 
	        tree.root.left.right.left = new Node(10); 
	        tree.root.left.right.right = new Node(14);
	        
	   int sum = 34;
	 	
	   System.out.println(isSum(tree.root,sum));
	   

	}

}
