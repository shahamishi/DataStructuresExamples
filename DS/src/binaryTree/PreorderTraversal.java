package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {

	
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
		
		
		printPreorderTraversal(root);
		
	}
	
	public static void printPreorderTraversal(Node root){
		List<String> preorderedList = new ArrayList<String>();
		
		if(root==null){
			return;
		}
		
		Stack<Node> preorderedStack = new Stack<Node>();
		preorderedStack.push(root);
		
		while(!preorderedStack.isEmpty()){
			Node node = preorderedStack.pop();
			preorderedList.add(node.getValue());
			
			if(node.getRight()!=null){
				preorderedStack.push(node.getRight());
			}
			
			if(node.getLeft()!=null){
				preorderedStack.push(node.getLeft());
			}
		}
		
		for(String str:preorderedList){
			System.out.print(str +"->");
		}
	}
	
	
	
}
