package com.test.java.program;

public class _35_ReverseLinkedList {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(list);
		list.head = list.reverse(list);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(list);
	}
}

class LinkList {

	Node head;

	Node reverse(LinkList node) {
		Node prev = null;
		Node current = node.head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node.head = prev;
		return node.head;
	}

	// prints content of double linked list
	void printList(LinkList node) {
		Node current = node.head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

}

class Node {

	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}
