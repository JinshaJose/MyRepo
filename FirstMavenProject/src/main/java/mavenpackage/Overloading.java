package mavenpackage;

public class Overloading {
	
	public Overloading()
	{
		System.out.println("Hello");
	}
	public Overloading(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj=new Overloading(10,20);
		Overloading obj1=new Overloading();
		
	}

}
