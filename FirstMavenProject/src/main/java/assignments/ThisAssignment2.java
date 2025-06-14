package assignments;

public class ThisAssignment2 {
	
	int num;
	int fact;
	
	public void calculate(int num)
	{
		this.num=num;
		this.fact=1;
		
		for(int i=1;i<=num;i++)
		{
		this.fact=this.fact*i;
		}
		
		this.print();
	}
	public void print()
	{
		
		System.out.println("Factorial of "+num+" = "+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAssignment2 obj = new ThisAssignment2();
		obj.calculate(6);
	}

}
