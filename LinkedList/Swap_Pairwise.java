package LinkedList;

import LinkedList.LinkedListClass.Node;

public class Swap_Pairwise {
	 Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
		
	}
	
	private static void printList(Node head)
	{
	        
	        while(head.next!=null)
	        {
	        	System.out.print(head.data+"->");
	        	head= head.next;
	        }
	        System.out.print(head.data);
	        System.out.println();
	}
	
	private static Node swapList(Node head)
	{
		if(head == null || head.next==null)
		{
			return head;
		}
		
		Node prev = head;
		Node curr = head.next;
		head = curr;
		
		while(true)
		{
			Node nextNode = curr.next;
			curr.next = prev;
			
			if(nextNode == null || nextNode.next == null)
			{
				prev.next = nextNode;
				break;
			}
			
			prev.next = nextNode.next;
			prev = nextNode;
			curr = prev.next;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		
		   Swap_Pairwise list = new Swap_Pairwise();
	       list.head = new Node(1);
	       list.head.next = new Node(2);
	       list.head.next.next = new Node(3);
	       list.head.next.next.next = new Node(4);
	       list.head.next.next.next.next = new Node(5);
	      // list.head.next.next.next.next.next = new Node(6);

	       Node inputHead = list.head;
	       System.out.println("Input List:");
	       printList(inputHead);
	       
	       //fun to swap pair of nodes
	       Node newHead = swapList(list.head);
	       
	       System.out.println("Output List:");
	       printList(newHead);

	}

}
