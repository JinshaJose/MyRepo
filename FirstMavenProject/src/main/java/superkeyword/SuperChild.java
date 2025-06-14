package superkeyword;

public class SuperChild extends SuperParent{
	public void color()
	{
String color = "Blue";
System.out.println(color);
System.out.println(super.color);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild obj=new SuperChild();
		obj.color();
	}

}
