package Tree;

/*
 * Case=I  Full complete binary tree, every newnode has left and right child and all levels are filled
 * 
  Constructed binary tree is 
                 10 
               /    \ 
             8        2 
           /  \     /   \ 
         3     9    90   100 
        
nextRight of 10 is null
nextRight of 8 is 2
nextRight of 2 is null
nextRight of 3 is 9
nextRight of 9 is 90
nextRight of 90 is 100
nextRight of 100 is null
 */

class newnode
{ 
    int data; 
    newnode left, right, nextRight; 
   
 newnode(int item)  
    { 
        data = item; 
        left = right = nextRight = null; 
    } 
} 

public class NextPointer {
	
	newnode root;
	
	public static void connectNext(newnode root)
	{
		if(root==null)
			return;
		
		if(root.left!=null)
		{
			root.left.nextRight = root.right;
		}
		
		if(root.right!=null)
		{
			if(root.nextRight!=null)
			{
				root.right.nextRight = root.nextRight.left;
			}
			else
				root.right.nextRight=null;
		}
		
		connectNext(root.left);
		connectNext(root.right);
	}
	
	public void connect(newnode root)
	{
		if(root==null)
			return ;
		
		connectNext(root);
	}
	
	public static void printTree(newnode root)
	{  
		if(root==null)
		return;
	
		if(root.nextRight!=null)
			System.out.println("Next of "+root.data+" is "+root.nextRight.data);
		
		else
			System.out.println("Next of "+root.data+" is null");
		
		printTree(root.left);
		printTree(root.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       NextPointer tree = new NextPointer();
       tree.root = new newnode(10); 
       tree.root.left = new newnode(8); 
       tree.root.right = new newnode(2); 
       tree.root.left.left = new newnode(3);
       tree.root.left.right = new newnode(9); 
       tree.root.right.left = new newnode(90);
       tree.root.right.right = new newnode(100);
       
       tree.connect(tree.root); 
       
       printTree(tree.root);
       
	}

}
