package com.cache.util;

public class DoublyLinkedList {

	private final int size;
	private int currentSize;
	private Node head;
	private Node tail;

	public DoublyLinkedList(int size) {
		this.size = size;
		currentSize = 0;
	}

	public Node addPageToList(int data) {
		Node pageNode = new Node(data);
		if (head == null) {
			head = pageNode;
			tail = pageNode;
			currentSize = 1;
			return pageNode;
		} else if (currentSize < size) {
			currentSize++;
		} else {
			tail = tail.getPrev();
			tail.setNext(null);
		}
		pageNode.setNext(head);
		head.setPrev(pageNode);
		head = pageNode;
		return pageNode;
	}

	public void movePageToHead(Node pageNode) {
		if (pageNode == null || pageNode == head) {
			return;
		}

		if (pageNode == tail) {
			tail = tail.getPrev();
			tail.setNext(null);
		}

		Node prev = pageNode.getPrev();
		Node next = pageNode.getNext();
		prev.setNext(next);

		if (next != null) {
			next.setPrev(prev);
		}

		pageNode.setPrev(null);
		pageNode.setNext(head);
		head.setPrev(pageNode);
		head = pageNode;
	}

	public void printList() {
		if (head == null) {
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current);
			current = current.getNext();
		}
	}

	public int getCurrentSize() {
		return currentSize;
	}

	public void setCurrentSize(int currentSize) {
		this.currentSize = currentSize;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}
}