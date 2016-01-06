	package com.linkedlist.practice;

public class LinkedListAddNthPosition {

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
		head = insertAtNthPosition(head, 10, 20);
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
	
	public static Node insertAtNthPosition(Node head, int data, int position) {
		if(position <= 0)
			throw new IllegalArgumentException("Position can only be 1 or more!");
		
		Node temp = new Node();
		temp.data = data;
		if(head == null || position == 1) {
			head = temp;
			return head;
		} else {
			//traverse the list till nth position
			Node current = head;
			Node previous = null;
			int counter = 1;
			while(position > counter) {
				previous = current;
				if(current == null) {
					//Entered end of list but counter was not found...
					break;
				}
				current = current.next;
				counter++;
			}
			previous.next = temp;
			temp.next = current;
			return head;
		}
	}
}
