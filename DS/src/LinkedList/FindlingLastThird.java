package LinkedList;


public class FindlingLastThird {


	
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
		
		Node current = head;
		Node thirdLast = head;
		
		
		for(int i=0;i<2;++i){
			if(current.next != null){
				current = current.next();
			}
		}
		while(current.next()!=null){
			thirdLast = thirdLast.next();
			current = current.next();
		}
		System.out.println(" ");
		System.out.println("Third Last: "+thirdLast.data() );
	}

}
