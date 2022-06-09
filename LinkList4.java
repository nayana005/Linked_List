package com.bl.linkedList;

public class LinkList4 {
	public static void main(String[] args) {
		System.out.println("Welcome To Linked List Program");
		Insert list=new Insert();
		list.add(56);
		list.add(70);
		list.insert(list.head, 30);
		list.display();

	}

}
