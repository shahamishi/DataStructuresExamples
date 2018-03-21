package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {


	
	public static void main(String[] args) {
		Node root = new Node("A");
		Node left1 = new Node("B");
		Node right1 = new Node("C");
		
		root.setLeft(left1);
		root.setRight(right1);
		
		Node left21 = new Node("D");
		Node right21 = new Node("E");
		
		left1.setLeft(left21);
		left1.setRight(right21);
		
		Node left22 = new Node("F");
		Node right22 = new Node("G");
		
		right1.setLeft(left22);
		right1.setRight(right22);
		
		List<String> postOrderTraversalList = new ArrayList<String>();
		printPostorderTraversal(root,postOrderTraversalList);
		
	}
	
	public static void printPostorderTraversal(Node node,List<String> postOrderTraversalList){
	
		//if(root.right)
	}
	
	
	


}
