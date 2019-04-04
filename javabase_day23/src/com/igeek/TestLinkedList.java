package com.igeek;

public class TestLinkedList {
	
	private Node first;
	private Node last;
	private int size;
	
	//[]
	//[a b c ]
	public void add(Object o) {
		Node node = new Node(o);
		if(first == null) {
			first = node;
			last = node;
		}else {
			node.previous = last;
			node.next = null;
			last.next = node;
			last = node;
		}
		size++;
	}
	
	public static void main(String[] args) {
		
		TestLinkedList linkedList = new TestLinkedList();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		
		System.out.println(linkedList);
	}

}
