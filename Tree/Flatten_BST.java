package Tree;

import java.util.ArrayList;
import java.util.List;
/*
imp questions
*/
public class Flatten_BST {
	  Node root;
	  //static List<Integer> list = new ArrayList<>();
	  public static void PreOrderTraversal(Node root)
	  {
		  if(root==null)
			  return;
		  
		  System.out.print(root.data+" ");
		  PreOrderTraversal( root.left);
		  PreOrderTraversal(root.right);
	  }
	  
	  public static void inorder(Node root, List<Integer> listt)
	  {
		  if(root==null)
			  return;
		  
		  inorder(root.left,listt);
		  listt.add(root.data);
		  inorder(root.right,listt);
		  
	  }
	  
	  public static Node increasingBST(Node root)
	  {
		  Node resultNode = new Node(0);
		  Node curr = resultNode;
		  List<Integer> list = new ArrayList<>();
		  inorder(root,list);
		  
		  System.out.println(list);
		  
		  for(int i : list)
		  {
			  Node tempNode = new Node(i);
			  curr.right = tempNode;
			  curr = curr.right;
			  
		  }
		  
		  return resultNode.right;
		  
	  }
	  

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Flatten_BST tree = new Flatten_BST();
		
		tree.root = new Node(1); 
	    tree.root.left = new Node(5); 
	    tree.root.right = new Node(2); 
	    tree.root.left.left = new Node(6); 
	    tree.root.left.right = new Node(4); 
	    tree.root.right.left = new Node(9); 
	    tree.root.right.right = new Node(3);
		
        
        Node result = increasingBST(tree.root);
        
        PreOrderTraversal(result);
        
  
       
	}
	

}
