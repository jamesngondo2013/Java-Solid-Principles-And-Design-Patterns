package com.james.training.singlylinkedlist;

public class ListNode<E> {

	private E value;  //E - will take whatever value - int, string, double etc 
	private ListNode<E> next;
	
	public ListNode(E newValue, ListNode<E> newNext) {
		this.value = newValue;
		this.next = newNext;
	}

	public E getValue() {
		return value;
	}
	//Set value of node
	public void setValue(E newValue) {
		this.value = newValue;
	}
	//set memory ref of next node inside the list node
	public ListNode<E> getNext() {
		return next;
	}

	public void setNext(ListNode<E> newNext) {
		this.next = newNext;
	}
	
	public static void main(String[] args) {
		ListNode<String> list = new ListNode<String>("Banana", new ListNode<String>("Apple", new ListNode<String>("Cherry", null)));
		
		while (list !=null) {
			System.out.println(list.getValue());
			//pointer moves from the first node to the next
			list = list.getNext();
		}
	}
	
}
