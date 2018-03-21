package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class SameTreeOrNot {

	public static void main(String[] args) {
		Node firstTree = Node.getTree();
		Node similarTree = Node.getTree();
		Node differentTree = Node.getTree();
		differentTree.setLeft(new Node(10, null, null));

		boolean firstAndSimilarTree = checkSimilarity(firstTree, similarTree);
		System.out.println("First and Similar Tree are Similar:"+ firstAndSimilarTree );
		
		boolean firstAndDifferentTree = checkSimilarity(firstTree,differentTree);
		
		System.out.println("First and Differnt Tree are Similar:"+ firstAndDifferentTree );
	}

	private static boolean checkSimilarity(Node first, Node second) {
		List<Integer> firstTreeNodes = traverseTreeInPreOrder(first, null);
		List<Integer> secondTreeNodes = traverseTreeInPreOrder(second, null);
		
		if(firstTreeNodes.size()==secondTreeNodes.size()){
			for(int i=0;i<firstTreeNodes.size();i++){
				if(!firstTreeNodes.get(i).equals(secondTreeNodes.get(i))){
					return false;
				}
			}
		}else{
			return false;
		}
		return true;
	}

	private static List<Integer> traverseTreeInPreOrder(Node node,
			ArrayList<Integer> listOfNodes) {
		if (listOfNodes == null) {
			listOfNodes = new ArrayList<Integer>();
		}
			listOfNodes.add(node.getVal());
			if(node.getLeft()!=null){
				traverseTreeInPreOrder(node.getLeft(),listOfNodes);
			}
			if(node.getRight()!=null){
				traverseTreeInPreOrder(node.getRight(),listOfNodes);
			}
		return listOfNodes;
	}

}
