package com.bl.linkedList;

public class LinkList8 {
	public static void main(String[] args) {
		System.out.println("Welcome To Linked List Program");
		System.out.println("Nodes of simple linked list:");
		InsertNew list = new InsertNew();
		list.add(56);
		list.add(70);
		list.display();
		System.out.println("30 is Inserting between 56 and 70");
		list.insert(list.head, 30);
		list.display();
		//list.pop();
		//list.display();
		list.searchNode(30);
		list.display();
		System.out.println("40 is Inserting after 30 ");
		list.insert(list.head.next, 40);
		list.display();
	}
}


