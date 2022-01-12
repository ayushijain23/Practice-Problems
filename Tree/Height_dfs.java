package Tree;


class TreeNodeChar{
	char ch;
	TreeNodeChar left;
	TreeNodeChar right;
	
	
	TreeNodeChar(char ch)
	{
		this.ch = ch;
		left = right = null;
	}	
	
}

public class Height_dfs {
	
	TreeNodeChar root;
	
	public int heightOfTree(TreeNodeChar root)
	{
		if(root==null)
			return 0;
		
		int leftHeight =  heightOfTree(root.left);
		int rightHeight = heightOfTree(root.right);
		
		if(leftHeight > rightHeight)
		{
			return leftHeight + 1;
		}
		
		else
		{
			return rightHeight + 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr = {'a','b','c','d'};
		Height_dfs tree = new Height_dfs();
        tree.root = new TreeNodeChar('P');
        tree.root.left = new TreeNodeChar('B');
        tree.root.left.left = new TreeNodeChar('S');
        tree.root.right = new TreeNodeChar('T');
        tree.root.right.left = new TreeNodeChar('Q');
        tree.root.right.right = new TreeNodeChar('Z');
        tree.root.right.right.right = new TreeNodeChar('O');
        
        System.out.println(tree.heightOfTree(tree.root));
	}

}
