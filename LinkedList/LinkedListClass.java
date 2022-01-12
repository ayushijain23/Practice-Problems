package LinkedList;




public class LinkedListClass {
	  Node head;
	
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
       LinkedListClass list = new LinkedListClass();
       list.head = new Node(1);
       list.head.next = new Node(2);
       list.head.next.next = new Node(3);
       list.head.next.next.next = new Node(4);
       list.head.next.next.next.next = new Node(5);
      
       
       Node temp = list.head;
       
       while(temp.next!=null)
       {
    	   System.out.print(temp.data+"->");
    	   temp = temp.next;
       }
       
       System.out.println(temp.data);
	}

}
