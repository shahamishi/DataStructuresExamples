package LinkedList;

public class LinkList {
	Node head; 
	Node tail;
	 
	/* public LinkList(){
		 this.head = new Node(0);
		 this.tail = head;
		 
	 }*/

	public LinkList(){
		head=tail;
	}
	 public void add(Node node){
		if(head==null){
			head = node;
			this.tail=node;
		}
		else{
		 this.tail.setNext(node) ;
		 this.tail = node;
		}
//		this.tail.setNext(node) ;
//		 this.tail = node;
		
	 }
	/**
	 * @return the head
	 */
	public Node head() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
	}

	/**
	 * @return the tail
	 */
	public Node getTail() {
		return tail;
	}

	/**
	 * @param tail the tail to set
	 */
	public void setTail(Node tail) {
		this.tail = tail;
	}

	 public static void printLinkList(Node head){
//		 Node current = head.next();
		 Node current=head;
		 while(current.next()!=null){
			 System.out.print(current.data() + " ");
			 current = current.next();
		 }
		 System.out.print (current.data());
		 System.out.println(" ");
	 }
}
