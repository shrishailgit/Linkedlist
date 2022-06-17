package com.bridgelabz;

public class LinkedList <E>{
	 Node<E> head;
	 Node<E> tail;
     int size;

	public void push(E data) {	
	    {
	        Node<E> newNode = new Node<>(data);
			if (head == null) {
	            head = newNode;
	            tail = newNode;
	            size++;
	        } else {
	            newNode.next = head;
	            head = newNode;
	            size++;
	        }
	    }
		
	}

}
