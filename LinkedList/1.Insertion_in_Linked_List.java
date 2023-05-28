// Alternate method to declare the class
// in order to minimize the
// memory allocation work

import java.io.*;

class node {
	int data;
	node next;

	// constructor call
	node(int value)
	{

		// It automatically assigns the value to the data
		data = value;

		// next pointer is pointed to null
		next = null;
	}
}

class GFG {

	// Declaring an empty linked list
	static node head = null;

	// Function to insert an element at head position
	static void insertathead(int val)
	{
		node n = new node(val);
		n.next = head;
		head = n;
	}

	// Function to insert a element at a specified position
	static void insertafter(int key, int val)
	{
		node n = new node(val);
		if (key == head.data) {
			n.next = head.next;
			head.next = n;
			return;
		}
		node temp = head;
		while (temp.data != key) {
			temp = temp.next;
			if (temp == null) {
				return;
			}
		}
		n.next = temp.next;
		temp.next = n;
	}

	// Function to insert an element at the end
	static void insertattail(int val)
	{
		node n = new node(val);
		if (head == null) {
			head = n;
			return;
		}
		node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
	}

	// Function to print the singly linked list
	static void print()
	{
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
//driver code
	public static void main(String[] args)
	{

		insertathead(1);
		insertathead(2);
		System.out.print("After insertion at head: ");
		print();
		System.out.println();

		insertattail(4);
		insertattail(5);
		System.out.print("After insertion at tail: ");
		print();
		System.out.println();

		insertafter(1, 2);
		insertafter(5, 6);
		System.out.print(
			"After insertion at a given position: ");
		print();
		System.out.println();
	}
}

