package com.james.training.singlylinkedlist;

public class MyListNode<E> {

	private ListNode<E> head;
	private ListNode<E> current;
	private ListNode<E> previous;
	
	public void insertFirst(E value){
		//takes E value and creates a new node
		ListNode<E> newNode = new ListNode<E>(value, null);
		
		//currently, head == null
		if (head == null) {
			head = newNode;
		}
		else{
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	public void insertLast(E value){
		// takes E value and creates a new node
		ListNode<E> newNode = new ListNode<E>(value, null);

		// currently, head == null
		if (head == null) {
			head = newNode;
		} else {
			
			current = newNode;
			
			while (current !=null) {
				previous = current;
				current = current.getNext();
			}
			
			previous.setNext(newNode);
		}
	}
	
	//https://www.youtube.com/watch?v=wEWYzkOHbXI&list=PLEH2kL-crMGHcVkCsiHSIE9wloVSHAkGt&index=6
	
	public ListNode<E> deleteFirst(){
		ListNode<E> remove = head;
		
		if (head !=null) {
			//moves the pointer from the first node (head) to the next node
			//that becomes the new head
			head = head.getNext();
		}
		return remove;
	}
	
	public ListNode<E> deleteLast(){
		
		ListNode<E> remove = current;
		
		if (head !=null) {
			current = head;
			
			while (current.getNext() !=null) {
				previous = current;
				current = current.getNext();
			}
			previous.setNext(null);
		}
		return remove;
	}
	
	public void deleteAny(E key){
		
		//ListNode<E> remove = head;
		
		if (head ==null) {
			System.out.println("List is empty...");
		}
		else{
			current = head;
			while (current!=null && !current.getValue().equals(key)) {
				previous = current;
				current = current.getNext();
			}
			if (current == head && current.getValue().equals(key)) {
				head = head.getNext();
			}
			else if (current !=null) {
				previous.setNext(current.getNext());
			}
			
		}
		//System.out.println(current.getValue());
		System.out.println(head.getValue());
		//System.out.println(current.getValue());
		
		
	}//method
	
	public ListNode<E> searchNode(E key){
		ListNode<E> foundNode = current;
		if (head==null) {
			return null;
			
		}
		else{
			current = head;
			
			while(current!=null){
				if (current.getValue().equals(key)) {
					
					return foundNode;
					
				}
			
					current = current.getNext();
					
				
				
				
			}
		}
		return foundNode;
	}
	
}
