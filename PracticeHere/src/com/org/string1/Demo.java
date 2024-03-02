package com.org.string1;

public class Demo {
		
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("0123456789");
//		buffer.setCharAt(0, 'p');
//		buffer.setCharAt(1, 'h');
		System.out.println(buffer);
		System.out.println(buffer.length());
//		buffer.delete(4, 6);
		System.out.println(buffer);
//		buffer.reverse();
		System.out.println(buffer);
		buffer.setLength(6);
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		buffer.trimToSize();
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		
	}
}
