package Tree;

public class Path_Sum {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorderTraversal(TreeNode root){
        if(root == null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.val+", ");
        inorderTraversal(root.right);
    }
    public static TreeNode insert(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }
        else if(root.val < val){
            root.right = insert(root.right, val);
        }
        else if(root.val > val){
            root.left = insert(root.left, val);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 20);
        insert(root, 10);
        insert(root, 5);
        insert(root, 15);
        insert(root, 30);
        insert(root, 25);
        insert(root, 35);

        inorderTraversal(root);

    }
}
