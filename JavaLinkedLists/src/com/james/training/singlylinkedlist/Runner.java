package com.james.training.singlylinkedlist;

public class Runner {

	public static void main(String[] args) {
		
		MyListNode<String> list1 = new MyListNode<String>();
		list1.insertFirst("Mango");
		list1.insertFirst("Apple");
		list1.insertFirst("Cherry");
		
		MyListNode<String> list2 = new MyListNode<String>();
		list2.insertLast("Guava");
		list2.insertLast("Apple");
		list2.insertLast("Cherry");
		
		//you can also print it 
	//	ListNode<String> nodeFirst = list2.deleteFirst();
	//	System.out.println("Deleted first node: " + nodeFirst.getValue());
		
	//	ListNode<String> nodeLast = list2.deleteLast();
	//	System.out.println("Deleted last node: " + nodeLast.getValue());
		
		//list2.deleteAny("Cherry");
		list2.searchNode("Cherry");
		
	}

}
