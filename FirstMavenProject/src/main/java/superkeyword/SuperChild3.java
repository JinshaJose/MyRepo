package superkeyword;

public class SuperChild3 extends SuperParent3 {
	
	public SuperChild3(int a,int b)
	{
		super();
		int c=a-b;
		System.out.println(c);
		
	}
	public static void main(String args[])
	{
		SuperChild3 obj=new SuperChild3(10,2);
		
	}

}
