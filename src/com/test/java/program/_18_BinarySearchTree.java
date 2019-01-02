package com.test.java.program;

public class _18_BinarySearchTree {

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.addNode(50);
		binaryTree.addNode(75);
		binaryTree.addNode(25);
		binaryTree.addNode(20);
		binaryTree.addNode(26);
		binaryTree.addNode(70);
		binaryTree.addNode(80);
		
		binaryTree.inorder(binaryTree.getRoot());
		binaryTree.contains(78);
	}

}

class BinaryTree{
	private TreeNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	public boolean contains(int data) {
		return find(data);
	}
	
	private boolean find(int data) {
		TreeNode currentNode = root;
		
		if(currentNode == null) {
			System.out.println("tree is empty");
			return false;
		}
		
		while(currentNode.getData() != data) {
			if(data < currentNode.getData()) {
				currentNode = currentNode.getLeft();
			}
			else {
				currentNode = currentNode.getRight();
			}
			if(currentNode == null) {
				System.out.println("\n" + data + " is not present in tree ");
				return false;
			}
		}
		System.out.println("Found  = " + currentNode.getData());
		return true;
	}

	public void inorder(TreeNode node) {
		if (node == null) {
			return;
		}
		inorder(node.getLeft());
		System.out.print(node.getData() + " ");
		inorder(node.getRight());

	}

	public void addNode(int data) {
		TreeNode newNode = new TreeNode(data);
		
		if(root == null) {
			root = newNode;
		}
		else {
			TreeNode currentNode = root;
			TreeNode parentNode = null;
			while(currentNode != null) {
				parentNode = currentNode;
				if(data < currentNode.getData()) {
					currentNode = currentNode.getLeft();
					if(currentNode == null) {
						parentNode.setLeft(newNode);
					}
				} else {
					currentNode = currentNode.getRight();
					if(currentNode == null) {
						parentNode.setRight(newNode);
					}
				}
			}
		}
	}
	
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
}

class TreeNode{
	private int data;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int data) {
		this.data=data;
		left=null;
		right=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
}