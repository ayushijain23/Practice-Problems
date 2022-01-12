package Tree;

public class Nodes_On_Same_Path {
	Node root;
	

	public static void main(String[] args) {
		
		Nodes_On_Same_Path tree = new Nodes_On_Same_Path();
		
		tree.root = new Node(20); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(22); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(12); 
        tree.root.left.right.left = new Node(10); 
        tree.root.left.right.right = new Node(14);  
	}

}
