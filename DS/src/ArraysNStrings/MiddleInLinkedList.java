package ArraysNStrings;

public class MiddleInLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList integerLList = new LinkedList(); 
		integerLList.add(new LinkedList.Node("1"));
		integerLList.add(new LinkedList.Node("2"));
		integerLList.add(new LinkedList.Node("3"));
		integerLList.add(new LinkedList.Node("4"));
		integerLList.add(new LinkedList.Node("5"));
		integerLList.add(new LinkedList.Node("6"));
		
		LinkedList.Node head = integerLList.head();
		LinkedList.Node current = head;
		int length =0;
		LinkedList.Node middle = head;
		
		while(current.next()!=null){
			length ++;
			if(length%2 == 0){
				middle = middle.next();
			}
			current = current.next();
		}
		if(length%2 != 0){
			middle = middle.next();
		}
		System.out.println("middle one: "+middle.data() );
	}
}
class LinkedList{
    private Node head;
    private Node tail;
  
    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }
  
    public Node head(){
        return head;
    }
  
    public void add(Node node){
        tail.next = node;
        tail = node;
    }
  
    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }
      
        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
      
        public String toString(){
            return this.data;
        }
    }
}

