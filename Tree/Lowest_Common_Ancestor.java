package Tree;

public class Lowest_Common_Ancestor {

	Node root;
	
	public static Node LCA(Node root, int p, int q)
	{
		if(root==null)
			return null;
		
		if(root.data == p || root.data==q)
		{
			return root;
		}
		
		if(root.data > p && root.data > q)
		{
			return LCA(root.left,p,q);
		}
		
		else if(root.data < p && root.data < q)
		{
			return LCA(root.right,p,q);
		}
		
		return root;
	}

	public static void main(String[] args) {
		
		int n1 = 10, n2 = 14; 
		// TODO Auto-generated method stub
		Lowest_Common_Ancestor tree = new Lowest_Common_Ancestor();
		    tree.root = new Node(20); 
	        tree.root.left = new Node(8); 
	        tree.root.right = new Node(22); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(12); 
	        tree.root.left.right.left = new Node(10); 
	        tree.root.left.right.right = new Node(14);   
	       
	       Node result =  Lowest_Common_Ancestor.LCA(tree.root,n1,n2);
	       System.out.println("LCAs of "+n1+" and "+n2+" is "+result.data);
	       
	       n1 = 14; n2 = 8; 
	       result =  LCA(tree.root,n1,n2);
	       System.out.println("LCAs of "+n1+" and "+n2+" is "+result.data);
	}

}
