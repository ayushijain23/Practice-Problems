package LinkedList;
/*

*/
public class Left_Rotation {
static Node head1;
	
	static class Node { 
		  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
}
	
	public static Node leftRotate(Node head, int k)
	{
        Node res_head = head;
		Node end = head;
		Node prev = head;
		while(end.next!=null)
			{end = end.next;}
		
		
		while(k > 0) {
	    
		res_head = res_head.next;
		end.next = prev;
		prev.next = null;	
		
		end = prev;
		prev = res_head;
		k--;
	}
		return res_head;
	}
	
	public static void main(String[] args) {
	       int k = 2;
	        head1 = new Node(1);
	        head1.next = new Node(2);
	        head1.next.next = new Node(3);
	        head1.next.next.next = new Node(4);
	        head1.next.next.next.next = new Node(5);
	        
	        Node temp = head1;
	        int length = 1;
	        while(temp.next!=null)
	        {
	        	System.out.print(temp.data+"->");
	        	temp =  temp.next;
	        	length++;
	        }
	        
	        System.out.println(temp.data);
	       //    System.out.println(length);
	        
	        if(k >= length)
	           k = k % length;
	           
	        Node head2 = leftRotate(head1, k);
	        temp = head2;
	        
	        while(temp.next!=null)
	        {
	        	System.out.print(temp.data+"->");
	        	temp =  temp.next;
	        }
	        System.out.print(temp.data);

	        
	        
	}

}
