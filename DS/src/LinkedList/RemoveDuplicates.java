package LinkedList;

public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkList linkList = new LinkList();

		for (int i = 0; i < 5; i++) {
			linkList.add(new Node(i));
			linkList.add(new Node(i));
		}
		for (int i = 0; i < 5; i++) {
			linkList.add(new Node(i));
			linkList.add(new Node(i));
		}
		LinkList.printLinkList(linkList.head);
		removeDuplicates(linkList);
		LinkList.printLinkList(linkList.head);
	}

	/*
	 * private static void printLinkList(LinkList linkList) { Node head =
	 * linkList.head(); Node current = head.next; while(current!=null){ //
	 * current = head.next; System.out.println(current.data); current =
	 * current.next; } }
	 */

	/*private static void removeDuplicates(LinkList ll) {
		Node previous;
		Node current;
		Node variable;

		previous = ll.head();
		current = previous.next;

		while (current != null) {
			variable = ll.head();
			while (variable != current) {
				if (variable.data == current.data) {
					Node tmp = current.next;
					previous.next = tmp;
					current = tmp;
					break;
				}
				variable = variable.next;
			}

			if (variable == current) {
				previous = current;
				current = current.next;
			}
		}

	}*/

    private static void removeDuplicates(LinkList ll) {
        Node pointer1 = ll.head;
        Node pointer2= null;
        while(pointer1!=null && pointer1.next()!=null){
            pointer2=pointer1;
            while(pointer2.next !=null) {
                if (pointer1.data == pointer2.next.data) {
                    pointer2.next = pointer2.next.next;
                    System.gc();
                } else {
                    pointer2 = pointer2.next;
                }
            }
                pointer1=pointer1.next;
            }
        }
    }

//	private static void removeDuplicates(LinkList ll) {
//		Node previous = ll.head;
//		Node current = previous.next;
//
//		while(current!=null){
//			Node temp = ll.head;
//			while(temp!=current){
//			if(temp.data==current.data){
//				previous.next = current.next;
//				current = current.next;
//				break;
//			}
//			temp = temp.next;
//			if(temp==current){
//				previous = current;
//				current = current.next;
//			}
//
//		}
//		}
//	}

