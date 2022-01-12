package LinkedList;

//Add numbers present in linkedlist
import LinkedList.Merge_Two_Lists.Node;

public class Add_Two_Numbers_In_List {
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
	
	
	private static Node addTwoNumbers(Node l1, Node l2) {
        Node res = new Node(0);
        Node result = res;
        int carry = 0;
        
        while(l1 !=null || l2!=null)
        {
            int x = (l1!=null) ? l1.data: 0;
            int y = (l2!=null) ? l2.data : 0;
            int sum = x + y + carry;           
            Node temp = new Node(sum%10);
            res.next = temp;
            res = res.next;
            carry = sum/10;
            
            if(l1!=null)
            {
                l1 = l1.next;
            }
            if( l2!=null)
            {
                l2 = l2.next;
            }
        }
        
        if( carry>0)
        {
            Node temp = new Node(carry);
            res.next = temp;
        }
        return result.next;
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
	
	
	public static void main(String[] args) {
		Add_Two_Numbers_In_List list = new Add_Two_Numbers_In_List();
	       list.head = new Node(1);
	       list.head.next = new Node(2);
	       list.head.next.next = new Node(3);
	       list.head.next.next.next = new Node(6);
	     
	       
	       Add_Two_Numbers_In_List list2 = new Add_Two_Numbers_In_List();
	       list2.head = new Node(6);
	       list2.head.next = new Node(7);
	       list2.head.next.next = new Node(8);
	  
	       
	       list.head = addTwoNumbers(list.head,list2.head);
	       
	       printList(list.head);
	      
	}

}
