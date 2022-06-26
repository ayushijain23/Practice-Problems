package array;

import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class TreeExample {
    Node root;

    public static void RootToleafPath(Node root, String sofar, List<String> list) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            sofar = sofar + root.data;
            list.add(sofar);
            return;
        }
        else {
            RootToleafPath(root.left, sofar + root.data, list);
            RootToleafPath(root.right, sofar + root.data, list);
        }
    }

    static int findSum(List<String>list){
        int sum = 0;

        for(String str : list){
            sum = sum + Integer.parseInt(str);
        }
        return sum;
    }

    public static void main(String args[]){
        TreeExample obj = new TreeExample();
        obj.root = new Node(6);
        obj.root.left = new Node(4);
        obj.root.right = new Node(8);
        obj.root.right.right = new Node(9);
        obj.root.left.left = new Node(3);
        obj.root.left.right= new Node(5);

        List<String> list = new ArrayList<>();
        RootToleafPath(obj.root, "", list);

        //iterate the list
        System.out.print(list);
        int sum = findSum(list);

        System.out.print(sum);
    }

}
