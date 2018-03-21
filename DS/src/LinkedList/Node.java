package LinkedList;

public class Node {
	
	public Node next;
	 /**
	 * @return the next
	 */
	public Node next() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	public int data;
	 
	 public Node(int d){
		 this.data = d;
	 }

	/**
	 * @return the data
	 */
	public int data() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	 
	 
}
