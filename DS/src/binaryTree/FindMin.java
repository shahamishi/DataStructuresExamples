package binaryTree;

public class FindMin {

	public static void main(String[] args) {
	 Node node= Node.getTree();
	 findMin(node);
     System.out.println("The min value is: "+minValue);
	}
    private static int minValue;
	public static void findMin(Node node){
		if(node==null){
			return;
		}
		findMin(node.getLeft());
		findMin(node.getRight());
		if(node.getVal()<minValue){
			minValue=node.getVal();
		}
	}
}
