package collection;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Jinsha");
		obj.add("Hello");
		obj.add("World");
		obj.add("Hi");
		obj.add("New");
		ArrayList<String>s=new ArrayList<String>();
		s.add("array");
		s.add("List");
		s.add("print");
		obj.addAll(s);
		System.out.println(obj);
		System.out.println(obj.contains("print"));
		System.out.println(obj.get(3));
		System.out.println(obj.isEmpty());
		obj.remove(0);
		System.out.println(obj);
		System.out.println(obj.size());
		
		
	}

}
