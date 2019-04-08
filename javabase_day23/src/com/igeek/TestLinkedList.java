package com.igeek;

public class TestLinkedList<E> {
	
	private Node first;
	private Node last;
	private int size;
	
	//[]
	//[a b c ]
	public void add(E o) {
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
	
	public void add(int index,E obj) {
		
		checkRange(index);
		Node newnode = new Node(obj);
		Node temp = getNode(index);
		
		if(temp != null) {
			Node pre = temp.previous;
			pre.next = newnode;
			newnode.previous = pre;
			newnode.next = temp;
			temp.previous = newnode;
		}
	}
	
	//获取结点
	//[]
	//[a,b,c,d,e,f,g,h,i,j,k]
	public Object get(int index) {
		checkRange(index);
		Node temp = getNode(index);
		return temp.element;
	}
	
	public void checkRange(int index) {
		if(index <0 || index > size-1) {
			throw new RuntimeException("非法索引："+index);
		}
	}
	
	public Node getNode(int index) {
		checkRange(index);
		Node temp = null;
		if(index <= (size-1 >> 1 )) {
			temp = first;
			for(int i = 0;i<index;i++) {
				temp = temp.next;
			}
		}else {
			temp = last;
			for(int j = size-1;j>index;j--) {
				temp = temp.previous;
			}
		}
		return temp;
	}
	
	//删除
	public void remove(int index) {
		Node temp = getNode(index);
		
		if(temp != null) {
			
			Node pre = temp.previous;
			Node next = temp.next;
			
			if(pre != null) {
				pre.next = next;
			}
			if(next != null) {
				next.previous = pre;
			}
			//被删除的元素是第一个元素的时候
			if(index == 0) {
				first = next;
			}
			//被删除的元素是最后一个元素的时候
			if(index == size-1) {
				last = pre;
			}
			size--;
		}
	}
	
	public int size() {
        return size;
    }
	
	//[a,b,c]
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node temp = first;
		while(temp != null) {
			sb.append(temp.element+",");
			temp = temp.next;
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}

	public static void main(String[] args) {
		
		TestLinkedList<String> linkedList = new TestLinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("e");
		linkedList.add("f");
		
		System.out.println(linkedList);
//		linkedList.remove(0);
		linkedList.add(3,"王博");
		System.out.println(linkedList);
	}

}
