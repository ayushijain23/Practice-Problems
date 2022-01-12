package Tree;


/*
 * 
 * https://www.geeksforgeeks.org/write-an-efficient-c-function-to-convert-a-tree-into-its-mirror-tree/
 * Convert a Binary tree into its mirror tree.
 * 
 * 
 *            1                                  1
 *          /  \                                /  \
           3    2               --->           2    3
               / \                            / \
              5   4                          4   5 
              
 */              
 
public class Mirror_tree {
	
	Node root;
	
    public static void inOrder(Node root)
    {
	if(root==null)
		return;
	
	inOrder(root.left);
	System.out.print(root.data+" ");
	inOrder(root.right);
    }

    public static void mirror(Node root)
    {
	findMirror(root);
    }

    public static Node findMirror(Node root)
    {
	if(root == null)
		return null;
	
	Node leftNode =  findMirror(root.left);
	Node rightNode = findMirror(root.right);
	
	root.left = rightNode;
	root.right = leftNode;
	
	return root;
    }
	
	
	public static void main(String[] args) {
		Mirror_tree tree = new Mirror_tree();
		tree.root = new Node(1);
		tree.root.left = new Node(3);
		tree.root.right = new Node(2);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);
		
		inOrder(tree.root);
		System.out.println();
		
		mirror(tree.root);
	    inOrder(tree.root);

	}

}
