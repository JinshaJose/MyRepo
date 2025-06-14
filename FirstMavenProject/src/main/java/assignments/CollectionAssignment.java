package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionAssignment {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Red");
		obj.add("Yello");
		obj.add("Blue");
		System.out.println(obj);
		obj.get(1);
		System.out.println(obj.get(1));
		Iterator<String>it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		obj.remove(0);
		System.out.println(obj);
		System.out.println(obj.contains("Blue"));
		}

}
