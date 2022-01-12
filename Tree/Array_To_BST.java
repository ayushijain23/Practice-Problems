package Tree;

/*
 *  convert Sorted array into BST
 *  
 *   Solution - find mid of array and store it into root of BST.
 *    recursivley find left and right child of node with arr(start,mid-1) & arr(mid+1,end)
 */

//class Node
//{
//	int data;
//	Node left;
//	Node right;
//	
//	Node(int data)
//	{
//		this.data = data;
//		left = right = null;
//	}
//}

public class Array_To_BST {
	Node root;
	
	private static void preOrder(Node root)
	{
		if(root==null)
			return;
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	private static Node convert(int arr[], int low, int high)
	{
		if(low>high)
		{
			return null;
		}
		
		int mid = (low+high)/2;
		
		Node node = new Node(arr[mid]);
		
		node.left = convert(arr,low,mid-1);
		node.right = convert(arr,mid+1,high);
			
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {1,2,3,4,5};
         int arr2[] = {1,2,3,4};
         Array_To_BST tree = new Array_To_BST();
         
         tree.root = convert(arr,0,arr.length-1);
         preOrder(tree.root);
         
         System.out.println();
         
         tree.root = convert(arr2,0,arr2.length-1);
         preOrder(tree.root);
	}

}
