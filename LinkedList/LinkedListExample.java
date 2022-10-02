package LinkedList;

public class LinkedListExample{
    static Node head = null;

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void push(int data){
        if(head == null){
            head = new Node(data);
        }

        else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public static Node rotateList(Node head, int k){
        if(k == 0)
            return head;

        Node temp = head;
        int len = 1;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }

        k = k % len;
        k = len - k;

        Node end = temp;
        Node prev = head;
        Node nextNode = head;

        while(k--> 0){
            nextNode = nextNode.next;
            end.next = prev;
            prev.next = null;

            end = prev;
            prev = nextNode;

        }
        return nextNode;
    }

    public static void main(String args[]){
        push(5);
        push(4);
        push(3);
        push(2);
        push(1);

        int k =  2;
        Node rotated = rotateList(head, k);
        while(rotated != null){
            System.out.print(rotated.data+"->");
            rotated = rotated.next;
        }
    }
}
