package com.linkedlist.practice;

public class LinkedList1TempTraversal {

	public static void main(String[] args) {
		//Build a linked list of size 4..
		Node head = new Node();
		head.next = null;
		head.data = 1;
		
		Node temp = new Node();
		temp.data = 2;
		temp.next = null;
		head.next = temp;
		
		temp = new Node();
		temp.data = 3;
		temp.next = null;
		temp.next = temp;
		
		temp = new Node();
		temp.data = 4;
		temp.next = null;
		temp.next = temp;
		
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
