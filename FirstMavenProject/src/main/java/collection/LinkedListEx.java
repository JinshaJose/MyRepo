package collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>s=new LinkedList<String>();
		s.add("Jinsha");
		s.add("Sarah");
		s.add("Hello");
		s.add("World");
		s.add("Jinsha");
		System.out.println(s);
		System.out.println(s.contains("New"));
		s.remove("Jinsha");
		System.out.println(s);
		System.out.println(s.size());
		LinkedList<String>s1=new LinkedList<String>();
		s1.add("array");
		s1.add("List");
		s1.add("print");
		s.addAll(s1);
		System.out.println(s);

	}

}
