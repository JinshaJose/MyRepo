package acessmodifier;

public class AccessModifier {
	
	public void add()
	{
		int a=10;
		int b=12;
		int c=a+b;
		System.out.println("Sum = "+c);
	}
	
	private void sub()
	{
		int a=20;
		int b=12;
		int c=a-b;
		System.out.println("Difference = "+c);
	}
	
	protected void multi()
	{
		int a=10;
		int b=5;
		int c=a*b;
		System.out.println("Result = "+c);	
	}
	
	void div()
	{
		int a=25;
		int b=5;
		int c=a/b;
		System.out.println("Result = "+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier obj=new AccessModifier();
		obj.add();
		obj.sub();
		obj.multi();
		obj.div();
		
	}

}
