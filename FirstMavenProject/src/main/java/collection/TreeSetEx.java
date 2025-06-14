package collection;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>s=new TreeSet<String>();
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
		Set<String>s1=new TreeSet<String>();
		s1.add("array");
		s1.add("List");
		s1.add("print");
		s.addAll(s1);
		System.out.println(s);
		
		
		
	}

}
