package LinkedList;

import LinkedList.LinkedListClass.Node;

public class Merge_Two_Lists {

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
	
	private static Node mergeTwoListsByRecursion(Node head1, Node head2)
	{
		if( head1==null)
		{
			return head2;
		}
		if( head2==null)
		{
			return head1;
		}
		if(head1.data < head2.data)
		{
			head1.next = mergeTwoListsByRecursion(head1.next, head2);
			return head1;
		}
		else 
		{
			head2.next = mergeTwoListsByRecursion(head2.next, head1);
			return head2;
		}
	}
	
	private static void mergeTwoLists(Node headOne, Node headTwo)
	{
		Node curr1 = headOne;
		Node head1 = headOne;
		Node head2 = headTwo;
		Node next1;
		Node next2;
		
		while(head1 !=null && head2!=null)
		{
			next1 = head1.next;
		    next2 = head2.next;
		    
			head2.next = next1;
			head1.next = head2;
			
			head1 = next1;
			head2 = next2;
			
		}
	       
	       while(curr1.next!=null)
	       {
	    	   System.out.print(curr1.data+"->");
	    	   curr1 = curr1.next;
	       }
	       System.out.print(curr1.data+"->");
	       
	      
	       Node curr2 = head2;
	       while(curr2.next!=null)
	       {
	    	   System.out.print(curr2.data+"->");
	    	   curr2 = curr2.next;
	       }
	       
	       System.out.println(curr2.data);
	       
	      
		
	}
	public static void main(String[] args) {
		 Merge_Two_Lists list = new Merge_Two_Lists();
	       list.head = new Node(1);
	       list.head.next = new Node(2);
	       list.head.next.next = new Node(3);
	       list.head.next.next.next = new Node(6);
//	       list.head.next.next.next.next = new Node(5);
	     
	       
	       Merge_Two_Lists list2 = new Merge_Two_Lists();
	       list2.head = new Node(6);
	       list2.head.next = new Node(7);
	       list2.head.next.next = new Node(8);
	       list2.head.next.next.next = new Node(9);
	       list2.head.next.next.next.next = new Node(10);
	       list2.head.next.next.next.next.next = new Node(15);
	      
	       
	       mergeTwoLists( list.head, list2.head);
           
	    // list.head = mergeTwoListsByRecursion( list.head, list2.head);
//
//	     while( list.head!=null)
//	     {
//	    	 System.out.print(list.head.data+"->");
//	    	 list.head =list.head.next;
//	     }
	      
	}

}
