package binaryTree;

public class TraversalWithRecursion {

	public static void main(String[] args) {
		Node node = Node.getTree();
		printPreOrder(node);
		System.out.println(" ");
		printPostOrder(node);
		System.out.println(" ");
		printInOrder(node);
		
	}

	public static void printPreOrder(Node node){
		if(node==null){
			return;
		}
		System.out.print(" "+node.getVal());
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
	public static void printPostOrder(Node node){
		if(node==null){
			return;
		}
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(" "+node.getVal());
		
	}
	public static void printInOrder(Node node){
		if(node==null){
			return;
		}
		printInOrder(node.left);
		System.out.print(" "+node.getVal());
		printInOrder(node.right);
		
		
	}
}
