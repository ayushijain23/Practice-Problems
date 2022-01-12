package LinkedList;

import LinkedList.Left_Rotation.Node;

public class reverseList {
	static Node head = null;
	static class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	private static Node reverse(Node head)
	{
		Node curr = head;
		Node prev = null;
		Node nextNode = null;
		
		
		while(curr != null)
		{
			nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		
		return prev;
	}
	
	
	public static Node reverseByRecursion(Node head)
	{
		if( head == null || head.next==null)
			return head;
		
		Node rest = reverseByRecursion(head.next);
		
		head.next.next = head;
		head.next = null;
		
		return rest;
		
	}
	
	private static void printList(Node head)
	{
	        
	        while(head!=null)
	        {
	        	System.out.print(head.data+" ");
	        	head= head.next;
	        }
	        
	        System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 reverseList  L1 = new reverseList(); 
	       int k = 8;
	        L1.head = new Node(1); 
	        L1.head.next = new Node(2); 
	        L1.head.next.next = new Node(3); 
	        L1.head.next.next.next = new Node(4); 
	        L1.head.next.next.next.next = new Node(5);
	        L1.head.next.next.next.next.next = new Node(6);
	        
	        printList(head);
	   	        
	       head = reverse(head);
	        
	        //by recursion
	       // head = reverseByRecursion(head);
	        
	        printList(head);	
		
	}

}
