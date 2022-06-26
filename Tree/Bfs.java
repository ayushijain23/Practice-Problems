package Tree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

class TreesNode{
    int data;
    TreesNode left;
    TreesNode right;

    TreesNode(int data){
        this.data = data;
        left = right = null;
    }
}

public class Bfs {
    static TreesNode root;

    Bfs(){
        root = null;
    }

    private static void bfs(TreesNode root){
        if(root == null){
            return;
        }

        Queue<TreesNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreesNode temp = queue.poll();
            System.out.print(temp.data+" ");

            if(temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        System.out.println();
    }
    private static int findHeightByBFS(TreesNode node){
        if(node == null)
            return 0;
        int height = 0;
        Queue<TreesNode> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            height++;
            int size = queue.size();
            while(size-- > 0){
                TreesNode temp = queue.poll();
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
       return height;
    }
    public static void main(String args[]){
        root = new TreesNode(1);
        root.left = new TreesNode(2);
        root.right = new TreesNode(3);
        root.left.left = new TreesNode(4);
        root.left.right = new TreesNode(5);

        bfs(root);
        int height = findHeightByBFS(root);
        System.out.println("Height-> "+height);
    }



}
