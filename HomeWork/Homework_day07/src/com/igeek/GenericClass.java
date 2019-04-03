package com.igeek;

//2.	定义自定义泛型类
public class GenericClass<E> {
	
	//E类型的成员变量
	private E Element;

	public E getElement() {
		return Element;
	}

	public void setElement(E element) {
		Element = element;
	}
	
	
	
}
