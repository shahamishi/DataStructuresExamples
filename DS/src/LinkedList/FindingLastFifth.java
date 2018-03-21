package LinkedList;

public class FindingLastFifth {
	public static void main(String[] args) {
	
	LinkList integerLList = new LinkList(); 
	integerLList.add(new Node(1));
	integerLList.add(new Node(2));
	integerLList.add(new Node(3));
	integerLList.add(new Node(4));
	integerLList.add(new Node(5));
	integerLList.add(new Node(6));
	integerLList.add(new Node(7));
	integerLList.add(new Node(8));
	
	Node head = integerLList.head();
	LinkList.printLinkList(head);
	
	Node fifthLast = getFifthLast(head,5);
	
	System.out.println(" ");
	System.out.println("Fifth Last: "+fifthLast.data() );
	}

	private static Node getFifthLast(Node head, int n) {
		Node node1 = head;
		Node node2 = head;
		
		for(int i=0;i<n-1;i++){
			if(node2 == null){
				return null;
			}
			node2= node2.next();
		}
		while(node2.next()!=null){
			node2 = node2.next();
			node1 = node1.next();
		}
		return node1;
	}
}
