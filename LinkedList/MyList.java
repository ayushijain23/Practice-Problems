package LinkedList;

import java.util.Scanner;

public class MyList {
    static ListNode head;
    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            next = null;
        }
    }

    static ListNode pushElements(ListNode head){
        System.out.println("Enter size of list");
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        ListNode curr = new ListNode(-1);
        ListNode res = curr;
        for(int i = 0; i < size ; i++){
            int data = kb.nextInt();
            ListNode newNode = new ListNode(data);
            newNode.next = null;
            curr.next = newNode;
            curr = curr.next;
        }

        return res.next;
    }
    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr.next != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
    public static ListNode leftRotate(ListNode head, int k){
        ListNode prev = head;
        ListNode end = head;
        ListNode temp = head;

        while(end.next != null){
            end = end.next;
        }
        while(k-- > 0){
            end.next = prev;
            temp = temp.next;
            prev.next = null;

            end = prev;
            prev = temp;
        }
      return temp;
    }
    public static void main(String args[]){
        head = pushElements(head);
        printList(head);

        System.out.println("Enter k value for rotation:");
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt();
        head = leftRotate(head, k);
        printList(head);
    }
}
