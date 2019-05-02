package com.revature.util;

public class MyLinkedList<T> {
	//the root node of our linked list, called the "head"
	private Node<T> head;
	//The end node of our linked list, called the "tail"
	private Node<T> tail;
	
	//Insert node at the end of the linked list
	public void insert(T data) {
		//create a new node object whose nextNode value is null,
		//and contains some data
		Node<T> newNode= new Node<>(data,null);
		//if head of linked list is null, the new node will become the head AND Tail
		if(this.head==null) {
			System.out.println("List is empty... adding first element");
			this.head= newNode;
			this.tail= newNode;
		/*If the head is not null, we will select the tail, set it's next node to the new node
		 * we just created, and the set the tail to the newly added
		 * node
		 */
		}else {
			System.out.println("List has contents...adding new node to tail of list");
			this.tail.setNextNode(newNode);
			this.tail= newNode;
		}
	}
	//convenience method for print the list contents
	public void printList() {
		//start with the head of this list
		Node<T> currentNode= this.head;
		// while currentNode is not null, print out the node information and move on to the next
		while(currentNode!=null) {
			System.out.println("Node Value: "+ currentNode.getData());
			currentNode= currentNode.getNextNode();		}
	}
	
	
}
