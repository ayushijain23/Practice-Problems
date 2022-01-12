package Tree;


/*
 * Check if given tree is bst or not;
 * 
 * https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
 * 
 *
 *
 *
 */
public class Valid_BST {

	Node root;
	private static boolean isBST(Node root, long min, long max)
	{
		if(root == null)
			return true;
		
		if(root.data <= min || root.data >=max)
			return false;
		
		return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
	}
	
	
	private static boolean isValidBST(Node root) {
	
	  return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}
	
	
	public static void main(String[] args) {
		
      Valid_BST tree = new Valid_BST();
      tree.root = new Node(2);
      tree.root.left = new Node(1);
      tree.root.right = new Node(3);
      
      System.out.println(isValidBST(tree.root));
      
      
      //second Tree
      tree.root = new Node(5);
      tree.root.left = new Node(1);
      tree.root.right = new Node(4);
      tree.root.left.left = null;
      tree.root.left.right= null;
      tree.root.right.left = new Node(3);
      tree.root.right.right = new Node(6);
      

      System.out.println(isValidBST(tree.root));
	}

}
