package com.sape.ds;

public class LinkedListMid {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}

	void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr= head;
		 if(head !=null) {
			 while(fast_ptr != null && fast_ptr.next != null) {
				 fast_ptr = fast_ptr.next.next;
				 slow_ptr = slow_ptr.next;
			 }
			 System.out.println("Middle element is " + slow_ptr.data);
		 }
		
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void printList() {
		Node tNode = head;
		while(tNode != null) {
			System.out.println(tNode.data + "-->");
			tNode = tNode.next;
		}
		System.out.println("Null");
	}
	
	public static void main(String[] args) {
		LinkedListMid list = new LinkedListMid();
		for(int i=5;i>0; --i) {
			list.push(i);
			list.printList();
			list.printMiddle();
		}

	}

}
