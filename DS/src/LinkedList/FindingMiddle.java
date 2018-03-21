package LinkedList;

public class FindingMiddle {

	public static void main(String[] args){
		
		LinkList integetList = new LinkList();
		integetList.add(new Node(1));
		integetList.add(new Node(2));
		integetList.add(new Node(3));
		integetList.add(new Node(4));
		integetList.add(new Node(5));
		integetList.add(new Node(6));

		LinkList.printLinkList(integetList.head());
		Node middleNode = getMiddleNode(integetList);
		 
		System.out.println("Middle Node's data: "+middleNode.data);
	}

	private static Node getMiddleNode(LinkList integetList) {
		
		Node currentNode = integetList.head;
		Node middleNode = currentNode;
		int length=0;
		
		while(currentNode.next !=null){
			length++;
			if(length%2==0){
				middleNode = middleNode.next;
			}
			currentNode = currentNode.next;
		}
		if(length%2 == 1){
			middleNode = middleNode.next;
		}
		return middleNode;
	}
}
