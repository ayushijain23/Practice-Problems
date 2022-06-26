package LinkedList;

import java.util.Stack;

public class Reverse_List_K_groups {
        static Node head;
        
	static class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	 public static void printList(Node head)
	 {
		 Node temp = head;
		 
		 while(temp.next!=null)
		 {
			 System.out.print(temp.data+"->");
			 temp = temp.next;
		 }
		 System.out.println(temp.data);
	 }
	 
	 public static Node reverseList(Node head, int k)
	 {
		 Stack<Node> stack = new Stack<>();
		 Node current = head;
		 Node prev = null;
		 
		 
		while(current!=null)
		{
		 int count = 1;
			 Node temp = current; 
		 while(current!=null && count<=k)
		 {
			 stack.push(current);
			 current = current.next;
			 count++;		 
		 }
		 
		 
		 // To be used when only complete k groups are reversed
//		 if(current==null && count<=k)
//		 {
//			 prev.next = temp;
//			 return head;
//		 }
	
		 while( !stack.isEmpty() )
		 {
			 if(prev == null)
			 {
				 prev = stack.peek();
				 head = prev;
				 stack.pop();
			 }
			 
			 else
			 {
				 prev.next = stack.peek();
				 prev = stack.pop();
			 }
			 		 
		 }
		
		 } 
		prev.next = null;
		return head;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int k = 5;	
       Reverse_List_K_groups list = new Reverse_List_K_groups();
       head = new Node(1);
       list.head.next = new Node(2);
       list.head.next.next = new Node(3);
       list.head.next.next.next= new Node(4);
       list.head.next.next.next.next = new Node(5);
       list.head.next.next.next.next.next  = new Node(6);
       list.head.next.next.next.next.next.next = new Node(7);
       printList(list.head);
       
      list.head = reverseList(list.head,k);
       
       printList(list.head);
       
	}

}
