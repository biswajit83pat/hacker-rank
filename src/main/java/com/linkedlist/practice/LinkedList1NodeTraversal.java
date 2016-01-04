package com.linkedlist.practice;

public class LinkedList1NodeTraversal {

	public static void main(String[] args) {
		//Build a linked list of size 4..
		Node head = new Node();
		head.next = null;
		head.data = 1;
		
		traverse(head);
		
	}
	
	public static void traverse(Node head) {
		if(head == null)
			return;
		
		Node current = head;
		
		while(current != null) {
			System.out.print(current.data + " -- ");
			current = current.next;
		}
	}
}
