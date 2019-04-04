package com.igeek;

public class Node {
	
	Object element;//数据元素
	Node previous;//指向上一个结点
	Node next;//指向下一个结点
	
	public Node(Object element, Node previous, Node next) {
		super();
		this.element = element;
		this.previous = previous;
		this.next = next;
	}

	public Node(Object element) {
		super();
		this.element = element;
	}

}
