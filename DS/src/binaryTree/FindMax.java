package binaryTree;

public class FindMax {

	public static void main(String[] args) {
	 Node node= Node.getTree();
	 findMax(node);
     System.out.println("The max value is: "+maxValue);
	}
    private static int maxValue;
	public static void findMax(Node node){
		if(node==null){
			return;
		}
		findMax(node.getLeft());
		findMax(node.getRight());
		if(node.getVal()>maxValue){
			maxValue=node.getVal();
		}
	}
}
