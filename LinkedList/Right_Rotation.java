package LinkedList;

/*
  Right rotation by k = left rotation by n-k where n is length of LinkedList
  
  https://www.geeksforgeeks.org/clockwise-rotation-of-linked-list/
 */
public class Right_Rotation {
    static Node head = null;
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	static Node rightShift(Node head,int k)
	{   
		if(head==null)
			return null;
		
        Node end = head;
        Node prev = head;
        int length = 1;
        while( end.next!=null)
        {
        	end = end.next;
        	length++;
        }
        
        if(length==1)
        	return head;
        
        if(k >= length)
			k = k % length;
        
        k = length-k;
        
        while(k-->0)
        {
        	head = head.next;
        	end.next = prev;
        	prev.next = null;
        	
        	end = prev;
        	prev = head;
        }
        
		return head;
	}
	
	public static void main(String[] args) {
	
		Right_Rotation list = new Right_Rotation();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next= new Node(4);
		list.head.next.next.next.next = new Node(5);
		
		int k = 2;

		
		//now for right shift, do the left shifting by (length-k) times
		
		Node head2 = rightShift(head,k);
		
		 Node temp = head2;
	        
	        while(temp.next!=null)
	        {
	        	System.out.print(temp.data+"->");
	        	temp =  temp.next;
	        }
	        System.out.print(temp.data);
		
}

}