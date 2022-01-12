package Sorting;
/////////
public class insertionSort_LinkedList {
	node head;
	node sorted;
	
	class node{
		int data;
		node next;
		
		node(int data)
		{
			this.data = data;
		}
	}
	
	void push(int data) {
		node newnode = new node(data);
		newnode.next = head;
		head = newnode;
	}
	
	static void printList(node head) {
		
		while(head.next!=null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
		System.out.println(head.data);
		
	}
	
	public node sortList(node head) {
		
		node curr = head;
		sorted = null;
		while(curr!=null)
		{
			node nextNode = curr.next;
			
			insertNode(curr);
			
			curr = nextNode;
		}
		
	   return sorted;
	}
	 
	 public void insertNode(node newnode)
	 {
		 if(sorted == null || sorted.data >= newnode.data)
		 {
			 newnode.next = sorted;
			 sorted = newnode;
		 }
		 
		 else {
			 node currNode = sorted;
			 while( currNode.next!=null && currNode.next.data < newnode.data )
			 {
				 currNode = currNode.next;
			 }
				 				 
		  newnode.next = currNode.next;
	      currNode.next = newnode;
		 }
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        insertionSort_LinkedList list = new insertionSort_LinkedList();
        list.push(5);
        list.push(20);
        list.push(4);
        list.push(-1);
        list.push(30);
        
        printList(list.head);
        node head = list.sortList(list.head);
        printList(head);
	}

}
