package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericEx {

	public static void main(String[] args) {
		//Create list
		List obj = new ArrayList();//inbuilt,import
		//Add elements to list
		//use method add
		obj.add("Hllo");
		obj.add(10);
		obj.add(10.5f);
		obj.add(10.35266d);
		obj.add('A');
		System.out.println(obj);
	}

}
