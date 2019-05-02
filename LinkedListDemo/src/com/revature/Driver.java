package com.revature;

import com.revature.util.MyLinkedList;

public class Driver {

	public static void main(String[] args) {
		MyLinkedList<String> stringList= new MyLinkedList<>();
		stringList.insert("test1");
		stringList.insert("test2");
		stringList.insert("test3");
		stringList.insert("test4");
		stringList.insert("test5");
		stringList.printList();
	}

}
