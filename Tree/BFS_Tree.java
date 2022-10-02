package Tree;
import java.util.Queue;
import java.util.LinkedList;


/*
very important
*/
 
public class BFS_Tree {
	
	 Node root;
	 int avc = 1;
	
	BFS_Tree()
	{
		root = null;
	}
	
	private int Height(Node root)
	{
		if(root==null)
			return 0;
		
		int lheight = Height(root.left);
		int rheight = Height(root.right);
		
		if(lheight > rheight)
			{return lheight + 1;}
		
		else
			{return rheight + 1;}
	}
	
	//by using height, print nodes at each level
	  private void bfs_traversal_byHeight()
	  {
		  int height = Height(root);
		  
		  for( int i = 1; i <= height; i++)
		  {
			  printLevel(root,i);
		  }
		  	  
	  }
	  //to print nodes at given height;
	  private void printLevel(Node root,int height)
	  {
		  if(root==null)
		  {
			  return;
		  }
		  
		  if(height==1)
		  {
			  System.out.print(root.data+" ");
		  }
		  
		  else if(height > 1)
		  {
			  printLevel(root.left, height-1);
			  printLevel(root.right,height-1);
		  }
	  }
	
	
	//queue implementation
	private void bfs_traversal()
	{
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			System.out.print(temp.data+" ");
			
			if(temp.left!=null)
				q.add(temp.left);
			
			if(temp.right!=null)
				q.add(temp.right);
		}
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BFS_Tree tree = new BFS_Tree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.bfs_traversal();
	
		System.out.println();
		tree.bfs_traversal_byHeight();

	}

}
