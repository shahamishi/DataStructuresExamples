package binaryTree;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node G = new Node("G", null, null);
		Node F = new Node("F", null, null);
		Node E = new Node("E", null, null);
		Node D = new Node("D", null, null);
		Node C = new Node("C", F, G);
		Node B = new Node("B", D, E);
		Node A = new Node("A", B, C);
		
		read(A);
		//mirror(A);
		//read(A);
	}
public static void mirror(Node node){
	if(node == null) return;
	mirror(node.left);
	mirror(node.right);
	
	Node temp = node.left;
	node.left=node.right;
	node.right = temp;
}
public static void read(Node node){
	if(node == null) return;
	read(node.left);
	
	read(node.right);
	System.out.println(node.value);
	
	

}
}
