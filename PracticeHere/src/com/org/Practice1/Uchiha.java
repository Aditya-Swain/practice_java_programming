package com.org.Practice1;

import java.util.ArrayList;

public class Uchiha {
		
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("madara");
		list.add("hatake");
		list.add("naruto");
		list.add("itachi");
		list.add("konoha");
		list.add("madara");
		list.add(null);
		
	System.out.println(list.indexOf("madara"));
	System.out.println(list.lastIndexOf("madara"));
		
	}
}
