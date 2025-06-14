package assignments;
public class Assignment1 {
	static String stName;
	static int mar1;
	static int mar2;
	static int mar3;
	static int total;
	public Assignment1(String name,int sub1,int sub2,int sub3)
	{
		stName=name;
		mar1=sub1;
		mar2=sub2;
		mar3=sub3;
	}
	public static int totalmarks()
	{
		int total=mar1+mar2+mar3;
		return total;	
	}
	public static void grade(int a)
	{
		if (a>=200)
		{
			System.out.println("Grade of "+stName+" = Grade A");
		}
		else if(a>=100&&total<200)
		{
			System.out.println("Grade of "+stName+" = Grade B");
		}
		else
		{
			System.out.println("Grade of "+stName+" = Grade C");
		}
	}
	public static void main(String[] args) {
		Assignment1 obj = new Assignment1("Jinsha",90,10,20);
		int x=Assignment1.totalmarks();
		System.out.println("Total mark of "+stName+" = "+x);
		Assignment1.grade(x);
		Assignment1 obj1 = new Assignment1("Sarah",85,95,90);
		int y=Assignment1.totalmarks();
		System.out.println("Total mark of "+stName+" = "+y);
		Assignment1.grade(y);
	}
}
