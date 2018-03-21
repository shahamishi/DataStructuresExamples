package binaryTree;

public class HeightOfTheTree {

	public static void main(String[] args) {
		Node root  = Node.getTree();
		int maxDepth = getMaxDepth(root);
		System.out.println("The max depth of the tree is: "+ maxDepth);
	}

	private static int getMaxDepth(Node node) {
		if(node==null)
			return 0;
		int lDepth = getMaxDepth(node.left);
		int rDepth = getMaxDepth(node.right);
		
		return 1 + Math.max(lDepth, rDepth);
	}
	

}
