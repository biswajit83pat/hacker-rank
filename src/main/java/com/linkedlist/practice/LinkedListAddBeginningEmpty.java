package com.linkedlist.practice;

public class LinkedListAddBeginningEmpty {

	public static void main(String[] args) {
		//Build a linked list of size 4..
		Node head = null;
		
		System.out.println("B4 insertion");
		traverse(head);
		System.out.println();
		System.out.println("After insertion");
		head = insertAtBeginning(head, 5);
		traverse(head);
		
		System.out.println();
		System.out.println("After insertion");
		head = insertAtBeginning(head, 6);
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
		System.out.println();
	}
	
	public static Node insertAtBeginning(Node head, int data) {
		Node temp = new Node();
		temp.data = data;
		if(head == null) {
			head = temp;
			return head;
		} else {
			//traverse the list till end
			temp.next = head;
			head = temp;
			return head;
		}
	}
}
