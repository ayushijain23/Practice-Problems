package Tree;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class DFS_Tree {
	
	TreeNode root;
	
	DFS_Tree()
	{
		root= null;
	}
	
	private void preOrder(TreeNode root)
	{
		if(root==null)
			return;
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	private void inOrder(TreeNode root)
	{
		if(root==null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	private void findEle(TreeNode root)
	{
		if(root==null)
			return;
		
		inOrder(root.left);
		
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	
	private void postOrder(TreeNode root)
	{
		if(root==null)
			return;
		
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS_Tree tree = new DFS_Tree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
//		tree.root.right.left = new TreeNode(6);
//		tree.root.right.right = new TreeNode(7);
		
		tree.preOrder(tree.root);
		System.out.println();
		tree.inOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
		
		//findEle(tree.root);
		
	}

}
