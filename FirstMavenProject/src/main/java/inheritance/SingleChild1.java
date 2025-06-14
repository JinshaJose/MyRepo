package inheritance;

public class SingleChild1 extends SingleParent1 {
	public void subtract()

	{
		int a=15;
		int b=5;
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild1 obj=new SingleChild1();
		obj.add();
		obj.subtract();

	}

}
