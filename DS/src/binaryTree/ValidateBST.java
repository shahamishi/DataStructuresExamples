package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class ValidateBST {

	public static void main(String[] args) {
		Node node = Node.getTree();
		boolean isValidBST = validateBST(node);
		System.out.println("Tree 1 is valid BST ?: "+isValidBST);
		
		Node node1 = Node.getTree();
		node1.setLeft(new Node(10,null,null));
	    isValidBST = validateBST(node1);
		System.out.println("Tree 2 is valid BST ?: "+isValidBST);
	}
	
	private static boolean validateBST(Node node){
		List<Integer> list = new ArrayList<Integer>();
		inOrderTraversal(node, list);
		for(int i=1;i<list.size();i++){
			if(list.get(i)<list.get(i-1)){
				return false;
			}
		}
		return true;
	}
	
	private static void inOrderTraversal(Node node,List<Integer> values){
		if(node==null){
			return;
		}
		inOrderTraversal(node.getLeft(), values);
		values.add(node.getVal());
		inOrderTraversal(node.getRight(), values);
			
	}

}
