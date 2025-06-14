package inheritance;

public class HierarchialChildB extends HierarchialParent {

	public void display1()
	{
		System.out.println("Hierarchial Child 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChildB obj = new HierarchialChildB();
		obj.display();
		obj.display1();
		

	}

}
