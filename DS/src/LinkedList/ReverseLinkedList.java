package LinkedList;

public class ReverseLinkedList {
	public static Node parent = new Node(0);
	public static Node head = new Node(0);
	public static int a =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node N1 = new Node(1);
		Node N2 = new Node(2);
		Node N3 = new Node(3);
		Node N4 = new Node(4);
		Node N5 = new Node(5);
		N1.next=N2;
		N2.next=N3;
		N3.next=N4;
		N4.next=N5;
		a=N1.data;
		traverse(N1);
		reverse(N1);
		traverse(head);
	}
public static void traverse(Node n){
	if(n==null)return;
	System.out.println(n.data);
	traverse(n.next);
}
public static void reverse(Node n){
	if(n==null){
		return;
	}
	if(n.next==null){
		parent = n;
		head=n;
		return;
	}
	reverse(n.next);
	parent.next=n;
	parent = parent.next;
	if(n.data == a) n.next=null;
}
}
