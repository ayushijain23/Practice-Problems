package Tree;

/*
 * Case=I  Full complete binary tree, every newnode has left and right child and all levels are filled
 * 
  Constructed binary tree is 
                 10 
               /    \ 
             8        2 
           /           \ 
          3             100 
        
nextRight of 10 is null
nextRight of 8 is 2
nextRight of 2 is null
nextRight of 3 is 100
nextRight of 100 is null
 */
public class NextPointer2 {

	newnode root;
	
	
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
	
	public  newnode findnextNode(newnode r)
	{
		newnode temp = r.nextRight;
		
		while(temp!=null)
		{
			if(temp.left!=null)
				return temp.left;
			
			if(temp.right!=null)
				return temp.right;
			temp = temp.nextRight;
		}
		
		return null;
		
	}
	
	public void connect(newnode root)
	{
		if(root==null)
			return;
		
		newnode p = root;
		p.nextRight = null;
		
		while(p!=null)
		{
			newnode q = p;
			
			while(q!=null)
			{
				if(q.left!=null)
				{
					if(q.right!=null)
					{
						q.left.nextRight = q.right;
					}
					
					else
					{
						q.left.nextRight = findnextNode(q);
					}
				}
				
				if(q.right!=null)
				{
					q.right.nextRight = findnextNode(q);
				}
				
				q = q.nextRight;
			}
			
			if(p.left!=null)
				p = p.left;
			else if(p.right!=null)
				p = p.right;
			else
				p=p.nextRight;
			
		}
	}
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextPointer2 tree = new NextPointer2();
	       tree.root = new newnode(10); 
	       tree.root.left = new newnode(8); 
	       tree.root.right = new newnode(2); 
	       tree.root.left.left = new newnode(3);
	       tree.root.right.right = new newnode(100);
	       
	       tree.connect(tree.root); 
	       
	       printTree(tree.root);
	}

}
