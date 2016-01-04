package com.linkedlist.practice;

public class LinkedListAddEnd {

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
		
		System.out.println("B4 insertion");
		traverse(head);
		System.out.println();
		System.out.println("After insertion");
		insertAtEnd(head, 5);
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
	
	public static Node insertAtEnd(Node head, int data) {
		Node temp = new Node();
		temp.data = data;
		if(head == null) {
			head = temp;
			return head;
		} else {
			//traverse the list till end
			Node current = head;
			Node previous = head;
			while(current != null) {
				previous = current;
				current = current.next;
			}
			previous.next = temp;
			return temp;
		}
	}
}
