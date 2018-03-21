package LinkedList;

import java.util.LinkedList;

/**
 * Implement an algorithm to delete a node in the middle of a single linked
 * list, given only access to that node. EXAMPLE Input: the node ‘c’ from the
 * linked list a->b->c->d->e Result: nothing is returned, but the new linked
 * list looks like a->b->d->e
 * 
 * @author ashah
 * 
 */
public class DeleteNode {

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

		deleteNode(head.next().next().next());
		System.out.println(" ");
		LinkList.printLinkList(head);
		
		head = findAndDelete(head, 1);
		System.out.println(" ");
		LinkList.printLinkList(head);
	}

	// deletes the current node
	private static boolean deleteNode(Node node) {
		if (node == null || node.next() == null) {
			return false;
		}
		Node next = node.next();
		node.data = next.data();
		node.next = next.next();

		return true;
	}

	private static Node findAndDelete(Node node, int number) {
	/*	Node next = node.next;
		if(node!=null && next!=null){
		while (true) {
			if (next.data == number) {
				node.next = next.next;
				break;
			} else {
				node = node.next;
				next = node.next;
			}
		}
		}
	}*/
	
		  Node temp =node;
          Node prev=null;
          while (temp!=null){
                  if(temp.data==number){
                          if(temp==node){
                                  node=node.next;
                          }else{
                                  prev.next=temp.next;
                          }
                  }else{
                          prev=temp;
                  }
                  temp=temp.next;
                 }
	return node;
         
}
}