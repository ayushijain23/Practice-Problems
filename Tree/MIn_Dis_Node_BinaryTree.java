package Tree;

/*
https://www.geeksforgeeks.org/find-distance-between-two-nodes-of-a-binary-tree/
 */
public class MIn_Dis_Node_BinaryTree {
    Node root ;
    public static Node findLCA(Node root, int a , int b){
        if(root == null){
            return null;
        }
        if(root.data == a || root.data == b){
            return root;
        }
        Node leftlca = findLCA(root.left, a, b);
        Node rightlca = findLCA(root.right, a, b);

        if(leftlca != null && rightlca != null){
            return root;
        }
        else if(leftlca != null){
            return leftlca;
        }
        else if( rightlca != null)
            return rightlca;
        else
            return null;
    }

    public static int findLevel(Node lca, int a, int level)
    {
        if(lca == null){
            return -1;
        }
        if(lca.data == a){
            return level;
        }
        int left = findLevel(lca.left, a, level + 1);
        if(left == -1){
            return findLevel(lca.right, a, level + 1);
        }
        return left;
    }
    public static int findDist(Node root, int a, int b) {
        Node lca = findLCA(root, a, b);
        int firstDis = findLevel(lca, a, 0);
        int secondDis = findLevel(lca, b, 0);

        return firstDis + secondDis;
    }
    public static void main(String[] args) {
        MIn_Dis_Node_BinaryTree tree = new MIn_Dis_Node_BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(14);
        tree.root.left.right = new Node(1);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(4);

        int dis = findDist(tree.root, 4, 22);
        System.out.println(dis);
    }

}
