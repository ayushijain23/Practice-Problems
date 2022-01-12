package Tree;

import java.util.LinkedList;
import java.util.Queue;
/****

***/

public class Height_BFS {
	Node root;
   
	public static int findHeight(Node root)
	{
		if(root==null)
			return 0;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		int level = 0;
		while(!queue.isEmpty())
		{
			level++;
			int size = queue.size();
			while(size-->0)
			{
				Node temp = queue.poll();
				
				if(temp.left!=null)
				{
					queue.add(temp.left);
				}
				
				if(temp.right!=null)
				{
					queue.add(temp.right);
				}
			}
		}
		return level;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Height_BFS tree = new Height_BFS();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);
        
        int height = findHeight(tree.root);
        System.out.println(height);
		
	}

}
