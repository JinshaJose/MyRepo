package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>s=new ArrayList<String>();
		s.add("Jinsha");
		s.add("Hello");
		s.add("Hi");
		s.add("World");
		s.add("New");
		Iterator<String>it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(s);
	}

}
