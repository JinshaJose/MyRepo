package collection;

import java.util.HashSet;
import java.util.Set;


public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>s=new HashSet<String>();
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
		HashSet<String>s1=new HashSet<String>();
		s1.add("array");
		s1.add("List");
		s1.add("print");
		s.addAll(s1);
		System.out.println(s);

	}

}
