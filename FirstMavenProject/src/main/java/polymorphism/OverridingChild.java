package polymorphism;

public class OverridingChild extends OverridingEX{

	public void calculate(int a,int b) {
		super.calculate(10, 20);
		int c=a-b;
		System.out.println("Difference = "+c);
	}
	public void calculation()
	{
		super.calculation();
		int a=10;
		int b=1;
		int c=a-b;
		System.out.println("Difference = "+c);
	}
	public static void main(String[] args) {
		
		OverridingChild obj = new OverridingChild();
		obj.calculate(10, 5);
		obj.calculation();
		
	}

}
