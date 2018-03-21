package LinkedList;

import java.lang.reflect.Array;

/**
 * You have two numbers represented by a linked list, where each node contains a
 * single digit. The digits are stored in reverse order, such that the 1�s digit
 * is at the head of the list. Write a function that adds the two numbers and
 * returns the sum as a linked list. EXAMPLE Input: (3 -> 1 -> 5), (5 -> 9 -> 2)
 * Output: 8 -> 0 -> 8
 */

public class AdditionOfNodes {

	public static void main(String[] args) {
		
		LinkList l1 = new LinkList();
		LinkList l2 = new LinkList();

		l1.add(new Node(7));
		l1.add(new Node(1));
		l1.add(new Node(2));

		l2.add(new Node(5));
		l2.add(new Node(9));
//		l2.add(new Node(2));

		System.out.println("First List");
		LinkList.printLinkList(l1.head);

		System.out.println("Second List");
		LinkList.printLinkList(l2.head);

		System.out.println("Now adding");
		LinkList resultList = add(l1, l2);
		LinkList.printLinkList(resultList.head);

	}

	private static LinkList add(LinkList l1, LinkList l2) {

		Node l1Head = l1.head;
		Node l2Head = l2.head;

		LinkList resultList = addNodes(new LinkList(),l1Head, l2Head, 0);
		//Not working
		/*LinkList resultList = new LinkList(); 
		resultList.add(addNodes(l1Head.next, l2Head.next, 0));*/
		return resultList;
	}

	private static LinkList addNodes(LinkList resultList,Node l1Head, Node l2Head, int carry) {

		int firstOperand = l1Head == null ? 0 : l1Head.data;
		int secondOperand = l2Head == null ? 0 : l2Head.data;

		int additionResult = firstOperand + secondOperand + carry;

		int data = additionResult % 10;
		
		//LinkList resultList = new LinkList();
		resultList.add(new Node(data));

		int carryForNextIteration=0;
		if (additionResult > 9) {
			carryForNextIteration=1;
		}
		if(l1Head.next!=null || l2Head.next != null || carryForNextIteration!=0){
			addNodes(resultList,l1Head.next == null ? new Node(0): l1Head.next ,l2Head.next== null ? new Node(0): l2Head.next,carryForNextIteration);
		}
		return resultList;
	}
	//Not working
	private static Node addNodes(Node l1, Node l2, int carry) {

		int firstOperand = l1 == null ? 0 : l1.data;
		int secondOperand = l2 == null ? 0 : l2.data;

		int additionResult = firstOperand + secondOperand + carry;

		int data = additionResult % 10;
		
		Node resultList = new Node(data);
		//resultList.add(new Node(data));

		int carryForNextIteration=0;
		if (additionResult > 9) {
			carryForNextIteration=1;
		}
		/*if(l1Head.next!=null || l2Head.next != null || carryForNextIteration!=0){
			addNodes(resultList,l1Head.next,l2Head.next,carryForNextIteration);
		}*/
		
		Node more = addNodes(l1.next == null ? null : l1.next,l2.next == null ? null : l2.next,carryForNextIteration);
		resultList.setNext(more);
		return resultList;
	}
}
