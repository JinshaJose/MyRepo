package assignments;

public class Assignment3 {
	public void area()
	{
		int r=10;
		double area = 3.14*r*r;
		System.out.println("Area of Circle = "+area);
	}
	public void area(int a)
	{
		int area = a*a;
		System.out.println("Area of Square = "+area);
	}
	public void area(int l,int b)
	{
		int area = l*b;
		System.out.println("Area of Rectangle = "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3 obj = new Assignment3();
		obj.area();
		obj.area(10);
		obj.area(10, 20);

	}

}
