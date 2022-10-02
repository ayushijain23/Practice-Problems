package Tree;

public class Boundary_Traversal {
    Node root = null;

    public static void main(String[] args) {
        Boundary_Traversal tree = new Boundary_Traversal();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
     //   tree.printBoundary(tree.root);
    }
}
