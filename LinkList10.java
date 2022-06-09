package com.bl.linkedList;

public class LinkList10 {
	public static void main(String[] args) {
		System.out.println("Welcome To Linked List Program");
		System.out.println("Nodes of simple linked list:");

		OrderedList ascendingList = new OrderedList();
		ascendingList.adds(56);
		ascendingList.adds(30);
		ascendingList.adds(40);
		ascendingList.adds(70);
		ascendingList.display();
		ascendingList.sortNode();
		ascendingList.display();


	}
}


