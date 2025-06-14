package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String>s=new ArrayList<String>();
		s.add("Jinsha");
		s.add("Sarah");
		s.add("Hello");
		s.add("World");
		s.add("Jinsha");
		System.out.println(s);
		s.set(2, "New");
		System.out.println(s);
		int x=s.indexOf("Jinsha");
		System.out.println(x);
		int y=s.lastIndexOf("Jinsha");
		System.out.println(y);
		s.remove(0);
		System.out.println(s);
		s.remove("Sarah");
		System.out.println(s);
		System.out.println(s.get(0));
		System.out.println(s.contains("New"));

	}

}
