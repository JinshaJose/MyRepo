package inheritance;

public class HierarchialChildC extends HierarchialParent {

	public void display2()
	{
		System.out.println("Hierarchial Child 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChildC obj = new HierarchialChildC();
		obj.display();
		obj.display2();

	}

}
