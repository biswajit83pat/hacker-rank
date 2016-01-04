package com.linkedlist.practice;

public class LinkedListEmptyTraversal {

	public static void main(String[] args) {
		//Build a linked list of size 4..
		Node head = new Node();
		head.next = null;
		head.data = 1;
		
		Node temp = new Node();
		temp.data = 2;
		temp.next = null;
		head.next = temp;
		
		Node temp1 = new Node();
		temp1.data = 3;
		temp1.next = null;
		temp.next = temp1;
		
		Node temp2 = new Node();
		temp2.data = 4;
		temp2.next = null;
		temp1.next = temp2;
		
		traverse(null);
		
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
