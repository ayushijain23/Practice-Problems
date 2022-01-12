package LinkedList;

import Tree.Node;

class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class LL_To_BST {
	 static Node head;
	
		Node root;
		
		private static void preOrder(TreeNode root)
		{
			if(root==null)
				return;
			
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
		private static Node findNode(Node node1, int count)
		{
			Node temp = node1;
			while(count-->0 )
			{
				temp = temp.next;
			}
			
			return temp;
		}
		
		private static TreeNode convertIntoBST(Node head, int low, int len)
		{
			
			if(low>len)
				return null;
			
			int mid = (low+len)/2;
			
			Node midNode = findNode(head,mid);
			
			//System.out.println(midNode.data);
			
			TreeNode root = new TreeNode(midNode.data);
			
			
			root.left = convertIntoBST(head,low,mid-1);
			root.right = convertIntoBST(head, mid+1, len);
			
			
			return root;
		}
		
		
	static class Node{
		int data;
		Node next;
		
		Node( int data)
		{
			this.data = data;
			next = null;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //     LL_To_BST list = new LL_To_BST();
       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);
       Node temp = head;
       
       while(temp.next!=null)
       {
    	   System.out.print(temp.data+"->");
    	   temp = temp.next;
       }
       
       System.out.println(temp.data);
       
       TreeNode root = convertIntoBST(head,0,4);
       preOrder(root);
	}

}

