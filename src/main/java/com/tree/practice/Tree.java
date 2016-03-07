package com.tree.practice;

public class Tree {

	private class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;
		
		TreeNode(TreeNode left, TreeNode right, int data) {
			this.left = left;
			this.right = right;
			this.data = data;
		}
		
		TreeNode(int data) {
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		TreeNode root = new Tree().new TreeNode(20);
		TreeNode left = new Tree().new TreeNode(15);
		TreeNode right = new Tree().new TreeNode(25);
		root.left = left;
		root.right = right;
		TreeNode firstLeft = new Tree().new TreeNode(10);
		TreeNode secondLeft = new Tree().new TreeNode(-10);
		TreeNode secondRight = new Tree().new TreeNode(18);
		root.left.left = firstLeft;
		root.left.left.left = secondLeft;
		root.left.right = secondRight;
		
		levelWiseTraversal(root);
		
		TreeNode rightRotatedNode = rightRotate(root); 
		
		
	}
	
	private class LinkedNode {
		LinkedNode node;
		int data;
		
		LinkedNode(int data) {
			this.data = data;
		}
	}
	
	private class LinkedList {
		LinkedNode node;
		int data;
		
		public void insertFirst() {
			
		}
		
	}
	
	private class Queue {
		
		
	}
	
	private static void levelWiseTraversal(TreeNode root) {
		java.util.LinkedList<TreeNode> linkedList = new java.util.LinkedList<>();
		linkedList.addLast(root);
		while(!linkedList.isEmpty()) {
			TreeNode temp = null;
			temp = linkedList.removeFirst();
			System.out.print(temp.data + "	");
			if(temp.left != null)
			linkedList.addLast(temp.left);
			if(temp.right != null)
			linkedList.addLast(temp.right);
		}
		
	}
	
	private static TreeNode rightRotate(TreeNode root) {
		TreeNode leftRightChild = root.left.right;
		root.left.right = null;
		TreeNode newRoot = root.left;
		newRoot.left = root.left.left;
		root.left = null;
		newRoot.right = root;
		newRoot.right.left = leftRightChild;
		return newRoot;		
	}
	
	
	
}