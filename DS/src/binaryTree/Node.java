package binaryTree;

public class Node {
 String value;
 Node left;
 Node right;
 private int val;
 
 /**
 * @return the val
 */
public int getVal() {
	return val;
}

/**
 * @param val the val to set
 */
public void setVal(int val) {
	this.val = val;
}

public Node(String value, Node left, Node right){
	 this.value = value;
	 this.left = left;
	 this.right = right;
 }
 
 public Node(int val, Node left, Node right){
	 this.val = val;
	 this.left = left;
	 this.right = right;
 }
 
 public Node(String value){
	 this.value=value;
	 this.left=null;
	 this.right=null;
 }

/**
 * @return the value
 */
public String getValue() {
	return value;
}

/**
 * @param value the value to set
 */
public void setValue(String value) {
	this.value = value;
}

/**
 * @return the left
 */
public Node getLeft() {
	return left;
}

/**
 * @param left the left to set
 */
public void setLeft(Node left) {
	this.left = left;
}

/**
 * @return the right
 */
public Node getRight() {
	return right;
}

/**
 * @param right the right to set
 */
public void setRight(Node right) {
	this.right = right;
}
 
public static Node getTree() {
	Node n7 = new Node(7, null, null);
	Node n5 = new Node(5, null, null);
	Node n6 = new Node(6, n5, n7);
	Node n1 = new Node(1, null, null);
	Node n3 = new Node(3, null, null);
	Node n2 = new Node(2, n1, n3);
	Node n4 = new Node(4, n2, n6);
	return n4;
}
 
}
