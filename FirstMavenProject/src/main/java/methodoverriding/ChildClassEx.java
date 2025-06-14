package methodoverriding;

public class ChildClassEx extends ParentClassEx{
	public void calculate(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
		super.calculate(10, 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassEx obj=new ChildClassEx();
		obj.calculate(10, 5);

	}

}
