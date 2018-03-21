package binaryTree;

public class CountingTotalNodes {

	public static void main(String[] args) {
		Node n= new Node("1");
		Node left = new Node("2");
		left.setLeft(new Node("4"));
	
		Node right= new Node("3");
		right.setRight(new Node("5"));
		
		n.setLeft(left);
		n.setRight(right);
		
		
		System.out.println(new CountingTotalNodes().nodes(n));
	}

	private int nodes(Node current) {   
		  // if it's null, it doesn't exist, return 0 
		  if (current == null) return 0;
		  // count myself + my left child + my right child
		  return 1 + nodes(current.getLeft()) + nodes(current.getRight());
		}
}
