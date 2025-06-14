package superkeyword;

public class SuperChild1 extends SuperParent1 {
	public void sub()
	{
		int a=10;
		int b=5;
		int c=a-b;
		System.out.println(c);
		super.add();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild1 obj=new SuperChild1();
		obj.sub();
	}

}
